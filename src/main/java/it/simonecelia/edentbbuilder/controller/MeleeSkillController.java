package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.service.MeleeSkillService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/melee" )
public class MeleeSkillController {

	@Inject
	MeleeSkillService meleeSkillService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<String> getMeleecSkillsNames () {
		Log.info ( "Calling getMeleecSkillsNames" );
		return meleeSkillService.getAllMeleeSkillsNames ();
	}
}
