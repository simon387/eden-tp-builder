package it.simonecelia.edentbbuilder.dto;

import java.io.Serial;
import java.io.Serializable;


@SuppressWarnings ( "unused" )
public class StatDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 8614479336842190516L;

	private String stat;

	private short value;

	public String getStat () {
		return stat;
	}

	public void setStat ( String stat ) {
		this.stat = stat;
	}

	public short getValue () {
		return value;
	}

	public void setValue ( short value ) {
		this.value = value;
	}
}
