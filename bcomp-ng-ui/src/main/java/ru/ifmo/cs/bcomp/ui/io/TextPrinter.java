/*
 * $Id$
 */

package ru.ifmo.cs.bcomp.ui.io;

import ru.ifmo.cs.bcomp.IOCtrl;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;

import static ru.ifmo.cs.bcomp.ui.components.DisplayStyles.FONT_COURIER_BOLD_21;

/**
 *
 * @author Dmitry Afanasiev <KOT@MATPOCKuH.Ru>
 */
public class TextPrinter extends OutputDevice {
    private JTextArea text = null;
    private String charset = null;

    public TextPrinter(IOCtrl ioctrl) {
        super(ioctrl, "printer");
    }

    @Override
    protected Component getContent() {
        JPanel content = new JPanel(new BorderLayout());

        text = new JTextArea(10, 40);
        text.setFont(FONT_COURIER_BOLD_21);
        text.setEditable(false);

        JScrollPane sp = new JScrollPane(text);
        content.add(BorderLayout.CENTER, sp);

        JPanel north = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JComboBox charsetbox = new JComboBox(new String[] {charset = "KOI8-R", "ISO8859-5", "CP866", "CP1251"});
        charsetbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox source = (JComboBox) e.getSource();
                charset = (String)source.getSelectedItem();
            }
        });
        north.add(new JLabel("Кодировка"));
        north.add(charsetbox);

        north.add(new JLabel("Задержка"));
        north.add(getSleepSlider());

        north.add(getPowerChkBox());
        north.add(new FlagIndicator(ioctrl, 30));

        content.add(BorderLayout.NORTH, north);

        return content;
    }

    @Override
    protected void actionPerformed(long value) {
        if (value == 0) {
            text.setText("");
        } else if (value == 8) {
            try {
                text.setText(text.getText(0, text.getText().length() - 1));
            } catch (BadLocationException e) { }
        } else {
            byte[] array = new byte[] { (byte)value };
            try {
                text.append(new String(array, charset));
            } catch (UnsupportedEncodingException ex) { }
        }
    }
}