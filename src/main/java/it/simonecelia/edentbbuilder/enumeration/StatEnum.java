package it.simonecelia.edentbbuilder.enumeration;

public enum StatEnum {
	DEXTERITY ( "Dexterity" ),
	HEALTH ( "Health" ),
	CONSTITUTION ( "Constitution" ),
	ACUITY ( "Acuity" ),
	ARMOR_FACTOR ( "Armor Factor" ),
	;

	private final String name;

	StatEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}
