package esprit.entrainement.domain;

import esprit.entrainement.domain.KK;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: K
 *
 */
@Entity

public class K extends KK implements Serializable {

	
	private String name;
	private static final long serialVersionUID = 1L;

	public K() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
