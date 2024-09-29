package it.simonecelia.edentbbuilder.setup;

import io.quarkus.runtime.StartupEvent;
import it.simonecelia.edentbbuilder.entity.Class_;
import it.simonecelia.edentbbuilder.entity.Realm;
import it.simonecelia.edentbbuilder.service.RealmService;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@SuppressWarnings ( "unused" )
public class StartupDataInserter {

	@Inject
	EntityManager entityManager;

	@Inject
	RealmService realmService;

	@Transactional
	public void onStart ( @Observes StartupEvent ev ) {
		var query = entityManager.createQuery ( "SELECT COUNT(r) FROM Realm r" );
		var count = (Long) query.getSingleResult ();

		if ( count == 0 ) {
			var albion = new Realm ( "Albion" );
			var hibernia = new Realm ( "Hibernia" );
			var midgard = new Realm ( "Midgard" );
			var any = new Realm ( "Any" );

			entityManager.persist ( albion );
			entityManager.persist ( hibernia );
			entityManager.persist ( midgard );
			entityManager.persist ( any );
		}

		query = entityManager.createQuery ( "SELECT COUNT(c) FROM Class_ c" );
		count = (Long) query.getSingleResult ();

		if ( count == 0 ) {
			var armsman = new Class_ ( "Armsman", realmService.getByName ( "Albion" ) );
			entityManager.persist ( armsman );
			var mercenary = new Class_ ( "Mercenary", realmService.getByName ( "Albion" ) );
			entityManager.persist ( mercenary );
			var paladin = new Class_ ( "Paladin", realmService.getByName ( "Albion" ) );
			entityManager.persist ( paladin );
			//TODO
			var bard = new Class_ ( "Bard", realmService.getByName ( "Hibernia" ) );
			entityManager.persist ( bard );
			//TODO
			var runemaster = new Class_ ( "Runemaster", realmService.getByName ( "Midgard" ) );
			entityManager.persist ( runemaster );
		}
	}
}
