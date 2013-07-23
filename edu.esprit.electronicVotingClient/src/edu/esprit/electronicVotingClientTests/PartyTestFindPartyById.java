package edu.esprit.electronicVotingClientTests;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.esprit.electronicVotingEJB.domain.Party;
import edu.esprit.electronicVotingEJB.services.interfaces.PartyServicesRemote;

public class PartyTestFindPartyById {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Context context = new InitialContext();
			PartyServicesRemote proxy = (PartyServicesRemote) context
					.lookup("ejb:edu.esprit.electronicVotingEAR/edu.esprit.electronicVotingEJB/PartyServices!edu.esprit.electronicVotingEJB.services.interfaces.PartyServicesRemote");

		Party party =proxy.findPartyById(6);
		System.out.println(party.getName());
		

		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
