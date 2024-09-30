package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.dto.ItemDTO;
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
	@Consumes ( MediaType.APPLICATION_JSON )
	public Response createItem ( ItemDTO itemDTO ) {
		Log.info ( "Calling createItem" );
		var createdItem = itemService.create ( itemDTO );
		if ( null == createdItem ) {
			return Response.status ( Response.Status.BAD_REQUEST ).build ();
		}

		// Restituisci una risposta con il nuovo item creato
		return Response.status ( Response.Status.CREATED ).entity ( createdItem ).build ();
	}
}
