package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.service.CapBonusService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/cap" )
public class CapBonusController {

	@Inject
	CapBonusService capBonusService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<String> getCapBonusesNames () {
		Log.info ( "Calling getCapBonusesNames" );
		return capBonusService.getAllCapBonusesNames ();
	}
}
