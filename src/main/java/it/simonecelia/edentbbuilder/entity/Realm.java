package it.simonecelia.edentbbuilder.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;


@Entity
public class Realm extends PanacheEntity {

	public String name;

	public Realm ( String name ) {
		this.name = name;
	}

	public Realm () {

	}
}
