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
		var count = (Long) entityManager.createQuery ( "SELECT COUNT(r) FROM Realm r" ).getSingleResult ();

		if ( count == 0 ) {
			entityManager.persist ( new Realm ( "Albion" ) );
			entityManager.persist ( new Realm ( "Hibernia" ) );
			entityManager.persist ( new Realm ( "Midgard" ) );
			entityManager.persist ( new Realm ( "Any" ) );
		}

		count = (Long) entityManager.createQuery ( "SELECT COUNT(c) FROM Class_ c" ).getSingleResult ();

		if ( count == 0 ) {
			entityManager.persist ( new Class_ ( "Armsman", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Mercenary", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Paladin", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Reaver", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Cabalist", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Necromancer", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Sorcerer", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Theurgist", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Wizard", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Cleric", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Friar", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Heretic", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Infiltrator", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Minstrel", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Scout", realmService.getByName ( "Albion" ) ) );
			entityManager.persist ( new Class_ ( "Blademaster", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Champion", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Hero", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Valewalker", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Animist", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Eldritch", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Enchanter", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Mentalist", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Bainshee", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Bard", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Druid", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Warden", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Nightshade", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Ranger", realmService.getByName ( "Hibernia" ) ) );
			entityManager.persist ( new Class_ ( "Berserker", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Savage", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Skald", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Valkyrie", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Bonedancer", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Runemaster", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Spiritmaster", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Healer", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Shaman", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Hunter", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Shadowblade", realmService.getByName ( "Midgard" ) ) );
			entityManager.persist ( new Class_ ( "Any", realmService.getByName ( "Any" ) ) );
		}

		count = (Long) entityManager.createQuery ( "SELECT COUNT(i) FROM ItemType i" ).getSingleResult ();

		if ( count == 0 ) {
			entityManager.persist ( new ItemType ( "Axe" ) );
			entityManager.persist ( new ItemType ( "Blunt" ) );
			entityManager.persist ( new ItemType ( "Celtic Spear" ) );
			entityManager.persist ( new ItemType ( "Chain" ) );
			entityManager.persist ( new ItemType ( "Cloth" ) );
			entityManager.persist ( new ItemType ( "Composite Bow" ) );
			entityManager.persist ( new ItemType ( "Crushing" ) );
			entityManager.persist ( new ItemType ( "Flexible" ) );
			entityManager.persist ( new ItemType ( "Hammer" ) );
			entityManager.persist ( new ItemType ( "Hand to Hand" ) );
			entityManager.persist ( new ItemType ( "Large Weapons" ) );
			entityManager.persist ( new ItemType ( "Leather" ) );
			entityManager.persist ( new ItemType ( "Longbow" ) );
			entityManager.persist ( new ItemType ( "Magical" ) );
			entityManager.persist ( new ItemType ( "Plate" ) );
			entityManager.persist ( new ItemType ( "Polearm" ) );
			entityManager.persist ( new ItemType ( "Recursive Bow" ) );
			entityManager.persist ( new ItemType ( "Reinforced" ) );
			entityManager.persist ( new ItemType ( "Scale" ) );
			entityManager.persist ( new ItemType ( "Scythe" ) );
			entityManager.persist ( new ItemType ( "Shield" ) );
			entityManager.persist ( new ItemType ( "Short Bow" ) );
			entityManager.persist ( new ItemType ( "Slashing" ) );
			entityManager.persist ( new ItemType ( "Spear" ) );
			entityManager.persist ( new ItemType ( "Staff" ) );
			entityManager.persist ( new ItemType ( "Studded" ) );
			entityManager.persist ( new ItemType ( "Sword" ) );
			entityManager.persist ( new ItemType ( "Thrust" ) );
			entityManager.persist ( new ItemType ( "Two Handed" ) );
			entityManager.persist ( new ItemType ( "Piercing" ) );
			// ne mancherà qualcuno
		}

		count = (Long) entityManager.createQuery ( "SELECT COUNT(s) FROM Slot s" ).getSingleResult ();

		if ( count == 0 ) {
			entityManager.persist ( new Slot ( "Chest" ) );
			entityManager.persist ( new Slot ( "Right Hand" ) );
			entityManager.persist ( new Slot ( "Jewel" ) );
			entityManager.persist ( new Slot ( "Two Handed" ) );
			entityManager.persist ( new Slot ( "Legs" ) );
			entityManager.persist ( new Slot ( "Left Hand" ) );
			entityManager.persist ( new Slot ( "Arms" ) );
			entityManager.persist ( new Slot ( "Helm" ) );
			entityManager.persist ( new Slot ( "Belt" ) );
			entityManager.persist ( new Slot ( "Gloves" ) );
			entityManager.persist ( new Slot ( "Cloak" ) );
			entityManager.persist ( new Slot ( "Mythirian" ) );
			entityManager.persist ( new Slot ( "Necklace" ) );
			entityManager.persist ( new Slot ( "Bracer" ) );
			entityManager.persist ( new Slot ( "Ring" ) );
			entityManager.persist ( new Slot ( "Boots" ) );
			entityManager.persist ( new Slot ( "Distance" ) );
		}

	}
}
