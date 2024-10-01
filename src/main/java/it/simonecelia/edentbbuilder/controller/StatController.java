package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.service.StatSevice;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/stat" )
public class StatController {

	@Inject
	StatSevice statSevice;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<String> getStatNames () {
		Log.info ( "Calling getStatNames" );
		return statSevice.getAllStatsName ();
	}
}
