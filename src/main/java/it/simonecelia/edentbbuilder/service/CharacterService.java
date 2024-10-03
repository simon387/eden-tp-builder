package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.dto.CharacterDTO;
import it.simonecelia.edentbbuilder.entity.Character_;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;


@ApplicationScoped
public class CharacterService {

	@Inject
	ClassService classService;

	@Inject
	ItemService itemService;

	public List<Character_> getAllCharaceters () {
		return Character_.listAll ();
	}

	public Character_ getCharaceterById ( long id ) { //TODO bug strano, va solo così per ora
		return Character_.<Character_>listAll ().stream ()
						.filter ( character -> character.id == id )  // Filtro per ID
						.findFirst ()  // Trova il primo match
						.orElse ( null );
	}

	@Transactional
	public Character_ create ( CharacterDTO characterDTO ) {
		var character = new Character_ ();
		character.setName ( characterDTO.getName () );
		character.setLevel ( characterDTO.getLevel () );
		character.setClass_ ( classService.getByName ( characterDTO.getClassName () ) );

		//TODO non c'è il check sugli slot, sticazzi
		character.setArms ( itemService.getByName ( characterDTO.getArms () ) );
		character.setChest ( itemService.getByName ( characterDTO.getChest () ) );
		character.setCloak ( itemService.getByName ( characterDTO.getCloak () ) );
		character.setDistance ( itemService.getByName ( characterDTO.getDistance () ) );
		character.setBelt ( itemService.getByName ( characterDTO.getBelt () ) );
		character.setFeet ( itemService.getByName ( characterDTO.getBoots () ) );
		character.setHands ( itemService.getByName ( characterDTO.getGloves () ) );
		character.setHelm ( itemService.getByName ( characterDTO.getHelm () ) );
		character.setJewel ( itemService.getByName ( characterDTO.getJewel () ) );
		character.setlBracer ( itemService.getByName ( characterDTO.getlBracer () ) );
		character.setrBracer ( itemService.getByName ( characterDTO.getrBracer () ) );
		character.setlRing ( itemService.getByName ( characterDTO.getlRing () ) );
		character.setrRing ( itemService.getByName ( characterDTO.getrRing () ) );
		character.setLegs ( itemService.getByName ( characterDTO.getLegs () ) );
		character.setMythirian ( itemService.getByName ( characterDTO.getMythirian () ) );
		character.setNecklace ( itemService.getByName ( characterDTO.getNecklace () ) );
		character.setOffHand ( itemService.getByName ( characterDTO.getLeftHand () ) );
		character.setOneHand ( itemService.getByName ( characterDTO.getRightHand () ) );
		character.setTwoHand ( itemService.getByName ( characterDTO.getTwoHanded () ) );

		character.persist ();
		return character;
	}
}
