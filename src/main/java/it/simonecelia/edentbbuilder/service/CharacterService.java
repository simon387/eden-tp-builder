package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.entity.Character_;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class CharacterService {

	public List<Character_> getAllCharaceters () {
		return Character_.listAll ();
	}
}
