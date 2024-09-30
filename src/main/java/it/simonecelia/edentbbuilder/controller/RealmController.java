package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.entity.Realm;
import it.simonecelia.edentbbuilder.service.RealmService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path ( "/realm" )
public class RealmController {

	@Inject
	RealmService realmService;

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<Realm> getAllRealms () {
		Log.info ( "Calling getAllRealms" );
		return realmService.findAllRealms ();
	}
}
