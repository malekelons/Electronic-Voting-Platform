package edu.esprit.electronicVotingEJB.services.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.electronicVotingEJB.domain.Party;
import edu.esprit.electronicVotingEJB.services.interfaces.PartyServicesLocal;
import edu.esprit.electronicVotingEJB.services.interfaces.PartyServicesRemote;

/**
 * Session Bean implementation class PartyServices
 */
@Stateless
@LocalBean
public class PartyServices implements PartyServicesRemote, PartyServicesLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext
	private EntityManager entityManager ;
	public PartyServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addParty(Party party) {
		entityManager.persist(party);
	}

	@Override
	public void deleteParty(int idParty) {
	entityManager.remove(entityManager.find(Party.class, idParty));
	}

	@Override
	public Party findPartyById(int idParty) {
		// TODO Auto-generated method stub
		return entityManager.find(Party.class, idParty);
	}

	@Override
	public void updateParty(Party party) {
	entityManager.merge(party);
		
	}

}
