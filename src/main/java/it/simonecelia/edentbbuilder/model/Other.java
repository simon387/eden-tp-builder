package it.simonecelia.edentbbuilder.model;

import it.simonecelia.edentbbuilder.enumeration.OtherEnum;

import java.io.Serial;
import java.io.Serializable;


public class Other implements Serializable {

	@Serial
	private static final long serialVersionUID = -2398035481703963172L;

	private OtherEnum otherEnum;
	private int value;

	public OtherEnum getOtherEnum () {
		return otherEnum;
	}

	public void setOtherEnum ( OtherEnum otherEnum ) {
		this.otherEnum = otherEnum;
	}

	public int getValue () {
		return value;
	}

	public void setValue ( int value ) {
		this.value = value;
	}
}
