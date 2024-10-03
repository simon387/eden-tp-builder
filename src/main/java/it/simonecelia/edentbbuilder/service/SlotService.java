package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.entity.Slot;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class SlotService {

	public Slot getByName ( String name ) {
		return Slot.find ( "LOWER(slot) = LOWER(?1)", name ).firstResult ();
	}

	public List<Slot> findAllSlots () {
		return Slot.list("ORDER BY slot ASC");
	}
}
