package edu.esprit.electronicVotingEJB.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Party
 *
 */
@Entity

public class Party implements Serializable {

	
	private int idParty;
	private static final long serialVersionUID = 1L;

	public Party() {
		super();
	}   
	@Id    
	public int getIdParty() {
		return this.idParty;
	}

	public void setIdParty(int idParty) {
		this.idParty = idParty;
	}
   
}
