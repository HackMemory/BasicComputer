/*
 * $Id$
 */

package ru.ifmo.cs.bcomp.ui.components;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.Theme;
import org.fife.ui.rtextarea.RTextScrollPane;
import ru.ifmo.cs.bcomp.CPU;
import ru.ifmo.cs.bcomp.ProgramBinary;
import ru.ifmo.cs.bcomp.assembler.AsmNg;
import ru.ifmo.cs.bcomp.assembler.Program;
import ru.ifmo.cs.bcomp.ui.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;

import static ru.ifmo.cs.bcomp.ui.components.DisplayStyles.*;

/**
 *
 * @author Dmitry Afanasiev <KOT@MATPOCKuH.Ru>
 */
public class AssemblerView extends BCompPanel implements ActionListener {
	private final GUI gui;
	private final CPU cpu;
	private final ComponentManager cmanager;
	private final RSyntaxTextArea  text;
	private final JTextArea errorarea;



	public AssemblerView(final GUI gui) {
		super (gui.getComponentManager(),null,null);
		this.gui = gui;
		this.cpu = gui.getCPU();
		this.cmanager = gui.getComponentManager();

		JPanel pane = new JPanel(new BorderLayout());
		pane.setBackground(COLOR_BACKGROUND);

		text = new RSyntaxTextArea();
		text.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_ASSEMBLER_X86);
		text.setCodeFoldingEnabled(true);
		text.setBackground(COLOR_BACKGROUND);
		text.setForeground(COLOR_TEXT);
		RTextScrollPane  scroll = new RTextScrollPane(text);
		pane.add(scroll,BorderLayout.CENTER);
		Theme theme = null;
		try {
			theme = Theme.load(DisplayStyles.class.getClassLoader().getResourceAsStream("dark.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		theme.apply(text);

		JButton button = new JButton(cmanager.getRes().getString("compile"));
		button.setForeground(COLOR_TEXT);
		button.setBackground(COLOR_VALUE);
		button.setFont(FONT_COURIER_PLAIN_12);
		button.setFocusable(false);
		button.addActionListener(this);
		JPanel buttonpane = new JPanel();
		//buttonpane.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		buttonpane.add(button);
		//button.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pane.add(buttonpane,BorderLayout.PAGE_START);
		errorarea = new JTextArea();
		//errorarea.setRows(3);
		errorarea.setEditable(false);
		errorarea.setBackground(COLOR_BACKGROUND);
		errorarea.setForeground(COLOR_TEXT);
		JScrollPane errscroll = new JScrollPane(errorarea);
		errscroll.setBackground(COLOR_BACKGROUND);
		pane.add(errscroll,BorderLayout.SOUTH);

		JSplitPane splitpane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, pane, errscroll);
		splitpane.setDividerSize(4);
		splitpane.setDividerLocation((int)(PANE_HEIGHT*0.8)); // TODO FIX ALL Layouts
		add(splitpane);

	}

	@Override
	public void panelActivate() {
		text.requestFocus();
	}

	@Override
	public void panelDeactivate() { }

	@Override
	public String getPanelName() {
		return cmanager.getRes().getString("assembler");
	}

	private void showError(String msg) {
		JOptionPane.showMessageDialog(gui, msg, cmanager.getRes().getString("error"), JOptionPane.ERROR_MESSAGE);
	}

	@Override
	public void redrawArrows() {
		//no arrows no draw
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (cpu.isLocked()) {
			showError(cmanager.getRes().getString("stopRunning"));
			return;
		}

		cmanager.saveDelay();
		boolean clock = cpu.getClockState();
		cpu.setClockState(true);
		long starttime = System.currentTimeMillis();
		AsmNg asm = new AsmNg(text.getText());
		Program pobj = asm.compile();
		long finishtime = System.currentTimeMillis();
		String errors = new String();
		String st = "Start compilation at "+new Date(starttime)+"\n";
		String ft = "Finish compilation at "+new Date(finishtime)+"\n";
		errors = st;
		for (String err: asm.getErrors()) {
			errors = errors + err + '\n';
		}

		errors = errors + ft;
		if(asm.getErrors().isEmpty()) errors = errors + "\n" + pobj.toCompiledWords();

		errorarea.setText(errors);
		if (pobj != null) {
			gui.getBasicComp().loadProgram(new ProgramBinary(pobj.getBinaryFormat()));
		}

		cpu.setClockState(clock);
		cmanager.clearActiveSignals();
		cmanager.restoreDelay();
	}

	@Override
	public void paintComponent(Graphics g) {

	}
}

