package it.simonecelia.edentbbuilder.dto;

import java.io.Serial;
import java.io.Serializable;


@SuppressWarnings ( "unused" )
public class CharacterDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 105710234135587348L;

	private String name;

	private short level;

	private String className;

	private String chest;

	private String rightHand;

	private String jewel;

	private String twoHanded;

	private String legs;

	private String leftHand;

	private String arms;

	private String helm;

	private String belt;

	private String gloves;

	private String cloak;

	private String mythirian;

	private String necklace;

	private String lBracer;

	private String rBracer;

	private String lRing;

	private String rRing;

	private String boots;

	private String distance;

	public String getName () {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public short getLevel () {
		return level;
	}

	public void setLevel ( short level ) {
		this.level = level;
	}

	public String getClassName () {
		return className;
	}

	public void setClassName ( String className ) {
		this.className = className;
	}

	public String getChest () {
		return chest;
	}

	public void setChest ( String chest ) {
		this.chest = chest;
	}

	public String getRightHand () {
		return rightHand;
	}

	public void setRightHand ( String rightHand ) {
		this.rightHand = rightHand;
	}

	public String getJewel () {
		return jewel;
	}

	public void setJewel ( String jewel ) {
		this.jewel = jewel;
	}

	public String getTwoHanded () {
		return twoHanded;
	}

	public void setTwoHanded ( String twoHanded ) {
		this.twoHanded = twoHanded;
	}

	public String getLegs () {
		return legs;
	}

	public void setLegs ( String legs ) {
		this.legs = legs;
	}

	public String getLeftHand () {
		return leftHand;
	}

	public void setLeftHand ( String leftHand ) {
		this.leftHand = leftHand;
	}

	public String getArms () {
		return arms;
	}

	public void setArms ( String arms ) {
		this.arms = arms;
	}

	public String getHelm () {
		return helm;
	}

	public void setHelm ( String helm ) {
		this.helm = helm;
	}

	public String getBelt () {
		return belt;
	}

	public void setBelt ( String belt ) {
		this.belt = belt;
	}

	public String getGloves () {
		return gloves;
	}

	public void setGloves ( String gloves ) {
		this.gloves = gloves;
	}

	public String getCloak () {
		return cloak;
	}

	public void setCloak ( String cloak ) {
		this.cloak = cloak;
	}

	public String getMythirian () {
		return mythirian;
	}

	public void setMythirian ( String mythirian ) {
		this.mythirian = mythirian;
	}

	public String getNecklace () {
		return necklace;
	}

	public void setNecklace ( String necklace ) {
		this.necklace = necklace;
	}

	public String getlBracer () {
		return lBracer;
	}

	public void setlBracer ( String lBracer ) {
		this.lBracer = lBracer;
	}

	public String getrBracer () {
		return rBracer;
	}

	public void setrBracer ( String rBracer ) {
		this.rBracer = rBracer;
	}

	public String getlRing () {
		return lRing;
	}

	public void setlRing ( String lRing ) {
		this.lRing = lRing;
	}

	public String getrRing () {
		return rRing;
	}

	public void setrRing ( String rRing ) {
		this.rRing = rRing;
	}

	public String getBoots () {
		return boots;
	}

	public void setBoots ( String boots ) {
		this.boots = boots;
	}

	public String getDistance () {
		return distance;
	}

	public void setDistance ( String distance ) {
		this.distance = distance;
	}
}
