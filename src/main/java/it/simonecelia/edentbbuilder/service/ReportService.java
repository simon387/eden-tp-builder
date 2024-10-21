package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.enumeration.CaPBonusEnum;
import it.simonecelia.edentbbuilder.enumeration.MagicEnum;
import it.simonecelia.edentbbuilder.enumeration.OtherEnum;
import it.simonecelia.edentbbuilder.enumeration.ResistEnum;
import it.simonecelia.edentbbuilder.enumeration.StatEnum;
import it.simonecelia.edentbbuilder.enumeration.ToAEnum;
import it.simonecelia.edentbbuilder.model.MagicalBonuses;
import it.simonecelia.edentbbuilder.model.Report;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;


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
		short powerPoolCap = 0;
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
		short arcaneSiphone = 0;
		short powerPool = 0;
		// super caps
		short mythicalAcuityCap = 0;
		short mythicalConstitutionCap = 0;
		short mythicalDexterityCap = 0;

		//TODO solo 2H
		List<MagicalBonuses> totalMagicalBonuses = new ArrayList<> ();
		totalMagicalBonuses.add ( character.getArms ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getChest ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getCloak ().getMagicalBonuses () );
		//		totalMagicalBonuses.add ( character.getDistance ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getBelt ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getFeet ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getHands ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getHelm ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getJewel ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getlBracer ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getrBracer ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getlRing ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getrRing ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getLegs ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getMythirian ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getNecklace ().getMagicalBonuses () );
		//		totalMagicalBonuses.add ( character.getOffHand ().getMagicalBonuses () );
		//		totalMagicalBonuses.add ( character.getOneHand ().getMagicalBonuses () );
		totalMagicalBonuses.add ( character.getTwoHand ().getMagicalBonuses () );
		//TODO

		for ( var totBonus : totalMagicalBonuses ) {
			if ( null != totBonus.getStats () ) {
				for ( var s : totBonus.getStats () ) {
					switch ( s.getStat () ) {
					case StatEnum.CONSTITUTION:
						constitution += (short) s.getValue ();
						break;
					case StatEnum.DEXTERITY:
						dexterity += (short) s.getValue ();
						break;
					case StatEnum.ACUITY:
						piety += (short) s.getValue ();
						break;
					case StatEnum.HEALTH:
						hits += (short) s.getValue ();
						break;
					case StatEnum.ARMOR_FACTOR:
						armorFactor += (short) s.getValue ();
						break;
					}
				}
			}
			if ( null != totBonus.getResists () ) {
				for ( var r : totBonus.getResists () ) {
					switch ( r.getResist () ) {
					case ResistEnum.BODY:
						body += (short) r.getValue ();
						break;
					case ResistEnum.SPIRIT:
						spirit += (short) r.getValue ();
						break;
					case ResistEnum.ENERGY:
						energy += (short) r.getValue ();
						break;
					case ResistEnum.HEAT:
						heat += (short) r.getValue ();
						break;
					case ResistEnum.COLD:
						cold += (short) r.getValue ();
						break;
					case ResistEnum.MATTER:
						matter += (short) r.getValue ();
						break;
					case ResistEnum.CRUSH:
						crush += (short) r.getValue ();
						break;
					case ResistEnum.THRUST:
						thrust += (short) r.getValue ();
						break;
					case ResistEnum.SLASH:
						slash += (short) r.getValue ();
						break;
					}
				}
			}
			if ( null != totBonus.getCapBonuses () ) {
				for ( var c : totBonus.getCapBonuses () ) {
					switch ( c.getCapBonus () ) {
					case CaPBonusEnum.ACUITY:
						pietyCap += (short) c.getValue ();
						if ( pietyCap > 26 ) {
							pietyCap = 26;
						}
						break;
					case CaPBonusEnum.CONSTITUTION:
						constitutionCap += (short) c.getValue ();
						if ( constitutionCap > 26 ) {
							constitutionCap = 26;
						}
						break;
					case CaPBonusEnum.MAX_HEALTH:
						hitsCap += (short) c.getValue ();
						if ( hitsCap > 200 ) {
							hitsCap = 200;
						}
						break;
					case CaPBonusEnum.DEXTERITY:
						dexterityCap += (short) c.getValue ();
						if ( dexterityCap > 26 ) {
							dexterityCap = 26;
						}
						break;
					case CaPBonusEnum.POWER_POOL:
						powerPoolCap += (short) c.getValue ();
						if ( powerPoolCap > 25 ) {
							powerPoolCap = 25;
						}
						break;
					}
				}
			}
			// TODO niente melee skills
			if ( null != totBonus.getMagics () ) {
				for ( var m : totBonus.getMagics () ) {
					switch ( m.getMagic () ) { //TODO niente linee singole
					case MagicEnum.ALL_SKILLS:
						allMagicSkills += (short) m.getValue ();
					}
				}
			}
			if ( null != totBonus.getToAs () ) {
				for ( var t : totBonus.getToAs () ) {
					switch ( t.getToA () ) { //TODO solo magici
					//					case ToAEnum.ALL_FOCUS_LEVELS:
					//
					//					}
					case ToAEnum.ARCANE_SYPHON:
						arcaneSiphone += (short) t.getValue ();
						//						if ( arcaneSiphone > 25 ) {
						//							arcaneSiphone = 25;
						//						}
						break;
					case ToAEnum.POWER_POOL:
						powerPool += (short) t.getValue ();
						break;
					case ToAEnum.CASTING_SPEED:
						castingSpeed += (short) t.getValue ();
						break;
					case ToAEnum.RESIST_PIERCE:
						resistPierce += (short) t.getValue ();
						break;
					case ToAEnum.SPELL_DAMAGE:
						spellDamage += (short) t.getValue ();
						break;
					case ToAEnum.SPELL_DURATION:
						spellDuration += (short) t.getValue ();
						break;
					case ToAEnum.SPELL_RANGE:
						spellRange += (short) t.getValue ();
						break;
					case ToAEnum.DEBUFF_EFFECTIVENESS:
						debuffEffectiveness += (short) t.getValue ();
						break;
					}
					//TODO ne mancano...
				}
			}
			if ( null != totBonus.getOthers () ) {
				for ( var o : totBonus.getOthers () ) {
					switch ( o.getOtherEnum () ) {
					case OtherEnum.MYTHICAL_ACUITY_CAP:
						mythicalAcuityCap += (short) o.getValue ();
						if ( mythicalAcuityCap > 25 ) {
							mythicalAcuityCap = 25;
						}
						break;
					case OtherEnum.MYTHICAL_DEXTERITY_CAP:
						mythicalDexterityCap += (short) o.getValue ();
						if ( mythicalDexterityCap > 25 ) {
							mythicalDexterityCap = 25;
						}
						break;
					case OtherEnum.MYTHICAL_CONSTITUTION_CAP:
						mythicalConstitutionCap += (short) o.getValue ();
						if ( mythicalConstitutionCap > 25 ) {
							mythicalConstitutionCap = 25;
						}
						break;
					}
				}
			}
		}

		System.out.println ( "\nStatistic" );
		//		System.out.println ( "Strength: " + strength + "/" + ( 75 + strengthCap ) );
		System.out.println ( "Constitution: " + constitution + "/" + ( 75 + constitutionCap + mythicalConstitutionCap ) );
		System.out.println ( "Dexterity: " + dexterity + "/" + ( 75 + dexterityCap + mythicalDexterityCap ) );
		//		System.out.println ( "Quickness: " + quickness + "/" + ( 75 + quicknessCap ) );
		//		System.out.println ( "Intelligence: " + intelligence + "/" + ( 75 + intelligenceCap ) );
		System.out.println ( "Piety: " + piety + "/" + ( 75 + pietyCap + mythicalAcuityCap ) );
		//		System.out.println ( "Charisma: " + charisma + "/" + ( 75 + charismaCap ) );
		//		System.out.println ( "Empathy: " + empathy + "/" + ( 75 + empathyCap ) );
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
		System.out.println ( "Armour Factor: " + armorFactor + "/" + ( 25 + armorFactorCap ) );
		System.out.println ( "Debuff Effectiveness: " + debuffEffectiveness + "/25" );
		System.out.println ( "Buff Effectiveness: " + buffEffectiveness + "/25" );
		System.out.println ( "Healing Effectiveness: " + healingEffectiveness + "/25" );
		System.out.println ( "Spell Duration: " + spellDuration + "/25" );
		System.out.println ( "Casting Speed: " + castingSpeed + "/10" );
		System.out.println ( "Spell Range: " + spellRange + "/10" );
		System.out.println ( "Spell Damage: " + spellDamage + "/10" );
		System.out.println ( "Resist Pierce: " + resistPierce + "/10" );
		System.out.println ( "Arcane Siphone: " + arcaneSiphone + "/25" );
		System.out.println ( "Power Pool: " + powerPool + "/" + ( 25 + powerPoolCap ) );

		return report;
	}
}
