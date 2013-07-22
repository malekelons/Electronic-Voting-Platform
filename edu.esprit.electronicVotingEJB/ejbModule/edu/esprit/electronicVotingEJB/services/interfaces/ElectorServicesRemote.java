package edu.esprit.electronicVotingEJB.services.interfaces;

import javax.ejb.Remote;

import edu.esprit.electronicVotingEJB.domain.Elector;

@Remote
public interface ElectorServicesRemote {
	public void addElector(Elector elector);
	public void deleteElector(int idElector);
	public void updateElector(Elector elector);
	public Elector findElectorById(int idElector);

}
