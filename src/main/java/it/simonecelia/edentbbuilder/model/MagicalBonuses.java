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

	private List<CapBonus> capBonuses;

	private List<Resist> resists;

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
}
