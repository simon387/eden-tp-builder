package it.simonecelia.edentbbuilder.dto;

import java.io.Serial;
import java.io.Serializable;


@SuppressWarnings ( "unused" )
public class ResistDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = -6011004164900168952L;

	private String resist;

	private short value;

	public String getResist () {
		return resist;
	}

	public void setResist ( String resist ) {
		this.resist = resist;
	}

	public short getValue () {
		return value;
	}

	public void setValue ( short value ) {
		this.value = value;
	}
}
