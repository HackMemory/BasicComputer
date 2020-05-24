package ru.ifmo.cs.bcomp.ui.components;

import ru.ifmo.cs.bcomp.CPU;
import ru.ifmo.cs.bcomp.Reg;
import ru.ifmo.cs.bcomp.ui.GUI;
import ru.ifmo.cs.components.Memory;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class DebugView extends BCompPanel implements ActionListener {
    private final Memory memory;
    private final CPU cpu;
    private Field memoryArray;

    private Component dumpComponent;
    private Component watchesComponent;
    private Component breakpointsComponent; // TODO: add breakpoints

    private long[] dump = new long[0x800];
    private final ArrayList<Integer> watches;
    private int selectedWatch = -1;
    private int watchAddress = -1;


    private final Font font = new Font("Roboto", Font.PLAIN, 24);

    public DebugView(GUI gui) {
        super(gui.getComponentManager(), null, null);
        this.setFont(font);
        this.cpu = gui.getCPU();
        this.memory = cpu.getMemory();
        this.watches = new ArrayList<>(0);
        this.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                DebugView.this.dumpComponent = DebugView.this.renderDumpComponent();
                DebugView.this.watchesComponent = DebugView.this.renderWatchesComponent();
                // TODO: add breakpoints
//                DebugView.this.breakpointsComponent = DebugView.this.renderBreakpointsComponent();
                DebugView.this.removeAll();
                DebugView.this.add(DebugView.this.renderMainComponent());
            }

            @Override
            public void componentMoved(ComponentEvent componentEvent) {

            }

            @Override
            public void componentShown(ComponentEvent componentEvent) {

            }

            @Override
            public void componentHidden(ComponentEvent componentEvent) {

            }
        });

        try {
            this.memoryArray = Memory.class.getDeclaredField("memory");
            memoryArray.setAccessible(true);

            this.dumpMemory();
            this.dumpComponent = renderDumpComponent();
            this.watchesComponent = renderWatchesComponent();
            // TODO: add breakpoints
//            this.breakpointsComponent = renderBreakpointsComponent();

            setLayout(new BorderLayout());
            add(renderMainComponent());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private Component renderMainComponent() {
        JPanel main = new JPanel();
        main.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.weighty = 1;
        c.weightx = 0.25;

        // Mounting watches component
        c.gridy = 0;
        main.add(watchesComponent, c);

        // Mounting breakpoints panel
        // TODO: add breakpoints
//        c.weighty = 0.5;
//        c.gridy = 1;
//        main.add(breakpointsComponent, c);

        // Mounting memory dump panel
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1;
        c.gridheight = 2;
        main.add(dumpComponent, c);

        return main;
    }

    private Component renderDumpComponent() {
        JPanel dump = new JPanel();

        dump.setLayout(new BorderLayout());

        JLabel panelLabel = new JLabel("Memory dump", SwingConstants.CENTER);
        panelLabel.setFont(this.font.deriveFont(Font.BOLD));
        dump.add(panelLabel, BorderLayout.PAGE_START);

        String[] humanReadableDump = new String[this.dump.length];
        for (int address = 0x000; address < this.dump.length; address++) {
            humanReadableDump[address] = String.format(
                    "%03X: %04X    ", address, this.dump[address]);
        }

        JList<String> cells = new JList<>(humanReadableDump);
        cells.setFont(this.font);
        cells.setLayoutOrientation(JList.VERTICAL_WRAP);
        cells.setVisibleRowCount(this.getHeight() / (int) (getFontMetrics(this.font).getHeight() * 1.2));

        dump.add(new JScrollPane(cells));

        return dump;
    }

    private Component renderWatchesComponent() {
        JPanel watches = new JPanel();
        watches.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.weightx = 1;


        JLabel panelLabel = new JLabel("Watches", SwingConstants.CENTER);
        panelLabel.setFont(this.font.deriveFont(Font.BOLD));
        c.fill = GridBagConstraints.BOTH;
        c.gridy = 0;
        watches.add(panelLabel, c);

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout());

        JButton addWatch = new JButton("+");
        addWatch.setEnabled(false);
        addWatch.setFocusable(false);   // Magic: this line makes the button work every time
        addWatch.addActionListener(actionEvent -> {
            DebugView.this.watches.add(DebugView.this.watchAddress);
            DebugView.this.watchesComponent = DebugView.this.renderWatchesComponent();
            DebugView.this.removeAll();
            DebugView.this.add(DebugView.this.renderMainComponent());
        });

        JButton removeWatch = new JButton("-");
        removeWatch.setEnabled(false);
        removeWatch.addActionListener(actionEvent -> {
            DebugView.this.watches.remove(DebugView.this.selectedWatch);
            DebugView.this.watchesComponent = DebugView.this.renderWatchesComponent();
            DebugView.this.removeAll();
            DebugView.this.add(DebugView.this.renderMainComponent());
        });

        String addressFieldPlaceholder = "Address";
        JFormattedTextField addressField = new JFormattedTextField(addressFieldPlaceholder);
        addressField.getDocument().addDocumentListener(new DocumentListener() {
            void handleNewValue() {
                try {
                    DebugView.this.watchAddress = Integer.parseInt(addressField.getText(), 16);
                    addWatch.setEnabled(DebugView.this.watchAddress >= 0 && DebugView.this.watchAddress < DebugView.this.dump.length);
                } catch (NumberFormatException e) {
                    addWatch.setEnabled(false);
                }
            }

            @Override
            public void insertUpdate(DocumentEvent documentEvent) {
                handleNewValue();
            }

            @Override
            public void removeUpdate(DocumentEvent documentEvent) {
                handleNewValue();
            }

            @Override
            public void changedUpdate(DocumentEvent documentEvent) {
                handleNewValue();
            }
        });
        addressField.setForeground(Color.GRAY);
        addressField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (addressField.getText().equals(addressFieldPlaceholder)) {
                    addressField.setText("");
                    addressField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (addressField.getText().isEmpty()) {
                    addressField.setForeground(Color.GRAY);
                    addressField.setText(addressFieldPlaceholder);
                }
            }
        });


        buttons.add(addressField);
        buttons.add(addWatch);
        buttons.add(removeWatch);

        c.gridy = 1;
        watches.add(buttons, c);

        ArrayList<String> humanReadableWatches = new ArrayList<>();
        humanReadableWatches.add(String.format("IP : %03X", cpu.getRegister(Reg.IP).getValue()));
        humanReadableWatches.add(String.format("SP : %03X", cpu.getRegister(Reg.SP).getValue()));
        humanReadableWatches.add(String.format("AR : %03X", cpu.getRegister(Reg.AR).getValue()));
        humanReadableWatches.add(String.format("DR : %04X", cpu.getRegister(Reg.DR).getValue()));
        humanReadableWatches.add(String.format("CR : %04X", cpu.getRegister(Reg.CR).getValue()));
        humanReadableWatches.add(String.format("AC : %04X", cpu.getRegister(Reg.AC).getValue()));
        humanReadableWatches.add(String.format("BR : %04X", cpu.getRegister(Reg.BR).getValue()));

        final int staticWatchCount = humanReadableWatches.size();

        for (int watch : this.watches) {
            humanReadableWatches.add(String.format("%03X: %04X", watch, this.dump[watch]));
        }

        JList<String> watchesList = new JList<>(humanReadableWatches.toArray(new String[]{}));
        watchesList.setFont(this.font);
        watchesList.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                DebugView.this.selectedWatch = watchesList.getSelectedIndex() - staticWatchCount;
                removeWatch.setEnabled(DebugView.this.selectedWatch >= 0);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        c.weighty = 1;
        c.gridy = 2;
        watches.add(new JScrollPane(watchesList), c);

        return watches;
    }

    // TODO: add breakpoints
    private Component renderBreakpointsComponent() {
        JPanel breakpoints = new JPanel();

        JLabel panelLabel = new JLabel("Breakpoints", SwingConstants.CENTER);
        panelLabel.setFont(this.font.deriveFont(Font.BOLD));
        breakpoints.add(panelLabel, BorderLayout.PAGE_START);

        return breakpoints;
    }

    // Full memory dump can take a long time
    private void dumpMemory() {
        try {
            this.dump = (long[]) memoryArray.get(this.memory);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void panelActivate() {
        dumpMemory();
        this.dumpComponent = renderDumpComponent();
        this.watchesComponent = renderWatchesComponent();
        this.removeAll();
        this.add(renderMainComponent());
    }

    @Override
    public void panelDeactivate() {

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public String getPanelName() {
        return "Отладка";
    }

    @Override
    public void redrawArrows() {

    }
}
