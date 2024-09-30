package it.simonecelia.edentbbuilder.enumeration;

public enum CaPBonusEnum {
	DEXTERITY ( "Dexterity" ),
	ACUITY ( "Acuity" ),
	POWER_POOL ( "Power Pool" ),
	;

	private final String name;

	CaPBonusEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}
