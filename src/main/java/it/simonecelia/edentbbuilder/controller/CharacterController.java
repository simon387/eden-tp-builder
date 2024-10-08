package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.dto.CharacterDTO;
import it.simonecelia.edentbbuilder.service.CharacterService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path ( "/character" )
public class CharacterController {

	@Inject
	CharacterService characterService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public Response getAllCharacters () {
		Log.info ( "Calling getAllCharacters" );
		var chars = characterService.getAllCharaceters ();
		if ( chars.isEmpty () ) {
			return Response.status ( Response.Status.NOT_FOUND ).build ();
		} else {
			return Response.status ( Response.Status.OK ).entity ( chars ).build ();
		}
	}

	@POST
	@Produces ( MediaType.APPLICATION_JSON )
	@Consumes ( MediaType.APPLICATION_JSON )
	public Response createCharacter ( CharacterDTO characterDTO ) {
		Log.info ( "Calling createCharacter" );
		var createdItem = characterService.create ( characterDTO );
		if ( null == createdItem ) {
			return Response.status ( Response.Status.BAD_REQUEST ).build ();
		}

		return Response.status ( Response.Status.CREATED ).entity ( createdItem ).build ();
	}
}
