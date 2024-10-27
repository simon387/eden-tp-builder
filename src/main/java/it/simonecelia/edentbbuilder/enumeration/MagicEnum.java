package it.simonecelia.edentbbuilder.enumeration;

public enum MagicEnum {

	ALL_SKILLS ( "All Skills" ),
	VERDANT ( "Verdant" ),
	CREEPING ( "Creeping" ),
	STEALTH ( "Stealth" ),
	;

	private final String name;

	MagicEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}
