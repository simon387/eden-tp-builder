package it.simonecelia.edentbbuilder.setup;

import io.quarkus.runtime.StartupEvent;
import it.simonecelia.edentbbuilder.entity.Class_;
import it.simonecelia.edentbbuilder.entity.ItemType;
import it.simonecelia.edentbbuilder.entity.Realm;
import it.simonecelia.edentbbuilder.entity.Slot;
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
			//Todo
			var any = new Class_ ( "Any", realmService.getByName ( "Any" ) );
		}

		query = entityManager.createQuery ( "SELECT COUNT(i) FROM ItemType i" );
		count = (Long) query.getSingleResult ();

		if ( count == 0 ) {
			var scale = new ItemType ( "Scale" );
			entityManager.persist ( scale );
			var chain = new ItemType ( "Chain" );
			entityManager.persist ( chain );
			var cloth = new ItemType ( "Cloth" );
			entityManager.persist ( cloth );
			var hammer = new ItemType ( "Hammer" );
			entityManager.persist ( hammer );
			var blunt = new ItemType ( "Blunt" );
			entityManager.persist ( blunt );
			var crushing = new ItemType ( "Crushing" );
			entityManager.persist ( crushing );
			var studded = new ItemType ( "Studded" );
			entityManager.persist ( studded );
			var staff = new ItemType ( "Staff" );
			entityManager.persist ( staff );
			//TODO
		}

		query = entityManager.createQuery ( "SELECT COUNT(s) FROM Slot s" );
		count = (Long) query.getSingleResult ();

		if ( count == 0 ) {
			var chest = new Slot ( "Chest" );
			entityManager.persist ( chest );
			var rightHand = new Slot ( "Right Hand" );
			entityManager.persist ( rightHand );
			var jewel = new Slot ( "Jewel" );
			entityManager.persist ( jewel );
			var twoHanded = new Slot ( "Two Handed" );
			entityManager.persist ( twoHanded );
			var legs = new Slot ( "Legs" );
			entityManager.persist ( legs );
			var leftHand = new Slot ( "Left Hand" );
			entityManager.persist ( leftHand );
			var arms = new Slot ( "Arms" );
			entityManager.persist ( arms );
			var helm = new Slot ( "Helm" );
			entityManager.persist ( helm );
			var belt = new Slot ( "Belt" );
			entityManager.persist ( belt );
			var gloves = new Slot ( "Gloves" );
			entityManager.persist ( gloves );
			var cloak = new Slot ( "Cloak" );
			entityManager.persist ( cloak );
			var mythirian = new Slot ( "Mythirian" );
			entityManager.persist ( mythirian );
			var necklace = new Slot ( "Necklace" );
			entityManager.persist ( necklace );
			var bracer = new Slot ( "Bracer" );
			entityManager.persist ( bracer );
			var ring = new Slot ( "Ring" );
			entityManager.persist ( ring );
			var boots = new Slot ( "Boots" );
			entityManager.persist ( boots );
			var distance = new Slot ( "Distance" );
			entityManager.persist ( distance );
		}

//		query = entityManager.createQuery ( "SELECT COUNT(s) FROM Stat s" );
//		count = (Long) query.getSingleResult ();
//
//		if ( count == 0 ) {
//			var dex = new Stat ( "Dexterity" );
//			entityManager.persist ( dex );
//		}
	}
}
