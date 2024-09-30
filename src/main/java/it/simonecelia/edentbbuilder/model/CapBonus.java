package it.simonecelia.edentbbuilder.model;

import it.simonecelia.edentbbuilder.enumeration.CaPBonusEnum;

import java.io.Serial;
import java.io.Serializable;


public class CapBonus implements Serializable {

	@Serial
	private static final long serialVersionUID = -6671820226097095130L;

	private CaPBonusEnum capBonus;

	private int value;

	public CaPBonusEnum getCapBonus () {
		return capBonus;
	}

	public void setCapBonus ( CaPBonusEnum capBonus ) {
		this.capBonus = capBonus;
	}

	public int getValue () {
		return value;
	}

	public void setValue ( int value ) {
		this.value = value;
	}
}
