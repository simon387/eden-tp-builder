package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.service.OtherService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/melee" )
public class OtherController {

	@Inject
	OtherService otherService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<String> getOthersNames () {
		Log.info ( "Calling getOthersNames" );
		return otherService.getAllOthersNames ();
	}
}
