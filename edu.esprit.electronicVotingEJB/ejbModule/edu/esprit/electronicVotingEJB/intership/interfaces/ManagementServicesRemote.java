package edu.esprit.electronicVotingEJB.intership.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.electronicVotingEJB.intership.domain.ElectorBis;
import edu.esprit.electronicVotingEJB.intership.domain.User;

@Remote
public interface ManagementServicesRemote {
	public void initDB();

	public ElectorBis findElectorById(int idElector);

	public void assignElectorsToVoteOffice(List<ElectorBis> electorBis,
			int idVoteOffice);
	
	public void addUser(User user);
	
	public List<User> findAllUsers();
    
	public User login(String login , String pwd);
}
