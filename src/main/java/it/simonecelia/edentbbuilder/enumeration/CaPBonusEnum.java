package it.simonecelia.edentbbuilder.enumeration;

public enum CaPBonusEnum {
	DEXTERITY ( "Dexterity" ),
	ACUITY ( "Acuity" ),
	POWER_POOL ( "Power Pool" ),
	MAX_HEALTH ( "Max Health" ),
	CONSTITUTION ( "Constitution" ),
	STRENGTH ( "Strength" ),
	QUICKNESS ( "Quickness" ),
	;

	private final String name;

	CaPBonusEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}
