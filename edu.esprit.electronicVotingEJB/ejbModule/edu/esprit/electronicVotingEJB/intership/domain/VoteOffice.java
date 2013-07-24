package edu.esprit.electronicVotingEJB.intership.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: VoteOffice
 * 
 */
@Entity
public class VoteOffice implements Serializable {

	private int idVoteOffice;
	private String locationVoteOffice;
	private String nameVoteOffice;
	private static final long serialVersionUID = 1L;

	private List<ElectorBis> electorBis;

	public VoteOffice() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdVoteOffice() {
		return this.idVoteOffice;
	}

	public void setIdVoteOffice(int idVoteOffice) {
		this.idVoteOffice = idVoteOffice;
	}

	public String getLocationVoteOffice() {
		return this.locationVoteOffice;
	}

	public void setLocationVoteOffice(String locationVoteOffice) {
		this.locationVoteOffice = locationVoteOffice;
	}

	public String getNameVoteOffice() {
		return this.nameVoteOffice;
	}

	public void setNameVoteOffice(String nameVoteOffice) {
		this.nameVoteOffice = nameVoteOffice;
	}

	@OneToMany(mappedBy = "voteOffice",cascade=CascadeType.MERGE)
	public List<ElectorBis> getElectorBis() {
		return electorBis;
	}

	public void setElectorBis(List<ElectorBis> electorBis) {
		this.electorBis = electorBis;
	}

	public VoteOffice(String locationVoteOffice, String nameVoteOffice) {
		super();
		this.locationVoteOffice = locationVoteOffice;
		this.nameVoteOffice = nameVoteOffice;
	}

	public void addElectorBisToOffice(List<ElectorBis> electorBis) {
		this.electorBis = electorBis;
		for (ElectorBis e : electorBis) {
			e.setVoteOffice(this);
		}
	}

}
