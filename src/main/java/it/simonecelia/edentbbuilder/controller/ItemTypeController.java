package it.simonecelia.edentbbuilder.controller;

import it.simonecelia.edentbbuilder.entity.ItemType;
import it.simonecelia.edentbbuilder.service.ItemTypeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/itemType" )
public class ItemTypeController {

	@Inject
	ItemTypeService itemTypeService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<ItemType> getAllItemTypes () {
		return itemTypeService.findAllItemTypes ();
	}
}
