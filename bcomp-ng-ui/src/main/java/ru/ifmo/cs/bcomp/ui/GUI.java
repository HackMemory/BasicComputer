/*
 * $Id$
 */

package ru.ifmo.cs.bcomp.ui;

import ru.ifmo.cs.bcomp.BasicComp;
import ru.ifmo.cs.bcomp.CPU;
import ru.ifmo.cs.bcomp.IOCtrl;
import ru.ifmo.cs.bcomp.ui.components.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import static ru.ifmo.cs.bcomp.ui.components.DisplayStyles.PANE_SIZE;

/**
 *
 * @author Dmitry Afanasiev <KOT@MATPOCKuH.Ru>
 */
public class GUI extends JApplet {
	private ComponentManager cmanager;
	private JTabbedPane tabs;
	private ActivateblePanel activePanel = null;
	private final BasicComp bcomp;
	private final CPU cpu;
	private boolean isHex = true;


	public GUI(BasicComp bcomp) {
		this.bcomp = bcomp;
		this.cpu = bcomp.getCPU();
	}


	@Override
	public void init() {
		cmanager = new ComponentManager(this);


		final ActivateblePanel[] panels = {
			new BasicView(this, isHex),
			new AssemblerView(this),
			new TraceView(this)
		};

		tabs = new JTabbedPane(){
			@Override
			protected void paintComponent(Graphics g) {
				g.setColor(DisplayStyles.COLOR_BACKGROUND_STYLE);
				g.fillRect(0 ,0, this.getWidth(), this.getHeight());
				super.paintComponent(g);
			}
		};

		tabs.addKeyListener(cmanager.getKeyListener());

		tabs.addChangeListener(new ChangeListener() {

			public void stateChanged(ChangeEvent e) {
				if (activePanel != null)
					activePanel.panelDeactivate();

				activePanel = (ActivateblePanel)tabs.getSelectedComponent();
				activePanel.panelActivate();
			}
		});


		tabs.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent componentEvent) {
				super.componentResized(componentEvent);
				for (ActivateblePanel panel : panels) {
					panel.revalidate();
					panel.repaint();
					panel.redrawArrows();
				}
			}
		});
		for (ActivateblePanel pane : panels) {
			pane.setPreferredSize(PANE_SIZE);

			tabs.addTab(pane.getPanelName(), pane);
		}

		add(tabs);
	}

	@Override
	public void start() {
		cmanager.switchFocus();
	}

	public void gui() throws Exception {
		bcomp.startTimer();

		JFrame frame = new JFrame("БЭВМ");

			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		init();
		frame.pack();

		frame.setVisible(true);
		frame.setMinimumSize(frame.getSize());
		start();
	}

	public BasicComp getBasicComp() {
		return bcomp;
	}

	public CPU getCPU() {
		return cpu;
	}

	public IOCtrl[] getIOCtrls() {
		return bcomp.getIOCtrls();
	}

	public ComponentManager getComponentManager() {
		return cmanager;
	}

}
