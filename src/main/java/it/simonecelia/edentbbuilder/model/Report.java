package it.simonecelia.edentbbuilder.model;

import java.io.Serial;
import java.io.Serializable;


public class Report implements Serializable {

	@Serial
	private static final long serialVersionUID = 545883382056982722L;

	private String title;

	//TODO

	public String getTitle () {
		return title;
	}

	public void setTitle ( String title ) {
		this.title = title;
	}
}
