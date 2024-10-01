package it.simonecelia.edentbbuilder.service;

import it.simonecelia.edentbbuilder.enumeration.EnumUtils;
import it.simonecelia.edentbbuilder.enumeration.ToAEnum;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


@ApplicationScoped
public class ToAService {

	public List<String> getAllToAsNames () {
		return EnumUtils.getEnumNames ( ToAEnum.class );
	}
}
