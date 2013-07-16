package edu.esprit.electronicVotingEJB.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Elector
 *
 */
@Entity

public class Elector implements Serializable {

	
	private int idElector;
	private String firstNameElector;
	private String lastNameElector;
	private static final long serialVersionUID = 1L;

	public Elector() {
		super();
	}   
	@Id    
	public int getIdElector() {
		return this.idElector;
	}

	public void setIdElector(int idElector) {
		this.idElector = idElector;
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
   
}
