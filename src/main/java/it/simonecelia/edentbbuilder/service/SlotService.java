package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.entity.Slot;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class SlotService {

	public Slot getByName ( String name ) {
		return Slot.find ( "LOWER(slot) = LOWER(?1)", name ).firstResult ();
	}
}
