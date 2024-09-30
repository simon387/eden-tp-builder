package it.simonecelia.edentbbuilder.dto;

import java.io.Serial;
import java.io.Serializable;


@SuppressWarnings ( "unused" )
public class ToADTO implements Serializable {

	@Serial
	private static final long serialVersionUID = -8602499198336055327L;

	private String toa;

	private short value;

	public String getToa () {
		return toa;
	}

	public void setToa ( String toa ) {
		this.toa = toa;
	}

	public short getValue () {
		return value;
	}

	public void setValue ( short value ) {
		this.value = value;
	}
}
