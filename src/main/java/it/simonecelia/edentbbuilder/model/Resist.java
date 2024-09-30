package it.simonecelia.edentbbuilder.model;

import it.simonecelia.edentbbuilder.enumeration.ResistEnum;

import java.io.Serial;
import java.io.Serializable;


public class Resist implements Serializable {

	@Serial
	private static final long serialVersionUID = -497688507099665672L;

	private ResistEnum resist;

	private int value;

	public ResistEnum getResist () {
		return resist;
	}

	public void setResist ( ResistEnum resist ) {
		this.resist = resist;
	}

	public int getValue () {
		return value;
	}

	public void setValue ( int value ) {
		this.value = value;
	}
}
