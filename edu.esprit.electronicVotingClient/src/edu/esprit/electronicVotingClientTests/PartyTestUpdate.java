package edu.esprit.electronicVotingClientTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import edu.esprit.electronicVotingEJB.domain.Party;
import edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesRemote;
import edu.esprit.electronicVotingEJB.services.interfaces.PartyServicesRemote;

public class PartyTestUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Context context = new InitialContext();
			PartyServicesRemote proxy = (PartyServicesRemote) context
					.lookup("ejb:edu.esprit.electronicVotingEAR/edu.esprit.electronicVotingEJB/PartyServices!edu.esprit.electronicVotingEJB.services.interfaces.PartyServicesRemote");
			
			Party party = proxy.findPartyById(6);
			party.setName("Joumhouri");
			
			proxy.updateParty(party);
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
