package edu.esprit.electronicVotingEJB.intership.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Elector
 * 
 */
@Entity
public class ElectorBis extends User implements Serializable {

	private String firstNameElector;
	private String lastNameElector;
	private static final long serialVersionUID = 1L;

	private VoteOffice voteOffice;

	public ElectorBis() {
		super();
	}

	public String getFirstNameElector() {
		return this.firstNameElector;
	}

	public void setFirstNameElector(String firstNameElector) {
		this.firstNameElector = firstNameElector;
	}

	public String getLastNameElector() {
		return this.lastNameElector;
	}

	public void setLastNameElector(String lastNameElector) {
		this.lastNameElector = lastNameElector;
	}

	@ManyToOne
	public VoteOffice getVoteOffice() {
		return voteOffice;
	}

	public void setVoteOffice(VoteOffice voteOffice) {
		this.voteOffice = voteOffice;
	}

	public ElectorBis(String firstNameElector, String lastNameElector) {
		super();
		this.firstNameElector = firstNameElector;
		this.lastNameElector = lastNameElector;
	}

}
