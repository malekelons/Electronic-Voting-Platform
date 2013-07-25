package esprit.entrainement.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: KK
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class KK implements Serializable {

	
	private int idKK;
	private static final long serialVersionUID = 1L;

	public KK() {
		super();
	}   
	@Id    
	public int getIdKK() {
		return this.idKK;
	}

	public void setIdKK(int idKK) {
		this.idKK = idKK;
	}
   
}
