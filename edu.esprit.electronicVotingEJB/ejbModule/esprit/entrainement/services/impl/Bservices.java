package esprit.entrainement.services.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import esprit.entrainement.domain.B;
import esprit.entrainement.services.interfaces.BservicesLocal;
import esprit.entrainement.services.interfaces.BservicesRemote;

/**
 * Session Bean implementation class 
 */
@Stateless
@LocalBean
public class Bservices implements BservicesRemote, BservicesLocal {

	@PersistenceContext
	private EntityManager entityManager;
	
	

}
