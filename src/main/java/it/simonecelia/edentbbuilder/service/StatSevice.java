package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.enumeration.EnumUtils;
import it.simonecelia.edentbbuilder.enumeration.StatEnum;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class StatSevice {

	public List<String> getAllStatsName () {
		return EnumUtils.getEnumNames ( StatEnum.class );
	}
}
