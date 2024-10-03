package it.simonecelia.edentbbuilder.dto;

import java.io.Serial;
import java.io.Serializable;

@SuppressWarnings ( "unused" )
public class CharacterDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 105710234135587348L;

	private String name;
	private short level;
	private String className;

}
