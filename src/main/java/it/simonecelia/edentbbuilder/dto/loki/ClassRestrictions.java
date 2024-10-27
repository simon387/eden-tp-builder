package it.simonecelia.edentbbuilder.dto.loki;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;


@XmlAccessorType ( XmlAccessType.FIELD )
public class ClassRestrictions {

	@XmlElement ( name = "CLASS" )
	private String className;

	public String getClassName () {
		return className;
	}

	public void setClassName ( String className ) {
		this.className = className;
	}
}
