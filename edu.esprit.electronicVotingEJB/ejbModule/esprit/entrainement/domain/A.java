package esprit.entrainement.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class A implements Serializable {

	private int idA;
	private String nameA;
	private B b;

	public A() {
		super();

	}

	@Id
	@GeneratedValue
	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	public String getNameA() {
		return nameA;
	}

	public void setNameA(String nameA) {
		this.nameA = nameA;
	}

	@OneToOne(mappedBy = "a")
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

}
