package edu.esprit.electronicVotingEJB.intership.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
