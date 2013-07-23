package edu.esprit.electronicVotingEJB.services.interfaces;

import javax.ejb.Remote;

import edu.esprit.electronicVotingEJB.domain.Party;

@Remote
public interface PartyServicesRemote {
	public void addParty(Party party);
	public void deleteParty(int idParty);
	public Party  findPartyById(int idParty);
	public void updateParty(Party party);
}
