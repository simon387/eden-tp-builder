package it.simonecelia.edentbbuilder.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;


@Entity
@SuppressWarnings ( "unused" )
public class Slot extends PanacheEntity {

	private String slot;

	public Slot ( String slot ) {
		this.slot = slot;
	}

	public Slot () {

	}

	public String getSlot () {
		return slot;
	}

	public void setSlot ( String slot ) {
		this.slot = slot;
	}
}
