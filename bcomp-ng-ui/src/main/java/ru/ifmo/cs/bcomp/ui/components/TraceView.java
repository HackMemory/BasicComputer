package ru.ifmo.cs.bcomp.ui.components;


import ru.ifmo.cs.bcomp.CPU;
import ru.ifmo.cs.bcomp.ControlSignal;
import ru.ifmo.cs.bcomp.Reg;
import ru.ifmo.cs.bcomp.Utils;
import ru.ifmo.cs.bcomp.ui.GUI;
import ru.ifmo.cs.components.DataDestination;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import static ru.ifmo.cs.bcomp.ui.components.DisplayStyles.*;


public class TraceView extends BCompPanel {

    private static boolean printRegsTitle = true;
    private GUI gui;
    private static CPU cpu;
    private final ComponentManager cmanager;
    private static JTextPane text;
    private StringBuilder stringRegsCsv = new StringBuilder();

    private String getReg(Reg reg) {
        return Utils.toHex(cpu.getRegValue(reg), cpu.getRegWidth(reg));
    }

    private static Reg[] printRegs = new Reg[]{ Reg.IP, Reg.CR, Reg.AR, Reg.DR, Reg.SP, Reg.BR, Reg.AC };
    public String printRegsTitle() {
        if (!printRegsTitle)
            return "";

        StringBuilder stringBuilderCsv = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Адр\t" + (cpu.getClockState() ? "Знчн" : "МК"));
        stringBuilderCsv.append("Адр," + (cpu.getClockState() ? "Знчн" : "МК"));
        for (Reg reg : printRegs) {
            int width = (int) Math.ceil(cpu.getRegWidth(reg) / 4.0);
            int l = (int) Math.ceil((width - reg.name().length()) / 2.0);
            stringBuilder.append(String.format("\t%s", reg.name()));
            stringBuilderCsv.append(String.format(",%s", reg.name()));
        }
        stringBuilder.append("\tNZVC" + (cpu.getClockState() ? "\tАдр" + "\tЗнчн" : "\tСчМК") + "\n");
        stringBuilderCsv.append(",NZVC" + (cpu.getClockState() ? ",Адр,Знчн" : "СчМК") + "\n");
        printRegsTitle = false;

        setTrace(stringBuilder.toString());
        return stringBuilderCsv.toString();
    }

    private String printRegs(String add, String addCsv) {

        StringBuilder stringBuilderRegsCsv = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append((cpu.getClockState() ? getMemory(savedPointer) + "\t"  :  Utils.toHex(savedPointer, 8) +
                Utils.toHex(cpu.getMicroCode().getValue(savedPointer), 40) + "\t" ) );

        stringBuilderRegsCsv.append((cpu.getClockState() ? getMemoryCsv(savedPointer) + ","  :  Utils.toHex(savedPointer, 8) + "," +
                Utils.toHex(cpu.getMicroCode().getValue(savedPointer), 40) + "," ) );

        for (Reg reg : printRegs) {
            stringBuilder.append(getReg(reg) + "\t");
            stringBuilderRegsCsv.append(getReg(reg) + ",");
        }

        stringBuilder.append(Utils.toBinary(cpu.getRegValue(Reg.PS) & 0xF,4)
                + (cpu.getClockState() ? add :  getReg(Reg.MP)) + "\n");

        stringBuilderRegsCsv.append(Utils.toBinary(cpu.getRegValue(Reg.PS) & 0xF,4)
                + (cpu.getClockState() ? addCsv :  getReg(Reg.MP)) + "\n");


        setTrace(stringBuilder.toString());
        return stringBuilderRegsCsv.toString();
    }

    private final ArrayList<Long> writelist = new ArrayList<Long>();
    private volatile long savedPointer;
    private volatile boolean printOnStop = true;
    private volatile int sleep = 0;
    private int sleeptime = 0;

    private String getMemory(long addr) {
        return Utils.toHex(addr, 11) + "\t" + Utils.toHex(cpu.getMemory().getValue(addr), 16);
    }

    private String getMemoryCsv(long addr) {
        return Utils.toHex(addr, 11) + "," + Utils.toHex(cpu.getMemory().getValue(addr), 16);
    }


