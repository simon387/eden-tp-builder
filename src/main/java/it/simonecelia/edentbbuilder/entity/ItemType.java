package it.simonecelia.edentbbuilder.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;


@Entity
@SuppressWarnings ( "unused" )
public class ItemType extends PanacheEntity {

	private String type;

	public ItemType ( String type ) {
		this.type = type;
	}

	public ItemType () {

	}

	public String getType () {
		return type;
	}

	public void setType ( String type ) {
		this.type = type;
	}
}
