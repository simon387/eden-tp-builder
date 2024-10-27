package it.simonecelia.edentbbuilder.dto.loki;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement ( name = "SCItem" )
@XmlAccessorType ( XmlAccessType.FIELD )
public class SCItem {

	@XmlElement ( name = "ActiveState" )
	private String activeState;

	@XmlElement ( name = "Location" )
	private String location;

	@XmlElement ( name = "Realm" )
	private String realm;

	@XmlElement ( name = "ItemName" )
	private String itemName;

	@XmlElement ( name = "Bonus" )
	private int bonus;

	@XmlElement ( name = "ItemQuality" )
	private int itemQuality;

	@XmlElement ( name = "Equipped" )
	private int equipped;

	@XmlElement ( name = "Level" )
	private int level;

	@XmlElement ( name = "OFFHAND" )
	private String offhand;

	@XmlElement ( name = "SOURCE" )
	private String source;

	@XmlElement ( name = "TYPE" )
	private String type;

	@XmlElement ( name = "DAMAGETYPE" )
	private String damageType;

	@XmlElement ( name = "Speed" )
	private int speed;

	@XmlElement ( name = "DBSOURCE" )
	private String dbSource;

	@XmlElement ( name = "CLASSRESTRICTIONS" )
	private ClassRestrictions classRestrictions;

	@XmlElement ( name = "DROPITEM" )
	private DropItem dropItem;

	public String getActiveState () {
		return activeState;
	}

	public void setActiveState ( String activeState ) {
		this.activeState = activeState;
	}

	public String getLocation () {
		return location;
	}

	public void setLocation ( String location ) {
		this.location = location;
	}

	public String getRealm () {
		return realm;
	}

	public void setRealm ( String realm ) {
		this.realm = realm;
	}

	public String getItemName () {
		return itemName;
	}

	public void setItemName ( String itemName ) {
		this.itemName = itemName;
	}

	public int getBonus () {
		return bonus;
	}

	public void setBonus ( int bonus ) {
		this.bonus = bonus;
	}

	public int getItemQuality () {
		return itemQuality;
	}

	public void setItemQuality ( int itemQuality ) {
		this.itemQuality = itemQuality;
	}

	public int getEquipped () {
		return equipped;
	}

	public void setEquipped ( int equipped ) {
		this.equipped = equipped;
	}

	public int getLevel () {
		return level;
	}

	public void setLevel ( int level ) {
		this.level = level;
	}

	public String getOffhand () {
		return offhand;
	}

	public void setOffhand ( String offhand ) {
		this.offhand = offhand;
	}

	public String getSource () {
		return source;
	}

	public void setSource ( String source ) {
		this.source = source;
	}

	public String getType () {
		return type;
	}

	public void setType ( String type ) {
		this.type = type;
	}

	public String getDamageType () {
		return damageType;
	}

	public void setDamageType ( String damageType ) {
		this.damageType = damageType;
	}

	public int getSpeed () {
		return speed;
	}

	public void setSpeed ( int speed ) {
		this.speed = speed;
	}

	public String getDbSource () {
		return dbSource;
	}

	public void setDbSource ( String dbSource ) {
		this.dbSource = dbSource;
	}

	public ClassRestrictions getClassRestrictions () {
		return classRestrictions;
	}

	public void setClassRestrictions ( ClassRestrictions classRestrictions ) {
		this.classRestrictions = classRestrictions;
	}

	public DropItem getDropItem () {
		return dropItem;
	}

	public void setDropItem ( DropItem dropItem ) {
		this.dropItem = dropItem;
	}
}
