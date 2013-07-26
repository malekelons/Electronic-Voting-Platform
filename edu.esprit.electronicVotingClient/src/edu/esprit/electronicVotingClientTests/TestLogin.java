package edu.esprit.electronicVotingClientTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.electronicVotingEJB.intership.domain.User;
import edu.esprit.electronicVotingEJB.intership.interfaces.ManagementServicesRemote;

public class TestLogin {

	/**
	 * @param args
	 * @throws NamingException 
	 */
	public static void main(String[] args) throws NamingException {
		
		
		Context context = new InitialContext();
		ManagementServicesRemote proxy = (ManagementServicesRemote) context
				.lookup("ejb:edu.esprit.electronicVotingEAR/edu.esprit.electronicVotingEJB/ManagementServices!edu.esprit.electronicVotingEJB.intership.interfaces.ManagementServicesRemote");

		
		User user = proxy.login("a", "a");
		System.out.println(user.getLogin() );

	}

}
