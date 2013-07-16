package edu.esprit.electronicVotingClientTests;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.esprit.electronicVotingEJB.domain.Elector;
import edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesRemote;

public class TestAddElector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ElectorServicesRemote proxy = (ElectorServicesRemote) context
					.lookup("ejb:edu.esprit.electronicVotingEAR/edu.esprit.electronicVotingEJB/ElectorServices!edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesRemote");

			// creation de notre premiere entité
			Elector elector = new Elector();
			elector.setIdElector(1);
			elector.setFirstNameElector("foulen");
			elector.setLastNameElector("ben foulen");

			proxy.addElector(elector);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
