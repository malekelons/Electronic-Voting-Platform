package edu.esprit.electronicVotingClientTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesRemote;

public class TestDeleteElector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Context context = new InitialContext();

			ElectorServicesRemote proxy = (ElectorServicesRemote) context
					.lookup("ejb:edu.esprit.electronicVotingEAR/edu.esprit.electronicVotingEJB/ElectorServices!edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesRemote");
			proxy.deleteElector(1);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
