package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.dto.ItemDTO;
import it.simonecelia.edentbbuilder.entity.Item;
import it.simonecelia.edentbbuilder.model.MagicalBonuses;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


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

	public Item create ( ItemDTO itemDTO ) {
		if ( getByName ( itemDTO.getName () ) == null ) {
			return null;
		}
		var item = new Item ();
		item.setBonusLevel ( itemDTO.getBonusLevel () );
		item.setLevel ( itemDTO.getLevel () );

		var magicalBonuses = new MagicalBonuses ();
		if ( !itemDTO.getCapBonuses ().isEmpty () ) {
			for ( var cap : itemDTO.getCapBonuses () ) {

			}
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
