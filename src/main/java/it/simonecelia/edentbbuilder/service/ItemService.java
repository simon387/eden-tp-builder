package it.simonecelia.edentbbuilder.service;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.dto.CapBonusDTO;
import it.simonecelia.edentbbuilder.dto.ItemDTO;
import it.simonecelia.edentbbuilder.dto.MagicDTO;
import it.simonecelia.edentbbuilder.dto.MeleeDTO;
import it.simonecelia.edentbbuilder.dto.ResistDTO;
import it.simonecelia.edentbbuilder.dto.StatDTO;
import it.simonecelia.edentbbuilder.dto.ToADTO;
import it.simonecelia.edentbbuilder.dto.loki.SCItem;
import it.simonecelia.edentbbuilder.entity.Item;
import it.simonecelia.edentbbuilder.enumeration.CaPBonusEnum;
import it.simonecelia.edentbbuilder.enumeration.EnumUtils;
import it.simonecelia.edentbbuilder.enumeration.MagicEnum;
import it.simonecelia.edentbbuilder.enumeration.MeleeEnum;
import it.simonecelia.edentbbuilder.enumeration.OtherEnum;
import it.simonecelia.edentbbuilder.enumeration.ResistEnum;
import it.simonecelia.edentbbuilder.enumeration.StatEnum;
import it.simonecelia.edentbbuilder.enumeration.ToAEnum;
import it.simonecelia.edentbbuilder.model.CapBonus;
import it.simonecelia.edentbbuilder.model.Magic;
import it.simonecelia.edentbbuilder.model.MagicalBonuses;
import it.simonecelia.edentbbuilder.model.Melee;
import it.simonecelia.edentbbuilder.model.Other;
import it.simonecelia.edentbbuilder.model.Resist;
import it.simonecelia.edentbbuilder.model.Stat;
import it.simonecelia.edentbbuilder.model.ToA;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class ItemService {

	@Inject
	RealmService realmService;

	@Inject
	SlotService slotService;

	@Inject
	ItemTypeService itemTypeService;

	public Item getByName ( String name ) {
		return Item.find ( "LOWER(name) = LOWER(?1)", name ).firstResult ();
	}

	public Item getById ( long id ) {
		return Item.findById ( id );
	}

	public List<Item> getAllItems () {
		return Item.listAll ();
	}

	@Transactional
	public Item create ( ItemDTO itemDTO ) {
		if ( getByName ( itemDTO.getName () ) != null ) {
			Log.error ( "Item alredy inserted!" );
			return null;
		}
		var item = new Item ();
		item.setBonusLevel ( itemDTO.getBonusLevel () );
		item.setLevel ( itemDTO.getLevel () );

		var magicalBonuses = new MagicalBonuses ();
		if ( !itemDTO.getCapBonuses ().isEmpty () ) {
			List<CapBonus> capBonuses = new ArrayList<> ();
			for ( var capDTO : itemDTO.getCapBonuses () ) {
				var capBonus = new CapBonus ();
				capBonus.setCapBonus ( EnumUtils.fromStringIgnoreCase ( CaPBonusEnum.class, capDTO.getCapBonus () ) );
				capBonus.setValue ( capDTO.getValue () );
				capBonuses.add ( capBonus );
			}
			magicalBonuses.setCapBonuses ( capBonuses );
		}
		if ( !itemDTO.getMagics ().isEmpty () ) {
			List<Magic> magics = new ArrayList<> ();
			for ( var magicDTO : itemDTO.getMagics () ) {
				var magic = new Magic ();
				magic.setMagic ( EnumUtils.fromStringIgnoreCase ( MagicEnum.class, magicDTO.getMagic () ) );
				magic.setValue ( magicDTO.getValue () );
				magics.add ( magic );
			}
			magicalBonuses.setMagics ( magics );
		}
		if ( !itemDTO.getMelees ().isEmpty () ) {
			List<Melee> melees = new ArrayList<> ();
			for ( var meleeDTO : itemDTO.getMelees () ) {
				var melee = new Melee ();
				melee.setMelee ( EnumUtils.fromStringIgnoreCase ( MeleeEnum.class, meleeDTO.getMelee () ) );
				melee.setValue ( meleeDTO.getValue () );
				melees.add ( melee );
			}
			magicalBonuses.setMelees ( melees );
		}
		if ( null != itemDTO.getOthers () && !itemDTO.getOthers ().isEmpty () ) {
			List<Other> others = new ArrayList<> ();
			for ( var otherDTO : itemDTO.getOthers () ) {
				var other = new Other ();
				other.setOtherEnum ( EnumUtils.fromStringIgnoreCase ( OtherEnum.class, otherDTO.getOther () ) );
				other.setValue ( otherDTO.getValue () );
				others.add ( other );
			}
			magicalBonuses.setOthers ( others );
		}
		if ( null != itemDTO.getResists () && !itemDTO.getResists ().isEmpty () ) {
			List<Resist> resists = new ArrayList<> ();
			for ( var resistDTO : itemDTO.getResists () ) {
				var resist = new Resist ();
				resist.setResist ( EnumUtils.fromStringIgnoreCase ( ResistEnum.class, resistDTO.getResist () ) );
				resist.setValue ( resistDTO.getValue () );
				resists.add ( resist );
			}
			magicalBonuses.setResists ( resists );
		}
		if ( !itemDTO.getStats ().isEmpty () ) {
			List<Stat> stats = new ArrayList<> ();
			for ( var statDTO : itemDTO.getStats () ) {
				var stat = new Stat ();
				stat.setStat ( EnumUtils.fromStringIgnoreCase ( StatEnum.class, statDTO.getStat () ) );
				stat.setValue ( statDTO.getValue () );
				stats.add ( stat );
			}
			magicalBonuses.setStats ( stats );
		}
		if ( !itemDTO.getToas ().isEmpty () ) {
			List<ToA> toas = new ArrayList<> ();
			for ( var statDTO : itemDTO.getToas () ) {
				var toA = new ToA ();
				toA.setToA ( EnumUtils.fromStringIgnoreCase ( ToAEnum.class, statDTO.getToa () ) );
				toA.setValue ( statDTO.getValue () );
				toas.add ( toA );
			}
			magicalBonuses.setToAs ( toas );
		}

		item.setMagicalBonuses ( magicalBonuses );

		item.setModel ( itemDTO.getModel () );
		item.setName ( itemDTO.getName () );
		item.setRequiredLevel ( itemDTO.getRequiredLevel () );
		item.setTradeable ( itemDTO.isTradeable () );
		item.setUtility ( itemDTO.getUtility () );

		item.setRealm ( realmService.getByName ( itemDTO.getRealm () ) );
		item.setSlot ( slotService.getByName ( itemDTO.getSlot () ) );
		item.setType ( itemTypeService.getByName ( itemDTO.getType () ) );

		item.persist ();
		return item;
	}

	@Transactional
	public boolean delete ( Long id ) {
		return Item.deleteById ( id );
	}

	public Item createFromXml ( SCItem scItem ) {
		var item = new ItemDTO ();
		item.setLevel ( scItem.getLevel () );
		item.setName ( scItem.getItemName () );
		item.setSlot ( scItem.getLocation () );
		item.setRealm ( scItem.getRealm () );
		for ( var s : scItem.getDropItem ().getSlots () ) {
			switch ( s.getType () ) {
			case "Stat":
				if ( item.getStats () == null ) {
					item.setStats ( new ArrayList<> () );
				}
				var stat = new StatDTO ();
				stat.setStat ( s.getEffect () );
				stat.setValue ( (short) s.getAmount () );
				item.getStats ().add ( stat );
				break;
			case "Resist":
				if ( item.getResists () == null ) {
					item.setResists ( new ArrayList<> () );
				}
				var resist = new ResistDTO ();
				resist.setResist ( s.getEffect ().replace ( " Resist", "" ) );
				resist.setValue ( (short) s.getAmount () );
				item.getResists ().add ( resist );
				break;
			case "Skill":
				switch ( s.getEffect () ) {
				case "Stealth":
					if ( item.getMagics () == null ) {
						item.setMagics ( new ArrayList<> () );
					}
					var skill = new MagicDTO ();
					skill.setMagic ( s.getEffect () );
					skill.setValue ( (short) s.getAmount () );
					item.getMagics ().add ( skill );
					break;
				case "All Melee Skill Bonus":
					if ( item.getMelees () == null ) {
						item.setMelees ( new ArrayList<> () );
					}
					var meleeSkill = new MeleeDTO ();
					meleeSkill.setMelee ( "All Skills" );
					meleeSkill.setValue ( (short) s.getAmount () );
					item.getMelees ().add ( meleeSkill );
					break;
				case "All Magic Skill Bonus":
					if ( item.getMagics () == null ) {
						item.setMagics ( new ArrayList<> () );
					}
					var magicSkill = new MagicDTO ();
					magicSkill.setMagic ( "All Skills" );
					magicSkill.setValue ( (short) s.getAmount () );
					item.getMagics ().add ( magicSkill );
					break;
				default:
					throw new RuntimeException ( "Develop this" );
				}
				break;
			case "Other Bonus":
				switch ( s.getEffect () ) {
				case "Melee Damage Bonus":
				case "Spell Damage Bonus":
				case "Style Damage Bonus":
				case "Melee Speed Bonus":
				case "Casting Speed Bonus":
					if ( item.getToas () == null ) {
						item.setToas ( new ArrayList<> () );
					}
					var toa = new ToADTO ();
					toa.setToa ( s.getEffect ().replace ( " Bonus", "" ) );
					toa.setValue ( (short) s.getAmount () );
					item.getToas ().add ( toa );
					break;
				default:
					throw new RuntimeException ( "Develop this 3" );
				}
				break;
			case "Cap Increase":
				if ( item.getCapBonuses () == null ) {
					item.setCapBonuses ( new ArrayList<> () );
				}
				var cap = new CapBonusDTO ();
				cap.setCapBonus ( s.getEffect () );
				cap.setValue ( (short) s.getAmount () );
				item.getCapBonuses ().add ( cap );
				break;
			default:
				throw new RuntimeException ( "Develop this too" );
			}
		}
		return create ( item );
	}
}
