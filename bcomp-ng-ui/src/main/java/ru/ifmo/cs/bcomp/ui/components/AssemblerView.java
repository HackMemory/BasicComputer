/*
 * $Id$
 */

package ru.ifmo.cs.bcomp.ui.components;

import ru.ifmo.cs.bcomp.CPU;
import ru.ifmo.cs.bcomp.ProgramBinary;
import ru.ifmo.cs.bcomp.assembler.AsmNg;
import ru.ifmo.cs.bcomp.assembler.Program;
import ru.ifmo.cs.bcomp.ui.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ru.ifmo.cs.bcomp.ui.components.DisplayStyles.*;

/**
 *
 * @author Dmitry Afanasiev <KOT@MATPOCKuH.Ru>
 */
public class AssemblerView extends BCompPanel {
	private final GUI gui;
	private final CPU cpu;
	private final ComponentManager cmanager;
	private final JTextArea text;

	public AssemblerView(final GUI gui) {
		super (gui.getComponentManager(),null,null);

		this.gui = gui;
		this.cpu = gui.getCPU();
		this.cmanager = gui.getComponentManager();

		JPanel mainPanel = new JPanel();

		add(mainPanel);
		mainPanel.setLayout(new BorderLayout());

		text = new JTextArea();
		text.setFont(FONT_COURIER_BOLD_21);
		text.setBackground(COLOR_BACKGROUND_STYLE);
		text.setForeground(Color.WHITE);

		JScrollPane scroll = new JScrollPane(text);
		scroll.setBounds(TEXTAREA_X, TEXTAREA_Y, TEXTAREA_WIDTH, TEXTAREA_HEIGHT);
		mainPanel.add(scroll, BorderLayout.CENTER);

		JButton button = new JButton("Компилировать");
		button.setForeground(COLOR_TEXT);
		button.setBackground(COLOR_VALUE);
		button.setFont(FONT_COURIER_PLAIN_12);
		button.setBounds(625, 1, 200, BUTTONS_HEIGHT);
		button.setFocusable(false);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cpu.isLocked()) {
					showError("Для компиляции остановите выполняющуюся программу");
					return;
				}

				cmanager.saveDelay();
				boolean clock = cpu.getClockState();
				cpu.setClockState(true);

				try {
                                        AsmNg asm = new AsmNg(text.getText());
                                        Program pobj = asm.compile();
                                        gui.getBasicComp().loadProgram(new ProgramBinary(pobj.getBinaryFormat()));
				} catch (Exception ex) {
					showError(ex.getMessage());
				}

				cpu.setClockState(clock);
				cmanager.clearActiveSignals();
				cmanager.restoreDelay();
			}
		});
		mainPanel.add(button, BorderLayout.SOUTH);
	}

	@Override
	public void stepStart() {

	}

	@Override
	public void stepFinish(){

	}

	@Override
	public void panelActivate() {
		text.requestFocus();
	}

	@Override
	public void panelDeactivate() { }

	@Override
	public String getPanelName() {
		return "Ассемблер";
	}

	private void showError(String msg) {
		JOptionPane.showMessageDialog(gui, msg, "Ошибка", JOptionPane.ERROR_MESSAGE);
	}

    @Override
    public void redrawArrows() {
        //no arrows no draw
    }
}
