package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.entity.Slot;
import it.simonecelia.edentbbuilder.service.SlotService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/slot" )
public class SlotController {

	@Inject
	SlotService slotService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<Slot> getAllSlots () {
		Log.info ( "Calling getAllSlots" );
		return slotService.findAllSlots ();
	}
}
