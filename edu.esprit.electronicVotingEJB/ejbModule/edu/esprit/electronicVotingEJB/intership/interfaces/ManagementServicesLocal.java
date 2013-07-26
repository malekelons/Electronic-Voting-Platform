package edu.esprit.electronicVotingEJB.intership.interfaces;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.electronicVotingEJB.intership.domain.User;

@Local
public interface ManagementServicesLocal {
	
	public User login(String login , String pwd);
	public List<User> findAllUsers();
	void deleteUser(int id);

}
