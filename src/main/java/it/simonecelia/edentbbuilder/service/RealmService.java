package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.entity.Realm;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class RealmService {

	public List<Realm> findAllRealms () {
		return Realm.listAll ();
	}

	public Realm getByName ( String name ) {
		return Realm.find ( "name", name ).firstResult ();
	}
}
