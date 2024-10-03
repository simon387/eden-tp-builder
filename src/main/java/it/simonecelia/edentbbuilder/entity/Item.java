package it.simonecelia.edentbbuilder.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import it.simonecelia.edentbbuilder.model.MagicalBonuses;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@SuppressWarnings ( "unused" )
public class Item extends PanacheEntity {

	private String name;

	@ManyToOne
	@JoinColumn ( name = "type_id" )
	private ItemType type;

	@ManyToOne
	@JoinColumn ( name = "slot_id" )
	private Slot slot;

	// classes per ora non mi interessa //TODO

	private int level;

	private float utility;

	private boolean tradeable;

	private int model;

	//dps

	//speed

	//damage type

	//quality

	@ManyToOne
	@JoinColumn ( name = "realm_id" )
	private Realm realm;

	private int requiredLevel;

	private int bonusLevel;

	@Column (name = "magicalBonuses", length = 2048) // crea su mysql varbinary(1024), di default era 255 e rompeva
	private MagicalBonuses magicalBonuses;

	public String getName () {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public ItemType getType () {
		return type;
	}

	public void setType ( ItemType type ) {
		this.type = type;
	}

	public Slot getSlot () {
		return slot;
	}

	public void setSlot ( Slot slot ) {
		this.slot = slot;
	}

	public int getLevel () {
		return level;
	}

	public void setLevel ( int level ) {
		this.level = level;
	}

	public float getUtility () {
		return utility;
	}

	public void setUtility ( float utility ) {
		this.utility = utility;
	}

	public boolean isTradeable () {
		return tradeable;
	}

	public void setTradeable ( boolean tradeable ) {
		this.tradeable = tradeable;
	}

	public int getModel () {
		return model;
	}

	public void setModel ( int model ) {
		this.model = model;
	}

	public Realm getRealm () {
		return realm;
	}

	public void setRealm ( Realm realm ) {
		this.realm = realm;
	}

	public int getRequiredLevel () {
		return requiredLevel;
	}

	public void setRequiredLevel ( int requiredLevel ) {
		this.requiredLevel = requiredLevel;
	}

	public int getBonusLevel () {
		return bonusLevel;
	}

	public void setBonusLevel ( int bonusLevel ) {
		this.bonusLevel = bonusLevel;
	}

	public MagicalBonuses getMagicalBonuses () {
		return magicalBonuses;
	}

	public void setMagicalBonuses ( MagicalBonuses magicalBonuses ) {
		this.magicalBonuses = magicalBonuses;
	}
}
