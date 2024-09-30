package it.simonecelia.edentbbuilder.controller;

import it.simonecelia.edentbbuilder.dto.ItemDTO;
import it.simonecelia.edentbbuilder.entity.Item;
import it.simonecelia.edentbbuilder.service.ItemService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path ( "/item" )
public class ItemController {

	@Inject
	ItemService itemService;

	@POST
	@Produces ( MediaType.APPLICATION_JSON )
	@Consumes ( MediaType.APPLICATION_JSON ) // Specifica che il metodo consuma JSON
	public Response createItem ( ItemDTO itemDTO ) {
		// Crea e salva l'item usando il servizio
		Item createdItem = itemService.create ( itemDTO );

		// Restituisci una risposta con il nuovo item creato
		return Response.status ( Response.Status.CREATED ).entity ( createdItem ).build ();
	}
}
