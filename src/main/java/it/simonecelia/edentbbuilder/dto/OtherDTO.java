package it.simonecelia.edentbbuilder.dto;

import java.io.Serial;
import java.io.Serializable;


@SuppressWarnings ( "unused" )
public class OtherDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 7674932523573231261L;

	private String other;

	private short value;

	public String getOther () {
		return other;
	}

	public void setOther ( String other ) {
		this.other = other;
	}

	public short getValue () {
		return value;
	}

	public void setValue ( short value ) {
		this.value = value;
	}
}
