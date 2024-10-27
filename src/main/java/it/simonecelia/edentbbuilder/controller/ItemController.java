package it.simonecelia.edentbbuilder.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edentbbuilder.dto.ItemDTO;
import it.simonecelia.edentbbuilder.dto.loki.SCItem;
import it.simonecelia.edentbbuilder.entity.Item;
import it.simonecelia.edentbbuilder.service.ItemService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;


@Path ( "/item" )
public class ItemController {

	@Inject
	ItemService itemService;

	@POST
	@Produces ( MediaType.APPLICATION_JSON )
	@Consumes ( MediaType.APPLICATION_JSON )
	public Response createItem ( ItemDTO itemDTO ) {
		Log.info ( "Calling createItem" );
		var createdItem = itemService.create ( itemDTO );
		if ( null == createdItem ) {
			return Response.status ( Response.Status.BAD_REQUEST ).build ();
		}

		return Response.status ( Response.Status.CREATED ).entity ( createdItem ).build ();
	}

	@GET
	@Produces ( MediaType.APPLICATION_JSON )
	public List<Item> getAllItems () {
		Log.info ( "Calling getAllItems" );
		return itemService.getAllItems ();
	}

	@GET
	@Path ( "/{id}" )
	@Produces ( MediaType.APPLICATION_JSON )
	public Response getItem ( @PathParam ( "id" ) Long id ) {
		Log.infof ( "Calling getItem for id: %s", id );
		var item = itemService.getById ( id );
		if ( null == item ) {
			return Response.status ( Response.Status.NOT_FOUND ).build ();
		} else {
			return Response.status ( Response.Status.OK ).entity ( item ).build ();
		}
	}

	@DELETE
	@Path ( "/{id}" )
	@Produces ( MediaType.APPLICATION_JSON )
	public Response deleteItem ( @PathParam ( "id" ) Long id ) {
		Log.infof ( "Calling deleteItem for id: %s", id );
		boolean deleted = itemService.delete ( id );
		if ( deleted ) {
			return Response.status ( Response.Status.NO_CONTENT ).build ();
		} else {
			return Response.status ( Response.Status.NOT_FOUND ).build ();
		}
	}

	@POST
	@Path ( "/xml" )
	@Produces ( MediaType.APPLICATION_JSON )
	@Consumes ( MediaType.APPLICATION_XML )
	public Response createItemFromXml ( SCItem scItem ) {
		Log.info ( "Received item in XML format" );
		var createdItem = itemService.createFromXml ( scItem );
		if ( null == createdItem ) {
			return Response.status ( Response.Status.BAD_REQUEST ).build ();
		}

		return Response.status ( Response.Status.CREATED ).entity ( createdItem ).build ();
	}
}
