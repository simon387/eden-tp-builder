package it.simonecelia.edentbbuilder.dto;

import java.io.Serial;
import java.io.Serializable;


@SuppressWarnings ( "unused" )
public class MagicDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = -5152077962358569363L;

	private String magic;

	private short value;

	public String getMagic () {
		return magic;
	}

	public void setMagic ( String magic ) {
		this.magic = magic;
	}

	public short getValue () {
		return value;
	}

	public void setValue ( short value ) {
		this.value = value;
	}
}
