package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.service.ReportService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path ( "/report/character" )
public class ReportController {

	@Inject
	ReportService reportService;

	@GET
	@Path ( "/{id}" )
	@Produces ( MediaType.APPLICATION_JSON )
	public Response generateReport ( @PathParam ( "id" ) Long id ) {
		Log.info ( "Calling generateReport" );
		var report = reportService.generateByCharacterId ( id );
		if ( report == null ) {
			return Response.status ( Response.Status.NOT_FOUND ).build ();
		} else {
			return Response.status ( Response.Status.OK ).entity ( report ).build ();
		}
	}
}
