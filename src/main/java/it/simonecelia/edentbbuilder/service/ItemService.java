package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.dto.ItemDTO;
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

	@Transactional
	public Item create ( ItemDTO itemDTO ) {
		if ( getByName ( itemDTO.getName () ) != null ) {
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
		if ( !itemDTO.getOthers ().isEmpty () ) {
			List<Other> others = new ArrayList<> ();
			for ( var otherDTO : itemDTO.getOthers () ) {
				var other = new Other ();
				other.setOtherEnum ( EnumUtils.fromStringIgnoreCase ( OtherEnum.class, otherDTO.getOther () ) );
				other.setValue ( otherDTO.getValue () );
				others.add ( other );
			}
			magicalBonuses.setOthers ( others );
		}
		if ( !itemDTO.getResists ().isEmpty () ) {
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
}
