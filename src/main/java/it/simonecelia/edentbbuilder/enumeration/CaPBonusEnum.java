package it.simonecelia.edentbbuilder.enumeration;

public enum CaPBonusEnum {
	DEXTERITY ( "Dexterity" ),
	ACUITY ( "Acuity" ),
	POWER_POOL ( "Power Pool" ),
	MAX_HEALTH ( "Max Health" ),
	CONSTITUTION ( "Constitution" ),
	;

	private final String name;

	CaPBonusEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}

	public static CaPBonusEnum fromStringIgnoreCase ( String name ) {
		for ( var bonus : CaPBonusEnum.values () ) {
			if ( bonus.getName ().equalsIgnoreCase ( name ) ) {
				return bonus;
			}
		}
		throw new IllegalArgumentException ( "No enum constant for value: " + name );
	}
}
