package it.simonecelia.edentbbuilder.enumeration;

public enum StatEnum {
	DEXTERITY ( "Dexterity" ),
	;

	private final String name;

	StatEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}
