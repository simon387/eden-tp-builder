package it.simonecelia.edentbbuilder.model;

import it.simonecelia.edentbbuilder.enumeration.MeleeEnum;

import java.io.Serial;
import java.io.Serializable;


public class Melee implements Serializable {

	@Serial
	private static final long serialVersionUID = 74300179078740383L;

	private MeleeEnum melee;

	private int value;

	public MeleeEnum getMelee () {
		return melee;
	}

	public void setMelee ( MeleeEnum melee ) {
		this.melee = melee;
	}

	public int getValue () {
		return value;
	}

	public void setValue ( int value ) {
		this.value = value;
	}
}
