package edu.esprit.electronicVotingWeb.ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import edu.esprit.electronicVotingEJB.domain.Elector;
import edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesLocal;

@ManagedBean
public class ElectorCtr {
	// the model
	private Elector elector = new Elector();

	// the injection of the proxy
	@EJB
	private ElectorServicesLocal proxy;

	// creation of the presentation method

	public String doAddElector() {
		proxy.addElector(elector);
		return "";
	}

	public Elector getElector() {
		return elector;
	}

	public void setElector(Elector elector) {
		this.elector = elector;
	}

}
