package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.service.CharacterService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/character" )
public class CharacterController {

	@Inject
	CharacterService characterService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<String> getAllCharacters () { //TODO
		Log.info ( "Calling getAllCharacters" );
		return null;
	}
}
