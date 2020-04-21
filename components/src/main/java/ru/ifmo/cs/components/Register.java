/*
 * $Id$
 */

package ru.ifmo.cs.components;

/**
 *
 * @author Dmitry Afanasiev <KOT@MATPOCKuH.Ru>
 */
public class Register extends DataPart {
	public Register(long width) {
		super(width);
	}

	@Override
	public synchronized void setValue(long value) {
		this.value = value & mask;
	}

	@Override
	public synchronized void setValue(long value, long mask, long startbit) {
		this.value = ((this.value & ~(mask << startbit)) | ((value & mask) << startbit)) & this.mask;
	}

	public synchronized void setNibble(int nibble, int which)
	{
		long output;
		if(which ==0)
		{
			this.value = (this.value & /*65280*/ 0xFFFFFFF0 ) | nibble;
		}
		else
		{
			int shiftNibble = nibble << (4*which) ;
			int shiftMask = 0x0000000F << (4*which) ;
			this.value = (this.value & ~shiftMask) | shiftNibble ;
		}
		//return output;
	}

	public synchronized void invertBit(long startbit) {
		value ^= (1L << startbit) & mask;
	}

	public synchronized long getValue(long startbit) {
		return (value >> startbit) & 1L;
	}

	@Override
	public synchronized String toString() {
		return Utils.toHex(value, width);
	}
}