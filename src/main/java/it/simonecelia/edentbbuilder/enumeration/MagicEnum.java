package it.simonecelia.edentbbuilder.enumeration;

public enum MagicEnum {

	ALL_SKILLS ( "All Skills" ),
	;

	private final String name;

	MagicEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}