    public TraceView(final GUI gui) {
        super (gui.getComponentManager(),null,null);
        this.gui = gui;
        this.cpu = gui.getCPU();
        this.cmanager = gui.getComponentManager();

        JPanel mainPanel = new JPanel();
        JPanel bottomButtons = new JPanel();

        add(mainPanel);
        mainPanel.setLayout(new BorderLayout());
        bottomButtons.setLayout(new FlowLayout(FlowLayout.LEFT));

        mainPanel.add(bottomButtons, BorderLayout.SOUTH);

        text = new JTextPane();
        text.setFont(FONT_COURIER_BOLD_21);
        text.setBackground(COLOR_BACKGROUND_STYLE);
        text.setForeground(Color.WHITE);

        JScrollPane scroll = new JScrollPane(text);
        scroll.setBounds(TEXTAREA_X, TEXTAREA_Y, TEXTAREA_WIDTH, TEXTAREA_HEIGHT);
        mainPanel.add(scroll, BorderLayout.CENTER);

        JButton button = new JButton("Выполнить трассировку");
        button.setForeground(COLOR_TEXT);
        button.setBackground(COLOR_VALUE);
        button.setFont(FONT_COURIER_PLAIN_12);
        button.setBounds(625, 1, 200, BUTTONS_HEIGHT);
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printRegsTitle = true;
                text.setText("");

                cpu.addDestination(ControlSignal.STOR, new DataDestination() {
                    @Override
                    public void setValue(long value) {
                        long addr = cpu.getRegValue(Reg.AR);

                        if (!writelist.contains(addr)) // Saving changed mem addr to print later
                            writelist.add(addr);
                    }
                });


                cpu.setCPUStartListener(new Runnable() {
                    @Override
                    public void run() {
                        if (!printOnStop)
                            return;
                        writelist.clear();
                        savedPointer = cpu.getRegValue(cpu.getClockState() ? Reg.IP : Reg.MP);
                        stringRegsCsv.append(printRegsTitle());
                    }
                });

                cpu.setCPUStopListener(new Runnable() { // Print changed mem
                    @Override
                    public void run() {
                        if (!printOnStop)
                            return;

                        Long _addr = 0L;
                        if(!writelist.isEmpty()) _addr = writelist.remove(0);

                        stringRegsCsv.append(printRegs(    (_addr==0L ? "" : "\t" + getMemory(_addr)),    (_addr==0L ? "" : "," + getMemoryCsv(_addr)))  );
                        for (Long wraddr : writelist) {
                            setTrace(String.format(",%1$34s", "\t") + getMemory(wraddr) + "\n");
                            stringRegsCsv.append(String.format(",%1$34s", ",") + getMemoryCsv(wraddr) + "\n");
                            //stringBuilderRegsCsv.append(String.format(",%1$34s", ",") + getMemoryCsv(wraddr) + "\n");
                        }
                    }
                });

                cpu.setTickFinishListener(new Runnable() {
                    @Override
                    public void run() {
                        if (sleep <= 0)
                            return;

                        try {
                            Thread.sleep(sleep);
                        } catch (InterruptedException e) { /*totally not empty*/ }
                    }
                });

                sleep = sleeptime;
                cpu.startStart();
                cpu.startContinue();

                cpu.executeContinue();
                while ( !Long.toHexString(cpu.getRegValue(Reg.CR)).equals("100") ) {
                    System.out.println(Long.toHexString( cpu.getRegValue(Reg.CR)));
                    cpu.executeContinue();
                }
            }
        });
        mainPanel.add(button, BorderLayout.EAST);

        final JTextField textField = new JTextField("", 10);
        bottomButtons.add(textField);

        JButton btn1 = new JButton("Задать адрес началы программы");
        btn1.setForeground(COLOR_TEXT);
        btn1.setBackground(COLOR_VALUE);
        btn1.setFont(FONT_COURIER_PLAIN_12);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer value = Integer.parseInt(textField.getText(), 16);
                cpu.getRegister(Reg.IR).setValue(value);
                cpu.executeSetAddr();
                setTrace("IP установлен на 0x" + Integer.toHexString(value) + "\n");
            }
        });

        bottomButtons.add(btn1);

        JButton btn2 = new JButton("Экспорт в CSV-файл");
        btn2.setForeground(COLOR_TEXT);
        btn2.setBackground(COLOR_VALUE);
        btn2.setFont(FONT_COURIER_PLAIN_12);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int retval = fileChooser.showSaveDialog(gui);
                if (retval == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    if (file == null) {
                        return;
                    }
                    if (!file.getName().toLowerCase().endsWith(".csv")) {
                        file = new File(file.getParentFile(), file.getName() + ".csv");
                    }
                    try {
                        BufferedWriter writer = null;
                        try {
                            writer = new BufferedWriter(new FileWriter(file));
                            writer.write('\ufeff');
                            writer.write(stringRegsCsv.toString());
                        } finally {
                            if (writer != null) writer.close();
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        bottomButtons.add(btn2);



    }

    @Override
    public void stepStart(){

    }

    @Override
    public void stepFinish(){

    }

    public static void setTrace(String str){
        try {
            StyleContext sc = StyleContext.getDefaultStyleContext();
            AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.WHITE);

            int len = text.getDocument().getLength();
            text.setCaretPosition(len);
            text.setCharacterAttributes(aset, false);
            text.replaceSelection(str);
            //Document doc = text.getDocument();
            //doc.insertString(doc.getLength(), str, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getPanelName() {
        return "Трассировка";
    }

    @Override
    public void redrawArrows() {

    }
}
