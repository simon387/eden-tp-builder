package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.service.MagicSkillService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/magic" )
public class MagicSkillController {

	@Inject
	MagicSkillService magicSkillService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<String> getMagicSkillsNames () {
		Log.info ( "Calling getMagicSkillsNames" );
		return magicSkillService.getAllMagicSkillsNames ();
	}
}
