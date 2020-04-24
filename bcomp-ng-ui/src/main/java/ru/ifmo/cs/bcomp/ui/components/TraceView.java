package ru.ifmo.cs.bcomp.ui.components;


import ru.ifmo.cs.bcomp.CPU;
import ru.ifmo.cs.bcomp.ControlSignal;
import ru.ifmo.cs.bcomp.Reg;
import ru.ifmo.cs.bcomp.ui.GUI;
import ru.ifmo.cs.components.DataDestination;
import ru.ifmo.cs.components.Utils;

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

//боже, не смотри сюда, тут какой-то трэш

public class TraceView extends BCompPanel implements ActionListener {

    private static boolean printRegsTitle = true;
    private GUI gui;
    private static CPU cpu;
    private final ComponentManager cmanager;
    private static JTextPane text;
    private StringBuilder stringRegsCsv = new StringBuilder();

    private final ArrayList<Long> writelist = new ArrayList<Long>();
    private volatile long savedPointer;
    private volatile boolean printOnStop = true;
    private volatile int sleep = 0;
    private int sleeptime = 5;

    private boolean isRun = false;

    private String getReg(Reg reg) {
        return Utils.toHex(cpu.getRegValue(reg), cpu.getRegWidth(reg));
    }

    private static Reg[] printRegs = new Reg[]{ Reg.IP, Reg.CR, Reg.AR, Reg.DR, Reg.SP, Reg.BR, Reg.AC, Reg.PS };
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
        JPanel leftPanel = new JPanel();
        JPanel bottomButtons = new JPanel();

        add(mainPanel);
        mainPanel.setLayout(new BorderLayout());
        bottomButtons.setLayout(new FlowLayout(FlowLayout.LEFT));

        GridBagLayout gbl = new GridBagLayout();
        leftPanel.setLayout(gbl);

        GridBagConstraints c =  new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTH;
        c.fill   = GridBagConstraints.BOTH;
        c.gridheight = 1;
        c.gridwidth  = GridBagConstraints.REMAINDER;
        c.gridx = GridBagConstraints.RELATIVE;
        c.gridy = GridBagConstraints.RELATIVE;
        c.insets = new Insets(0, 0, 0, 0);
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 0.0;
        c.weighty = 0.0;

        mainPanel.add(bottomButtons, BorderLayout.SOUTH);
        mainPanel.add(leftPanel, BorderLayout.EAST);

        text = new JTextPane();
        text.setFont(FONT_COURIER_BOLD_21);
        text.setBackground(COLOR_BACKGROUND);
        text.setForeground(COLOR_TEXT);
        text.setCaretColor(COLOR_TEXT);

        JScrollPane scroll = new JScrollPane(text);
        scroll.setBounds(TEXTAREA_X, TEXTAREA_Y, TEXTAREA_WIDTH, TEXTAREA_HEIGHT);
        mainPanel.add(scroll, BorderLayout.CENTER);




        //left
        JTextField sleepTb = new JTextField(String.valueOf(sleeptime));
        c.insets = new Insets(15, 0, 0, 0);
        gbl.setConstraints(sleepTb, c);
        leftPanel.add(sleepTb);

        JButton sleepBtn = new JButton("Задать задержку");
        sleepBtn.setForeground(COLOR_TEXT);
        sleepBtn.setBackground(COLOR_VALUE);
        sleepBtn.setFont(FONT_COURIER_PLAIN_12);
        sleepBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sleep = Integer.parseInt(sleepTb.getText());
                setTrace("Задержка установлена на " + sleep + "\n");
            }
        });
        c.insets = new Insets(5, 0, 20, 0);
        gbl.setConstraints(sleepBtn, c);
        leftPanel.add(sleepBtn);


        JButton button = new JButton("Выполнить трассировку");
        button.setForeground(COLOR_TEXT);
        button.setBackground(COLOR_VALUE);
        button.setFont(FONT_COURIER_PLAIN_12);
        button.setBounds(625, 1, 200, BUTTONS_HEIGHT);
        button.setFocusable(false);

        Thread cpuRun = new Thread(() -> {
            cpu.startStart();
            cpu.startContinue();

            cpu.executeContinue();
            while (true) {
                if (!Long.toHexString(cpu.getRegValue(Reg.CR)).equals("100") && isRun)
                    cpu.executeContinue();
                else {
                    isRun = false;
                    button.setText("Выполнить трассировку");
                }
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!isRun) {
                    printRegsTitle = true;
                    isRun = true;
                    text.setText("");
                    stringRegsCsv.setLength(0);
                    button.setText("Остановить");


                    cpu.addDestination(ControlSignal.STOR, new DataDestination() {
                        @Override
                        public void setValue(long value) {
                            long addr = cpu.getRegValue(Reg.AR);

                            if (!writelist.contains(addr))
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

                    cpu.setCPUStopListener(new Runnable() {
                        @Override
                        public void run() {
                            if (!printOnStop)
                                return;

                            Long _addr = 0L;
                            if (!writelist.isEmpty()) _addr = writelist.remove(0);

                            stringRegsCsv.append(printRegs((_addr == 0L ? "" : "\t" + getMemory(_addr)), (_addr == 0L ? "" : "," + getMemoryCsv(_addr))));
                            for (Long wraddr : writelist) {
                                System.out.println(wraddr);
                                setTrace(String.format(",%1$34s", "\t") + getMemory(wraddr) + "\n");
                                stringRegsCsv.append(String.format(",%1$34s", ",") + getMemoryCsv(wraddr) + "\n");
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
                    cpuRun.start();
                } else {
                    button.setText("Выполнить трассировку");
                    isRun = false;
                }
            }
        });
        c.weighty = 1.0;
        gbl.setConstraints(button, c);
        leftPanel.add(button);

        JTextField textField = new JTextField("", 10);
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
                            if (writer != null){
                                writer.close();
                            }
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        bottomButtons.add(btn2);



        JButton btn3 = new JButton("Нажми на меня...");
        btn3.setForeground(COLOR_TEXT);
        btn3.setBackground(COLOR_VALUE);
        btn3.setFont(FONT_COURIER_PLAIN_12);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "1) Всегда указывайте адрес начала программы\n2) В программе обязательно должен быть HLT, чтобы БЭВМ тупа не завис (мне лень просто делать какие-то проверки)\n3) Вроде все :D");
            }
        });

        bottomButtons.add(btn3);
    }

    public static void setTrace(String str){
        try {
            StyleContext sc = StyleContext.getDefaultStyleContext();
            AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, Color.WHITE);

            int len = text.getDocument().getLength();
            text.setCaretPosition(len);
            text.setCharacterAttributes(aset, false);
            text.replaceSelection(str);
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
        //no arrows no draw
    }

    @Override
    public void panelActivate() {
        text.requestFocus();

    }

    @Override
    public void panelDeactivate() {
        if(!isRun)
            sleep = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
