package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.enumeration.EnumUtils;
import it.simonecelia.edentbbuilder.enumeration.ResistEnum;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class ResistService {

	public List<String> getAllResistNames () {
		return EnumUtils.getEnumNames ( ResistEnum.class );
	}
}
