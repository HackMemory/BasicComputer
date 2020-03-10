/*
 * $Id$
 */

package ru.ifmo.cs.bcomp.ui.components;

import ru.ifmo.cs.bcomp.Reg;
import ru.ifmo.cs.bcomp.Utils;
import ru.ifmo.cs.components.Register;

import java.awt.event.*;

import static ru.ifmo.cs.bcomp.ui.components.DisplayStyles.*;

/**
 *
 * @author Dmitry Afanasiev <KOT@MATPOCKuH.Ru>
 */
public class InputRegisterView extends RegisterView {
	private final ComponentManager cmanager;
	private final Register reg;
	private final ActiveBitView activeBitView;
	private boolean active = false;
	private int regWidth;
	private int bitno;
	private int formattedWidth;

	public InputRegisterView(ComponentManager cmgr, Register reg) {
		super(reg, COLOR_TITLE);

		this.cmanager = cmgr;
		this.reg = reg;
		activeBitView = cmanager.getActiveBit();

		bitno = 0;
		formattedWidth = Utils.getBinaryWidth(4);



		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!value.isFocusOwner())
					reqFocus();
			}
		});

		value.setFocusable(true);
		value.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				active = true;
				setActiveBit(bitno);
			}

			@Override
			public void focusLost(FocusEvent e) {
				active = false;
				setValue();
			}
		});

		value.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT:
					case KeyEvent.VK_BACK_SPACE:
						moveLeft();
						break;

					case KeyEvent.VK_RIGHT:
						moveRight();
						break;

					case KeyEvent.VK_UP:
						//invertBit();
						break;

					case KeyEvent.VK_0:
					case KeyEvent.VK_NUMPAD0:
						setBit(0);
						break;

					case KeyEvent.VK_1:
					case KeyEvent.VK_NUMPAD1:
						setBit(1);
						break;

					case KeyEvent.VK_2:
					case KeyEvent.VK_NUMPAD2:
						setBit(2);
						break;

					case KeyEvent.VK_3:
					case KeyEvent.VK_NUMPAD3:
						setBit(3);
						break;

					case KeyEvent.VK_4:
					case KeyEvent.VK_NUMPAD4:
						setBit(4);
						break;

					case KeyEvent.VK_5:
					case KeyEvent.VK_NUMPAD5:
						setBit(5);
						break;

					case KeyEvent.VK_6:
					case KeyEvent.VK_NUMPAD6:
						setBit(6);
						break;


					case KeyEvent.VK_7:
					case KeyEvent.VK_NUMPAD7:
						setBit(7);
						break;

					case KeyEvent.VK_8:
					case KeyEvent.VK_NUMPAD8:
						setBit(8);
						break;

					case KeyEvent.VK_9:
					case KeyEvent.VK_NUMPAD9:
						setBit(9);
						break;

					case KeyEvent.VK_A:
						setBit(0xA);
						break;

					case KeyEvent.VK_B:
						setBit(0xB);
						break;

					case KeyEvent.VK_C:
						setBit(0xC);
						break;

					case KeyEvent.VK_D:
						setBit(0xD);
						break;

					case KeyEvent.VK_E:
						setBit(0xE);
						break;

					case KeyEvent.VK_F:
						setBit(0xF);
						break;

					default:
						cmanager.keyPressed(e);
				}
			}
		});

		/*value.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!value.isFocusOwner())
					reqFocus();

				int bitno = Utils.getBitNo(e.getX(), e.getX() > value.getWidth() / 2 ? formattedWidth - 1 : formattedWidth, FONT_COURIER_BOLD_21_WIDTH);

				if (bitno < 0)
					return;

				setActiveBit(bitno);

				if (e.getClickCount() > 1)
					invertBit();
			}
		});*/
	}

	private void setActiveBit(int bitno) {
		activeBitView.setValue(this.bitno = bitno);
		setValue();
	}

	private void moveLeft() {
		//JOptionPane.showMessageDialog(null, regWidth, "", JOptionPane.INFORMATION_MESSAGE);
		setActiveBit((bitno + 1) % 4);
	}

	private void moveRight() {
		setActiveBit((bitno == 0 ? 4 : bitno) - 1);
	}

	private void invertBit() {
		reg.invertBit(bitno);
		setValue();
	}

	private void setBit(int value) {
		reg.setNibble(value, bitno);
		//reg.setValue(value,1,bitno);
		moveRight();
	}

	@Override
	public void setValue() {
		if (active) {
			String hex16Chars = String.format("%04X", reg.getValue());
			StringBuilder str = new StringBuilder(HTML + hex16Chars + HTML_END);
			//JOptionPane.showMessageDialog(null, Utils.getBinaryWidth(3 + 1), "", JOptionPane.INFORMATION_MESSAGE);
			int pos = 6 + formattedWidth - Utils.getBinaryWidth(bitno + 1);
			str.insert(pos + 1, COLOR_END);
			str.insert(pos, COLOR_ACTIVE_BIT);
			setValue(str.toString());
			cmanager.getRegisterView(Reg.IR).setValue(Long.toHexString(reg.getValue()));
		} else {
			String hex16Chars = String.format("%04X", reg.getValue());
			super.setValue(HTML + hex16Chars + HTML_END);
		}
	}

	public void reqFocus() {
		try {
			value.requestFocus();
		} catch (Exception e) { }
		
		value.requestFocusInWindow();
	}

	public void setActive() {
		reqFocus();
		active = true;
		setActiveBit(bitno);
	}
}
