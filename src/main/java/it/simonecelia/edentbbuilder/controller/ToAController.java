package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.service.ToAService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/toa" )
public class ToAController {

	@Inject
	ToAService toAService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<String> getToAsNames () {
		Log.info ( "Calling getToAsNames" );
		return toAService.getAllToAsNames ();
	}
}
