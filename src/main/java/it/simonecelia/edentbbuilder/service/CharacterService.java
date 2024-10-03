package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.dto.CharacterDTO;
import it.simonecelia.edentbbuilder.entity.Character_;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;


@ApplicationScoped
public class CharacterService {

	public List<Character_> getAllCharaceters () {
		return Character_.listAll ();
	}

	@Transactional
	public Character_ create ( CharacterDTO characterDTO ) {
		return null;
	}
}
