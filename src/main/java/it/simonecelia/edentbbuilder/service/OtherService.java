package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.enumeration.EnumUtils;
import it.simonecelia.edentbbuilder.enumeration.OtherEnum;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class OtherService {

	public List<String> getAllOthersNames () {
		return EnumUtils.getEnumNames ( OtherEnum.class );
	}
}
