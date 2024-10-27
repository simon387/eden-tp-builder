package it.simonecelia.edentbbuilder.dto.loki;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.List;


@XmlAccessorType ( XmlAccessType.FIELD )
public class DropItem {

	@XmlElement ( name = "SLOT" )
	private List<Slot> slots;

	public List<Slot> getSlots () {
		return slots;
	}

	public void setSlots ( List<Slot> slots ) {
		this.slots = slots;
	}
}
