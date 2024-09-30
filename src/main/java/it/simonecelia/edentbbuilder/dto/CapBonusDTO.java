package it.simonecelia.edentbbuilder.dto;

import java.io.Serial;
import java.io.Serializable;


@SuppressWarnings ( "unused" )
public class CapBonusDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = -5993696407798592063L;

	private String capBonus;

	private short value;

	public String getCapBonus () {
		return capBonus;
	}

	public void setCapBonus ( String capBonus ) {
		this.capBonus = capBonus;
	}

	public short getValue () {
		return value;
	}

	public void setValue ( short value ) {
		this.value = value;
	}
}
