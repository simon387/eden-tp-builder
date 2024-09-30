package it.simonecelia.edentbbuilder.dto;

import java.io.Serial;
import java.io.Serializable;


@SuppressWarnings ( "unused" )
public class MeleeDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = -6906954010365785285L;

	private String melee;

	private short value;

	public String getMelee () {
		return melee;
	}

	public void setMelee ( String melee ) {
		this.melee = melee;
	}

	public short getValue () {
		return value;
	}

	public void setValue ( short value ) {
		this.value = value;
	}
}
