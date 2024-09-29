package it.simonecelia.edentbbuilder.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@SuppressWarnings ( "unused" )
public class Character_ extends PanacheEntity {

	private String name;

	@ManyToOne
	@JoinColumn ( name = "class__id" )
	private Class_ class_;

	private int level;

	@ManyToOne
	@JoinColumn ( name = "chest_id" )
	private Item chest;

	@ManyToOne
	@JoinColumn ( name = "necklace_id" )
	private Item necklace;

	@ManyToOne
	@JoinColumn ( name = "mythirian_id" )
	private Item mythirian;

	@ManyToOne
	@JoinColumn ( name = "cloak_id" )
	private Item cloak;

	@ManyToOne
	@JoinColumn ( name = "helm_id" )
	private Item helm;

	@ManyToOne
	@JoinColumn ( name = "arms_id" )
	private Item arms;

	@ManyToOne
	@JoinColumn ( name = "hands_id" )
	private Item hands;

	@ManyToOne
	@JoinColumn ( name = "jewel_id" )
	private Item jewel;

	@ManyToOne
	@JoinColumn ( name = "l_ring_id" )
	private Item lRing;

	@ManyToOne
	@JoinColumn ( name = "r_ring_id" )
	private Item rRing;

	@ManyToOne
	@JoinColumn ( name = "l_bracer_id" )
	private Item lBracer;

	@ManyToOne
	@JoinColumn ( name = "r_bracer_id" )
	private Item rBracer;

	@ManyToOne
	@JoinColumn ( name = "legs_id" )
	private Item legs;

	@ManyToOne
	@JoinColumn ( name = "feet_id" )
	private Item feet;

	@ManyToOne
	@JoinColumn ( name = "one_hand_id" )
	private Item oneHand;

	@ManyToOne
	@JoinColumn ( name = "off_hand_id" )
	private Item offHand;

	@ManyToOne
	@JoinColumn ( name = "two_hand_id" )
	private Item twoHand;

	@ManyToOne
	@JoinColumn ( name = "distance_id" )
	private Item distance;

	public String getName () {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public Class_ getClass_ () {
		return class_;
	}

	public void setClass_ ( Class_ class_ ) {
		this.class_ = class_;
	}

	public int getLevel () {
		return level;
	}

	public void setLevel ( int level ) {
		this.level = level;
	}

	public Item getChest () {
		return chest;
	}

	public void setChest ( Item chest ) {
		this.chest = chest;
	}

	public Item getNecklace () {
		return necklace;
	}

	public void setNecklace ( Item necklace ) {
		this.necklace = necklace;
	}

	public Item getMythirian () {
		return mythirian;
	}

	public void setMythirian ( Item mythirian ) {
		this.mythirian = mythirian;
	}

	public Item getCloak () {
		return cloak;
	}

	public void setCloak ( Item cloak ) {
		this.cloak = cloak;
	}

	public Item getHelm () {
		return helm;
	}

	public void setHelm ( Item helm ) {
		this.helm = helm;
	}

	public Item getArms () {
		return arms;
	}

	public void setArms ( Item arms ) {
		this.arms = arms;
	}

	public Item getHands () {
		return hands;
	}

	public void setHands ( Item hands ) {
		this.hands = hands;
	}

	public Item getJewel () {
		return jewel;
	}

	public void setJewel ( Item jewel ) {
		this.jewel = jewel;
	}

	public Item getlRing () {
		return lRing;
	}

	public void setlRing ( Item lRing ) {
		this.lRing = lRing;
	}

	public Item getrRing () {
		return rRing;
	}

	public void setrRing ( Item rRing ) {
		this.rRing = rRing;
	}

	public Item getlBracer () {
		return lBracer;
	}

	public void setlBracer ( Item lBracer ) {
		this.lBracer = lBracer;
	}

	public Item getrBracer () {
		return rBracer;
	}

	public void setrBracer ( Item rBracer ) {
		this.rBracer = rBracer;
	}

	public Item getLegs () {
		return legs;
	}

	public void setLegs ( Item legs ) {
		this.legs = legs;
	}

	public Item getFeet () {
		return feet;
	}

	public void setFeet ( Item feet ) {
		this.feet = feet;
	}

	public Item getOneHand () {
		return oneHand;
	}

	public void setOneHand ( Item oneHand ) {
		this.oneHand = oneHand;
	}

	public Item getOffHand () {
		return offHand;
	}

	public void setOffHand ( Item offHand ) {
		this.offHand = offHand;
	}

	public Item getTwoHand () {
		return twoHand;
	}

	public void setTwoHand ( Item twoHand ) {
		this.twoHand = twoHand;
	}

	public Item getDistance () {
		return distance;
	}

	public void setDistance ( Item distance ) {
		this.distance = distance;
	}
}
