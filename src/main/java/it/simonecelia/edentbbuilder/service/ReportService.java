package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.model.Report;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


@ApplicationScoped
public class ReportService {

	@Inject
	CharacterService characterService;

	public Report generateByCharacterId ( Long id ) {
		var character = characterService.getCharaceterById ( id );
		if ( character == null ) {
			return null;
		}
		var report = new Report ();
		report.setTitle ( character.getName () );
		//TODO per adesso solo prints
		//TODO supponiamo pg lvl 50, nessun calcolo specifico delle stat per livelli inferiori

		// stats
		short strength = 0;
		short strengthCap = 0;
		short constitution = 0;
		short constitutionCap = 0;
		short dexterity = 0;
		short dexterityCap = 0;
		short quickness = 0;
		short quicknessCap = 0;
		short intelligence = 0;
		short intelligenceCap = 0;
		short piety = 0;
		short pietyCap = 0;
		short charisma = 0;
		short charismaCap = 0;
		short empathy = 0;
		short empathyCap = 0;
		short hits = 0;
		short hitsCap = 0;
		short power = 0; // senza cap a 25 ?
		short powerCap = 0;
		// resists
		short body = 0;
		short cold = 0;
		short heat = 0;
		short energy = 0;
		short matter = 0;
		short spirit = 0;
		short crush = 0;
		short thrust = 0;
		short slash = 0;
		// skills //todo solo caster per ora
		short allMagicSkills = 0;
		// ToA bonuses //todo solo caster per ora
		short armorFactor = 0;
		short armorFactorCap = 0;
		short debuffEffectiveness = 0;
		short buffEffectiveness = 0;
		short healingEffectiveness = 0;
		short spellDuration = 0;
		short castingSpeed = 0;
		short spellRange = 0;
		short spellDamage = 0;
		short resistPierce = 0;

		System.out.println ( "\nStatistic" );
		System.out.println ( "Strength: " + strength + "/" + ( 75 + strengthCap ) );
		System.out.println ( "Constitution: " + constitution + "/" + ( 75 + constitutionCap ) );
		System.out.println ( "Dexterity: " + dexterity + "/" + ( 75 + dexterityCap ) );
		System.out.println ( "Quickness: " + quickness + "/" + ( 75 + quicknessCap ) );
		System.out.println ( "Intelligence: " + intelligence + "/" + ( 75 + intelligenceCap ) );
		System.out.println ( "Piety: " + piety + "/" + ( 75 + pietyCap ) );
		System.out.println ( "Charisma: " + charisma + "/" + ( 75 + charismaCap ) );
		System.out.println ( "Empathy: " + empathy + "/" + ( 75 + empathyCap ) );
		System.out.println ( "Hits: " + hits + "/" + ( 200 + hitsCap ) );
		System.out.println ( "Power: " + power + "/" + ( 25 + powerCap ) );

		System.out.println ( "\nResistance" );
		System.out.println ( "Body: " + body + "/26" );
		System.out.println ( "Cold: " + cold + "/26" );
		System.out.println ( "Heat: " + heat + "/26" );
		System.out.println ( "Energy: " + energy + "/26" );
		System.out.println ( "Matter: " + matter + "/26" );
		System.out.println ( "Spirit: " + spirit + "/26" );
		System.out.println ( "Crush: " + crush + "/26" );
		System.out.println ( "Thrust: " + thrust + "/26" );
		System.out.println ( "Slash: " + slash + "/26" );

		System.out.println ( "\nSkill" );
		System.out.println ( "All Magic Skill: " + allMagicSkills + "/11" );

		System.out.println ( "\nTOA Bonus" );
		System.out.println ( "Armour Factor: " + armorFactor + "/" + ( 50 + armorFactorCap ) );
		System.out.println ( "Debuff Effectiveness: " + debuffEffectiveness + "/25" );
		System.out.println ( "Buff Effectiveness: " + buffEffectiveness + "/25" );
		System.out.println ( "Healing Effectiveness: " + healingEffectiveness + "/25" );
		System.out.println ( "Spell Duration: " + spellDuration + "/25" );
		System.out.println ( "Casting Speed: " + castingSpeed + "/10" );
		System.out.println ( "Spell Range: " + spellRange + "/10" );
		System.out.println ( "Spell Damage: " + spellDamage + "/10" );
		System.out.println ( "Resist Pierce: " + resistPierce + "/10" );

		return report;
	}
}
