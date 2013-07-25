package heritage;

import heritage.H;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: W
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class W extends H implements Serializable {

	
	private String lieu;
	private static final long serialVersionUID = 1L;

	public W() {
		super();
	}   
	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
   
}
