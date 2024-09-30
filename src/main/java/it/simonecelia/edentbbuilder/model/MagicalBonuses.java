package it.simonecelia.edentbbuilder.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@SuppressWarnings ( "unused" )
public class MagicalBonuses implements Serializable {

	@Serial
	private static final long serialVersionUID = -731634151274317556L;

	private List<Stat> stats;

	private List<ToA> toAs;

	private List<Melee> melees;

	private List<Magic> magics;

	private List<CapBonus> capBonuses;

	private List<Resist> resists;

	private List<Other> others;

	public List<Stat> getStats () {
		return stats;
	}

	public void setStats ( List<Stat> stats ) {
		this.stats = stats;
	}

	public List<ToA> getToAs () {
		return toAs;
	}

	public void setToAs ( List<ToA> toAs ) {
		this.toAs = toAs;
	}

	public List<Melee> getMelees () {
		return melees;
	}

	public void setMelees ( List<Melee> melees ) {
		this.melees = melees;
	}

	public List<Magic> getMagics () {
		return magics;
	}

	public void setMagics ( List<Magic> magics ) {
		this.magics = magics;
	}

	public List<CapBonus> getCapBonuses () {
		return capBonuses;
	}

	public void setCapBonuses ( List<CapBonus> capBonuses ) {
		this.capBonuses = capBonuses;
	}

	public List<Resist> getResists () {
		return resists;
	}

	public void setResists ( List<Resist> resists ) {
		this.resists = resists;
	}

	public List<Other> getOthers () {
		return others;
	}

	public void setOthers ( List<Other> others ) {
		this.others = others;
	}
}
