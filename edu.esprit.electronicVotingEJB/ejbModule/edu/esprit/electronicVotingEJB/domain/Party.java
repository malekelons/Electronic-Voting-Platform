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
	private String name ;
	private String presidentParty ;
	private String secretaryGeneral ;
	private int    adherentNumber ;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPresidentParty() {
		return presidentParty;
	}
	public void setPresidentParty(String presidentParty) {
		this.presidentParty = presidentParty;
	}
	public String getSecretaryGeneral() {
		return secretaryGeneral;
	}
	public void setSecretaryGeneral(String secretaryGeneral) {
		this.secretaryGeneral = secretaryGeneral;
	}
	public int getAdherentNumber() {
		return adherentNumber;
	}
	public void setAdherentNumber(int adherentNumber) {
		this.adherentNumber = adherentNumber;
	}

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
