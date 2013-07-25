package esprit.entrainement.domain;

import esprit.entrainement.domain.KK;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PPPP
 *
 */
@Entity

public class PPPP extends KK implements Serializable {

	
	private String lllll;
	private static final long serialVersionUID = 1L;

	public PPPP() {
		super();
	}   
	public String getLllll() {
		return this.lllll;
	}

	public void setLllll(String lllll) {
		this.lllll = lllll;
	}
   
}
