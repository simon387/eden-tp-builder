package it.simonecelia.edentbbuilder.dto.loki;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;


@XmlAccessorType ( XmlAccessType.FIELD )
public class Slot {

	@XmlAttribute ( name = "Number" )
	private int number;

	@XmlElement ( name = "Remakes" )
	private int remakes;

	@XmlElement ( name = "Effect" )
	private String effect;

	@XmlElement ( name = "Qua" )
	private int qua;

	@XmlElement ( name = "Amount" )
	private int amount;

	@XmlElement ( name = "Done" )
	private int done;

	@XmlElement ( name = "Time" )
	private int time;

	@XmlElement ( name = "Type" )
	private String type;

	public int getNumber () {
		return number;
	}

	public void setNumber ( int number ) {
		this.number = number;
	}

	public int getRemakes () {
		return remakes;
	}

	public void setRemakes ( int remakes ) {
		this.remakes = remakes;
	}

	public String getEffect () {
		return effect;
	}

	public void setEffect ( String effect ) {
		this.effect = effect;
	}

	public int getQua () {
		return qua;
	}

	public void setQua ( int qua ) {
		this.qua = qua;
	}

	public int getAmount () {
		return amount;
	}

	public void setAmount ( int amount ) {
		this.amount = amount;
	}

	public int getDone () {
		return done;
	}

	public void setDone ( int done ) {
		this.done = done;
	}

	public int getTime () {
		return time;
	}

	public void setTime ( int time ) {
		this.time = time;
	}

	public String getType () {
		return type;
	}

	public void setType ( String type ) {
		this.type = type;
	}
}
