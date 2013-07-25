package esprit.entrainement.services.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import esprit.entrainement.domain.A;
import esprit.entrainement.services.interfaces.AservicesLocal;
import esprit.entrainement.services.interfaces.AservicesRemote;


@Stateless
@LocalBean
public class Aservices implements AservicesRemote, AservicesLocal {

	
	@PersistenceContext
	private EntityManager entityManager;
	

}
