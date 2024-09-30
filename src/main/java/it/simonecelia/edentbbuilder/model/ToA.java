package it.simonecelia.edentbbuilder.model;

import it.simonecelia.edentbbuilder.enumeration.ToAEnum;

import java.io.Serial;
import java.io.Serializable;


public class ToA implements Serializable {

	@Serial
	private static final long serialVersionUID = 2424452232152976055L;

	private ToAEnum toA;

	private int value;

	public ToAEnum getToA () {
		return toA;
	}

	public void setToA ( ToAEnum toA ) {
		this.toA = toA;
	}

	public int getValue () {
		return value;
	}

	public void setValue ( int value ) {
		this.value = value;
	}
}
