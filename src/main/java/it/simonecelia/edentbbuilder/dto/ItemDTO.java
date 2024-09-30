package it.simonecelia.edentbbuilder.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@SuppressWarnings ( "unused" )
public class ItemDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = -7320256725929878523L;

	private String name;

	private String type;

	private String slot;

	private int level;

	private String realm;

	private int requiredLevel;

	private int bonusLevel;

	private List<StatDTO> stats;

	private List<CapBonusDTO> capBonuses;

	private List<ToADTO> toas;

	private List<MeleeDTO> melees;

	private List<MagicDTO> magics;

	private List<ResistDTO> resists;

	private List<OtherDTO> others;

	private short model;

	private boolean tradeable;

	private float utility;

	public String getName () {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public String getType () {
		return type;
	}

	public void setType ( String type ) {
		this.type = type;
	}

	public String getSlot () {
		return slot;
	}

	public void setSlot ( String slot ) {
		this.slot = slot;
	}

	public int getLevel () {
		return level;
	}

	public void setLevel ( int level ) {
		this.level = level;
	}

	public String getRealm () {
		return realm;
	}

	public void setRealm ( String realm ) {
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

	public List<StatDTO> getStats () {
		return stats;
	}

	public void setStats ( List<StatDTO> stats ) {
		this.stats = stats;
	}

	public List<CapBonusDTO> getCapBonuses () {
		return capBonuses;
	}

	public void setCapBonuses ( List<CapBonusDTO> capBonuses ) {
		this.capBonuses = capBonuses;
	}

	public List<ToADTO> getToas () {
		return toas;
	}

	public void setToas ( List<ToADTO> toas ) {
		this.toas = toas;
	}

	public List<MeleeDTO> getMelees () {
		return melees;
	}

	public void setMelees ( List<MeleeDTO> melees ) {
		this.melees = melees;
	}

	public List<MagicDTO> getMagics () {
		return magics;
	}

	public void setMagics ( List<MagicDTO> magics ) {
		this.magics = magics;
	}

	public List<ResistDTO> getResists () {
		return resists;
	}

	public void setResists ( List<ResistDTO> resists ) {
		this.resists = resists;
	}

	public List<OtherDTO> getOthers () {
		return others;
	}

	public void setOthers ( List<OtherDTO> others ) {
		this.others = others;
	}

	public short getModel () {
		return model;
	}

	public void setModel ( short model ) {
		this.model = model;
	}

	public boolean isTradeable () {
		return tradeable;
	}

	public void setTradeable ( boolean tradeable ) {
		this.tradeable = tradeable;
	}

	public float getUtility () {
		return utility;
	}

	public void setUtility ( float utility ) {
		this.utility = utility;
	}
}
