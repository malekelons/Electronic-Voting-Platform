package edu.esprit.electronicVotingClientTests;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.esprit.electronicVotingEJB.intership.domain.ElectorBis;
import edu.esprit.electronicVotingEJB.intership.domain.LeaderOfParty;
import edu.esprit.electronicVotingEJB.intership.domain.User;
import edu.esprit.electronicVotingEJB.intership.interfaces.ManagementServicesRemote;

public class TestRealPlatform {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ManagementServicesRemote proxy = (ManagementServicesRemote) context
					.lookup("ejb:edu.esprit.electronicVotingEAR/edu.esprit.electronicVotingEJB/ManagementServices!edu.esprit.electronicVotingEJB.intership.interfaces.ManagementServicesRemote");

			ElectorBis electorBis = proxy.findElectorById(3);
			ElectorBis electorBis2 = proxy.findElectorById(4);

			List<ElectorBis> list = new ArrayList<ElectorBis>();
			list.add(electorBis);
			list.add(electorBis2);

			// proxy.initDB();
			// proxy.assignElectorsToVoteOffice(list, 2);

			LeaderOfParty leaderOfParty = new LeaderOfParty();
			leaderOfParty.setId(12);
			leaderOfParty.setPosition("secretriy");

			ElectorBis electorBis3 = new ElectorBis();
			electorBis3.setId(11);
			electorBis3.setFirstNameElector("elector");

			 proxy.addUser(electorBis3);
			 proxy.addUser(leaderOfParty);

			List<User> users = proxy.findAllUsers();
			for (User u : users) {
				if (u instanceof LeaderOfParty) {
					System.out.println("rahou raies 7ezb fok 3lina mennou ...");
				}
				if (u instanceof ElectorBis) {
					System.out
							.println("mat5afech rahou jard mouwaten enzel 3lih ...");
				}
				else{
					System.out.println("ma chaddina 7add");
				}
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
