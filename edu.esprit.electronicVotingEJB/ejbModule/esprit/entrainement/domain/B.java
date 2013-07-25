package esprit.entrainement.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class B implements Serializable {

	private int idB;
	private String nameB;
	private A a;

	@Id
	public int getIdB() {
		return idB;
	}

	public void setIdB(int idB) {
		this.idB = idB;
	}

	public String getNameB() {
		return nameB;
	}

	public void setNameB(String nameB) {
		this.nameB = nameB;
	}

	@OneToOne
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

}
