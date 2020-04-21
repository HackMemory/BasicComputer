/*
 * $Id$
 */

package ru.ifmo.cs.bcomp.ui.components;

import ru.ifmo.cs.bcomp.*;
import ru.ifmo.cs.bcomp.ui.GUI;
import ru.ifmo.cs.components.DataDestination;
import ru.ifmo.cs.components.Utils;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;

import static ru.ifmo.cs.bcomp.ControlSignal.*;
import static ru.ifmo.cs.bcomp.Reg.*;
import static ru.ifmo.cs.bcomp.ui.components.DisplayStyles.*;

/**
 *
 * @author Dmitry Afanasiev <KOT@MATPOCKuH.Ru>
 */
public class ComponentManager {
	private class SignalHandler implements DataDestination {
		private final ControlSignal signal;

		public SignalHandler(ControlSignal signal) {
			this.signal = signal;
		}

		public void setValue(long value) {
			openBuses.add(signal);
		}
	}

	private class ButtonProperties {
		 final String[] texts;
		public final ActionListener listener;

		public ButtonProperties(String[] texts, ActionListener listener) {
			this.texts = texts;
			this.listener = listener;
		}
	}

	private JRadioButton rbRanStop;
	private JRadioButton rbTact;
	private class ButtonsPanel extends JComponent {

