package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.model.Report;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


@ApplicationScoped
public class ReportService {

	@Inject
	CharacterService characterService;

	public Report generateByCharacterId ( Long id ) {
		var character = characterService.getCharaceterById ( id );
		if ( character == null ) {
			return null;
		}


		return null;
	}
}
