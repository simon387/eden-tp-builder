package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.enumeration.CaPBonusEnum;
import it.simonecelia.edentbbuilder.enumeration.EnumUtils;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class CapBonusService {

	public List<String> getAllCapBonusesNames () {
		return EnumUtils.getEnumNames ( CaPBonusEnum.class );
	}
}
