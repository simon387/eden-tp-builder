package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.enumeration.EnumUtils;
import it.simonecelia.edentbbuilder.enumeration.MagicEnum;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class MagicSkillService {

	public List<String> getAllMagicSkillsNames () {
		return EnumUtils.getEnumNames ( MagicEnum.class );
	}
}
