package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.service.ResistService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/resist" )
public class ResistController {

	@Inject
	ResistService resistService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<String> getResistNames () {
		Log.info ( "Calling getResistNames" );
		return resistService.getAllResistNames ();
	}
}
