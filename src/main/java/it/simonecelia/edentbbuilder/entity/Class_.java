package it.simonecelia.edentbbuilder.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@SuppressWarnings ( "unused" )
public class Class_ extends PanacheEntity {

	private String name;

	@ManyToOne
	@JoinColumn ( name = "realm_id" )
	public Realm realm;

	public Class_ ( String name, Realm realm ) {
		this.name = name;
		this.realm = realm;
	}

	public Class_ () {

	}

	public String getName () {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public Realm getRealm () {
		return realm;
	}

	public void setRealm ( Realm realm ) {
		this.realm = realm;
	}
}
