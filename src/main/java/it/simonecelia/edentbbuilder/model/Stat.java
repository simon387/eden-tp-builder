package it.simonecelia.edentbbuilder.model;

import it.simonecelia.edentbbuilder.enumeration.StatEnum;

import java.io.Serial;
import java.io.Serializable;


public class Stat implements Serializable {

	@Serial
	private static final long serialVersionUID = -7445062384714232714L;

	private StatEnum stat;

	private int value;

	public StatEnum getStat () {
		return stat;
	}

	public void setStat ( StatEnum stat ) {
		this.stat = stat;
	}

	public int getValue () {
		return value;
	}

	public void setValue ( int value ) {
		this.value = value;
	}
}
