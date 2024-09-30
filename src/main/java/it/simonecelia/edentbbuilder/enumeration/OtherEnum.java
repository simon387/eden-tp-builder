package it.simonecelia.edentbbuilder.enumeration;

public enum OtherEnum {
	MYTHICAL_CONSTITUTION_CAP ( "Mythical Constitution Cap" ),
	MYTHICAL_DEXTERITY_CAP ( "Mythical Dexterity Cap" ),
	MYTHICAL_ACUITY_CAP ( "Mythical Acuity Cap" ),
	;

	private final String name;

	OtherEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}