		public ButtonsPanel() {
			setBounds(0, BUTTONS_Y, PANE_WIDTH, BUTTONS_HEIGHT);
			setLayout(new GridBagLayout());
			GridBagConstraints constraints = new GridBagConstraints() {{
				anchor = GridBagConstraints.WEST;
				fill = GridBagConstraints.HORIZONTAL;
				gridx = 0;
				gridy = 0;
				weightx = 1;
				insets = new Insets(1, 1, 1, 1);
			}};
			buttons = new JButton[buttonProperties.length];

			for (int i = 0; i < buttons.length - 2; i++) {
				buttons[i] = new JButton(buttonProperties[i].texts[0]);
				buttons[i].setForeground(buttonColors[0]);
				buttons[i].setBackground(COLOR_VALUE);
				buttons[i].setFont(FONT_COURIER_PLAIN_12);
				buttons[i].setFocusable(false);
				buttons[i].addActionListener(buttonProperties[i].listener);
				buttons[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
				constraints.gridwidth = i == 0 ? 2 : 1;
				if (i > 0) constraints.gridy = 1;
				if (i == 2) constraints.gridx = 0;
				add(buttons[i], constraints);
				if (i == 2) constraints.gridx += 3;
				else constraints.gridx++;

			}
			constraints.gridy = 0;
			constraints.gridx = 3;
			constraints.fill = GridBagConstraints.NONE;
			constraints.anchor = GridBagConstraints.CENTER;
			rbRanStop = new JRadioButton(buttonProperties[6].texts[0]);
			rbRanStop.setFont(FONT_COURIER_PLAIN_12);
			rbRanStop.setBackground(COLOR_BACKGROUND_STYLE);
			rbRanStop.setForeground(Color.WHITE);
			rbRanStop.setBorderPainted(false);
			rbRanStop.addActionListener(buttonProperties[6].listener);
			rbRanStop.setCursor(new Cursor(Cursor.HAND_CURSOR));
			rbRanStop.setFocusPainted(false);
			rbRanStop.setFocusable(false);
			add(rbRanStop, constraints);
			constraints.gridx++;

			rbTact = new JRadioButton((buttonProperties[7].texts[0]));
			rbTact.setFont(FONT_COURIER_PLAIN_12);
			rbTact.setBackground(COLOR_BACKGROUND_STYLE);
			rbTact.setForeground(Color.WHITE);

			rbTact.setBorderPainted(false);
			rbTact.addActionListener(buttonProperties[7].listener);
			rbTact.setCursor(new Cursor(Cursor.HAND_CURSOR));
			rbTact.setFocusPainted(false);
			rbTact.setFocusable(false);
			add(rbTact, constraints);
		}
	}
	private ResourceBundle res = ResourceBundle.getBundle("ru.ifmo.cs.bcomp.ui.components.loc", Locale.getDefault());
	private Color[] buttonColors = new Color[] { Color.WHITE, COLOR_ACTIVE };
	private ButtonProperties[] buttonProperties = {
		new ButtonProperties(new String[] { res.getString("setip") }, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cmdEnterAddr();
			}
		}),
			new ButtonProperties( new String[] { res.getString("read") }, new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			cmdRead();
		}
	}),
		new ButtonProperties( new String[] { res.getString("write") }, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cmdWrite();
			}
		}),

		new ButtonProperties( new String[] { res.getString("start") }, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cmdStart();
			}
		}),
		new ButtonProperties( new String[] { res.getString("continue") }, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cmdContinue();
			}
		}),
		new ButtonProperties( new String[] { "Загрузить программу..." }, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					cmdLoadProgramm();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}),
		new ButtonProperties( new String[] { res.getString("stop"), res.getString("run") }, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cmdInvertRunState();
			}
		}),
		new ButtonProperties(new String[] { res.getString("tick") }, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cmdInvertClockState();
			}
		})
	};

	private final KeyAdapter keyListener = new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
				case KeyEvent.VK_F4:
					cmdEnterAddr();
					break;

				case KeyEvent.VK_F5:
					cmdWrite();
					break;

				case KeyEvent.VK_F6:
					cmdRead();
					break;

				case KeyEvent.VK_F7:
					cmdStart();
					break;

				case KeyEvent.VK_F8:
					cmdContinue();
					break;

				case KeyEvent.VK_F9:
					if (e.isShiftDown())
						cmdInvertClockState();
					else
						cmdInvertRunState();
					break;

				case KeyEvent.VK_F10:
					System.exit(0);
					break;

				case KeyEvent.VK_F11:
					cmdPrevDelay();
					break;

				case KeyEvent.VK_F12:
					cmdNextDelay();
					break;

				case KeyEvent.VK_Q:
					if (e.isControlDown())
						System.exit(0);
					break;
			}
		}
	};

	private static final int BUTTON_RUN = 6;
	private static final int BUTTON_CLOCK = 7;
	private JButton[] buttons;
	private ButtonsPanel buttonsPanel = new ButtonsPanel();

	private final GUI gui;
	private final BasicComp bcomp;
	private final CPU cpu;
	private final IOCtrl[] ioctrls;
	private final MemoryView mem;
	private FlagView[] flagViews = new FlagView[4];
	private EnumMap<Reg, RegisterView> regs = new EnumMap<Reg, RegisterView>(Reg.class);
	private InputRegisterView input;
	private ActiveBitView activeBit = new ActiveBitView(ACTIVE_BIT_X, REG_KEY_Y);
	private volatile BCompPanel activePanel;
	private final long[] delayPeriods = { 0, 1, 5, 10, 25, 50, 100, 1000 };
	private volatile int currentDelay = 3;
	private volatile int savedDelay;
	private final Object lockActivePanel = new Object();

	private volatile boolean cuswitch = false;
	private final SignalListener[] listeners;
	private ArrayList<ControlSignal> openBuses = new ArrayList<ControlSignal>();
	private static final ControlSignal[] busSignals = {
		RDDR, RDCR, RDIP, RDAC, RDPS, RDIR, RDBR, RDSP,
		WRDR, WRCR, WRIP, WRAC, WRPS, WRAR, WRBR, WRSP, LOAD, STOR, IO, TYPE
	};

	private final ArrayList<Long> writelist = new ArrayList<Long>();
	private volatile long savedPointer;
	private volatile boolean printOnStop = true;
	private volatile boolean printRegsTitle = false;

	private String getMemory(long addr) {
		return Utils.toHex(addr, 11) + " " + Utils.toHex(cpu.getMemory().getValue(addr), 16);
	}

	public static Runnable setTickStartListenerval = null;
	public static Runnable setTickFinishListenerval = null;
	public ComponentManager(GUI gui) {
		this.gui = gui;
		bcomp = gui.getBasicComp();
		cpu = gui.getCPU();
		input = new InputRegisterView(this, cpu.getRegister(IR)){
			@Override
			protected void setValue(String val) {
				super.setValue(val);
				//getRegisterView(IR).setValue(Utils.toBinary(cpu.getRegister(IR).getValue(),(int)input.getRegWidth()));
				getRegisterView(IR).setValue(String.format("%04X", cpu.getRegister(IR).getValue()));
			}
		};
		ioctrls = gui.getIOCtrls();

		setTickStartListenerval = new Runnable() {
			@Override
			public void run() {
				synchronized (lockActivePanel) {
					if (activePanel != null)
						activePanel.stepStart();
				}

				openBuses.clear();
			}
		};

		cpu.setTickStartListener(setTickStartListenerval);

		setTickFinishListenerval = new Runnable() {
			@Override
			public void run() {
				synchronized (lockActivePanel) {
					if (activePanel != null)
						activePanel.stepFinish();
				}

				if (delayPeriods[currentDelay] != 0)
					try {
						Thread.sleep(delayPeriods[currentDelay]);
					} catch (InterruptedException e) {
					}
			}
		};
		cpu.setTickFinishListener(setTickFinishListenerval);

		for (ControlSignal cs : busSignals)
			cpu.addDestination(cs, new SignalHandler(cs));

		for(int i = 0; i < 4; i++) {
			flagViews[i] = new FlagView(0,0,25,25);
			flagViews[i].setPreferredSize(flagViews[i].getSize());
		}
		flagViews[0].setTitle("N");flagViews[1].setTitle("Z");flagViews[2].setTitle("V");flagViews[3].setTitle("C");

		for (Reg reg : Reg.values()) {

					regs.put(reg, new RegisterView(cpu.getRegister(reg)));

		}



		listeners = new SignalListener[] {
			new SignalListener(regs.get(Reg.AR), WRAR),
			new SignalListener(regs.get(Reg.DR), WRDR, LOAD),
			new SignalListener(regs.get(Reg.CR), WRCR, IRQS),
			new SignalListener(regs.get(Reg.IP), WRIP),
			new SignalListener(regs.get(Reg.AC), WRAC),
				new SignalListener(regs.get(Reg.PS), RDPS,WRPS,SETC, SETV, STNZ, SET_EI, HALT,SET_PROGRAM),
           new SignalListener(regs.get(Reg.SP), WRSP),
           new SignalListener(regs.get(Reg.BR),WRBR)

		};



		mem = new MemoryView(cpu.getMemory(), MEM_X, MEM_Y);

		cpu.addDestination(LOAD, new DataDestination() {

			public void setValue(long value) {
				if (activePanel != null)
					mem.eventRead();
				else
					mem.updateLastAddr();
			}
		});

		cpu.addDestination(SETC, new DataDestination() {
			@Override
			public void setValue(long value) {
				flagViews[3].setActive(cpu.getProgramState(State.C) == 1);
			}
		});

		cpu.addDestination(SETV, new DataDestination() {
			@Override
			public void setValue(long value) {
				flagViews[2].setActive(cpu.getProgramState(State.V) == 1);
			}
		});

		cpu.addDestination(STNZ, new DataDestination() {
			@Override
			public void setValue(long value) {
			flagViews[1].setActive(cpu.getProgramState(State.Z) != 0);//z
			flagViews[0].setActive(cpu.getProgramState(State.N)!= 0);//n
			}
		});

		cpu.addDestination(STOR, new DataDestination() {

			public void setValue(long value) {
				if (activePanel != null)
					mem.eventWrite();
				else
					mem.updateLastAddr();
			}
		});
	}

	public void panelActivate(BCompPanel component) {
		synchronized (lockActivePanel) {
			activePanel = component;
			bcomp.addDestination(listeners);
			bcomp.addDestination(activePanel.getSignalListeners());
		}
		buttonsPanel.setPreferredSize(buttonsPanel.getSize());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridheight = 2;
		constraints.insets =new Insets(0,0,0,30);

		input.setProperties(0,0,true,16, true);
		input.setTitle("IR");
		input.setPreferredSize(input.getSize());
		input.setMinimumSize(input.getSize());
		buttonsPanel.add(input, constraints);


		constraints.anchor = GridBagConstraints.CENTER;
		constraints.insets = new Insets(0, REG_16_WIDTH+26, 0, 20);//помещаем бит рядом с кл регистром
		activeBit.setPreferredSize(activeBit.getSize());
		activeBit.setMinimumSize(activeBit.getSize());
		buttonsPanel.add(activeBit, constraints);
		mem.setPreferredSize(mem.getSize());

		component.add(buttonsPanel, BorderLayout.SOUTH);

		mem.updateMemory();
		cuswitch = false;

		switchFocus();
	}

	public void panelDeactivate() {

	}

	public void keyPressed(KeyEvent e) {
		keyListener.keyPressed(e);
	}

	public void switchFocus() {
		input.setActive();
	}

	public RegisterView getRegisterView(Reg reg) {
		return regs.get(reg);
	}

	public FlagView getFlagView(int i) {
		return flagViews[i];
	}

	public void cmdContinue() {
		cpu.startContinue();
	}

	public void cmdEnterAddr() {

			cpu.startSetAddr();
	}

	public void cmdWrite() {

			cpu.startWrite();
	}

	public void cmdRead() {

			cpu.startRead();
	}

	public void cmdStart() {

		cpu.startStart();

	}

	public void cmdInvertRunState() {
		cpu.invertRunState();
		long state = cpu.getProgramState(State.W);
		rbRanStop.setSelected(state == 1);
		rbRanStop.setText(buttonProperties[BUTTON_RUN].texts[(int)state]);
		regs.get(Reg.PS).setValue();
	}

	public void cmdInvertClockState() {
		boolean state = cpu.invertClockState();
		rbTact.setSelected(!state);
	}
	public void cmdNextDelay() {
		currentDelay = currentDelay < delayPeriods.length - 1 ? currentDelay + 1 : 0;
	}

	public void cmdPrevDelay() {
		currentDelay = (currentDelay > 0 ? currentDelay : delayPeriods.length) - 1;
	}

	public void cmdLoadProgramm() throws IOException {
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT file programm", "txt");
		jfc.addChoosableFileFilter(filter);

		int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {

			Scanner file = new Scanner(jfc.getSelectedFile());
			while (file.hasNext()) {
				String line = file.nextLine().trim();
				if(!line.isEmpty()) {
					if (line.substring(line.length() - 1).equals("a")) {
						String addr = line.replaceFirst(".$", "");

						Integer value = Integer.parseInt(addr, 16);
						cpu.getRegister(Reg.IR).setValue(value);
						cpu.executeSetAddr();
					} else {
						Integer value = Integer.parseInt(line, 16);
						cpu.getRegister(Reg.IR).setValue(value);
						cpu.executeWrite();
					}
				}
			}

			file.close();
		}
	}

	public void saveDelay() {
		savedDelay = currentDelay;
		currentDelay = 0;
	}

	public void restoreDelay() {
		currentDelay = savedDelay;
	}

//	public void cmdAbout() {
//		JOptionPane.showMessageDialog(gui,
//			"Эмулятор Базовой ЭВМ. Версия r" + GUI.class.getPackage().getImplementationVersion() +
//			"\n\nЗагружена " + gui.getMicroProgramName() + " микропрограмма",
//			"О программе", JOptionPane.INFORMATION_MESSAGE);
//	}

	public ActiveBitView getActiveBit() {
		return activeBit;
	}

	public KeyListener getKeyListener() {
		return keyListener;
	}

	public ArrayList<ControlSignal> getActiveSignals() {
		return openBuses;
	}

	public void clearActiveSignals() {
		openBuses.clear();
	}
	public MemoryView getMem(){
		return mem;
	}
	public RegisterView getInput(){
		return input;
	}

	public ResourceBundle getRes() {
		return res;
	}
}
