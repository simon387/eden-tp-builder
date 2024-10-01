package it.simonecelia.edentbbuilder.enumeration;

public enum ToAEnum {
	ALL_FOCUS_LEVELS ( "AlL Focus Levels" ),
	POWER_POOL ( "Power Pool" ),
	SPELL_DAMAGE ( "Spell Damage" ),
	ARCANE_SYPHON ( "Arcane Syphon" ),
	RESIST_PIERCE ( "Resist Pierce" ),
	CASTING_SPEED ( "Casting Speed" ),
	SPELL_DURATION ( "Spell Duration" ),
	MELEE_DAMAGE ( "Melee Damage" ),
	SPELL_RANGE ( "Spell Range" ),
	SPELL_LEVEL ( "Spell Level" ),
	;

	private final String name;

	ToAEnum ( String name ) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
}
