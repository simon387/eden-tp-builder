package it.simonecelia.edentbbuilder.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;


@Entity
public class Realm extends PanacheEntity {

	private String name;

	public Realm ( String name ) {
		this.name = name;
	}

	public Realm () {

	}

	public String getName () {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}
}
