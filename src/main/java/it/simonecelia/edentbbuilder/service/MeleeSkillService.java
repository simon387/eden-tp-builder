package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.enumeration.EnumUtils;
import it.simonecelia.edentbbuilder.enumeration.MeleeEnum;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class MeleeSkillService {

	public List<String> getAllMeleeSkillsNames () {
		return EnumUtils.getEnumNames ( MeleeEnum.class );
	}
}
