package edu.esprit.electronicVotingEJB.intership.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: LeaderOfParty
 *
 */
@Entity

public class LeaderOfParty extends User implements Serializable {

	
	private String position;
	private static final long serialVersionUID = 1L;

	public LeaderOfParty() {
		super();
	}   
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
   
}
