package it.simonecelia.edentbbuilder.model;

import it.simonecelia.edentbbuilder.enumeration.MagicEnum;

import java.io.Serial;
import java.io.Serializable;


public class Magic implements Serializable {

	@Serial
	private static final long serialVersionUID = -7079619646289424692L;

	private MagicEnum magic;

	private short value;

	public MagicEnum getMagic () {
		return magic;
	}

	public void setMagic ( MagicEnum magic ) {
		this.magic = magic;
	}

	public int getValue () {
		return value;
	}

	public void setValue ( short value ) {
		this.value = value;
	}
}
