package edu.esprit.electronicVotingEJB.services.interfaces;

import javax.ejb.Local;

import edu.esprit.electronicVotingEJB.domain.Party;

@Local
public interface PartyServicesLocal {
public void addParty(Party party);
public void deleteParty(int idParty);
public Party  findPartyById(int idParty);
public void updateParty(Party party);
}
