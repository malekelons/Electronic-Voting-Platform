package edu.esprit.electronicVotingEJB.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.electronicVotingEJB.domain.Elector;
import edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesLocal;
import edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesRemote;

/**
 * Session Bean implementation class ElectorServices
 */
@Stateless
public class ElectorServices implements ElectorServicesRemote,
		ElectorServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ElectorServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addElector(Elector elector) {
		entityManager.persist(elector);

	}

	@Override
	public void deleteElector(int idElector) {

		entityManager.remove(entityManager.find(Elector.class, idElector));
	}

	@Override
	public void updateElector(Elector elector) {
		entityManager.merge(elector);

	}

	@Override
	public Elector findElectorById(int idElector) {

		return entityManager.find(Elector.class, idElector);

	}

}
