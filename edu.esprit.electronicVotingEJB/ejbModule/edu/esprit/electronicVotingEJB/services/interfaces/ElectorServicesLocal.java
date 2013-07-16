package edu.esprit.electronicVotingEJB.services.interfaces;

import javax.ejb.Local;

import edu.esprit.electronicVotingEJB.domain.Elector;

@Local
public interface ElectorServicesLocal {
	public void addElector(Elector elector);

	public void deleteElector(int idElector);
	
	public void updateElector(Elector elector);
	public Elector findElectorById(int idElector);


}
