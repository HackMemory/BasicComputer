/*
 * $Id$
 */

package ru.ifmo.cs.components;

/**
 *
 * @author Dmitry Afanasiev <KOT@MATPOCKuH.Ru>
 */
public class Valve extends Control {
	private final DataSource input;

	public Valve(DataSource input, long width, long startbit, long ctrlbit, DataDestination ... dsts) {
		super(width, startbit, ctrlbit, dsts);

		this.input = input;
	}

	@Override
	public synchronized void setValue(long value) {
		if (isOpen(value))
			super.setValue(input.getValue());
	}
}
