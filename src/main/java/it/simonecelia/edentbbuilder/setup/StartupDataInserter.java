package it.simonecelia.edentbbuilder.setup;

import io.quarkus.runtime.StartupEvent;
import it.simonecelia.edentbbuilder.entity.Realm;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@SuppressWarnings ( "unused" )
public class StartupDataInserter {

	@Inject
	EntityManager entityManager;

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
	}
}
