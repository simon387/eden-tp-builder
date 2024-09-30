package it.simonecelia.edentbbuilder.enumeration;

public enum MeleeEnum {
	ALL_SKILLS ( "All Skills" ),
	;

	private final String name;

	MeleeEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}

