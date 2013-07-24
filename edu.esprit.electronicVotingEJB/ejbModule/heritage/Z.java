package heritage;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Z
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Z implements Serializable {

	   
	@Id
	private int idK;
	private static final long serialVersionUID = 1L;

	public Z() {
		super();
	}   
	public int getIdK() {
		return this.idK;
	}

	public void setIdK(int idK) {
		this.idK = idK;
	}
   
}
