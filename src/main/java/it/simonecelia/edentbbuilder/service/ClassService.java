package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.entity.Class_;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ClassService {

	public Class_ getByName ( String name ) {
		return Class_.find ( "LOWER(name) = LOWER(?1)", name ).firstResult ();
	}
}
