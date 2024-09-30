package it.simonecelia.edentbbuilder.enumeration;

public enum ResistEnum {
	BODY ( "Body" ),
	ENERGY ( "Energy" ),
	SPIRIT ( "Spirit" ),
	MATTER ( "Matter" ),
	COLD ( "Cold" ),
	HEAT ( "Heat" ),
	CRUSH ( "Crush" ),
	THRUST ( "Thrust" ),
	SLASH ( "Slash" ),
	;

	private final String name;

	ResistEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}
