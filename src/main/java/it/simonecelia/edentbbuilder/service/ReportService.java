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
		short hits;
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
		short spellDuration;
		short castingSpeed = 0;
		short spellRange = 0;
		short spellDamage = 0;
		short resistPierce = 0;

		System.out.println ( "Statistic" );


		return report;
	}
}
