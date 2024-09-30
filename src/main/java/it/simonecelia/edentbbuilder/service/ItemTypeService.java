package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.entity.ItemType;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ItemTypeService {

	public ItemType getByName ( String name ) {
		return ItemType.find ( "LOWER(type) = LOWER(?1)", name ).firstResult ();
	}
}
