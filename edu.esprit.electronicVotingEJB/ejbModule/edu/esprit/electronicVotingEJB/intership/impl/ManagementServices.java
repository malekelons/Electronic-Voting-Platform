package edu.esprit.electronicVotingEJB.intership.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.electronicVotingEJB.intership.domain.ElectorBis;
import edu.esprit.electronicVotingEJB.intership.domain.User;
import edu.esprit.electronicVotingEJB.intership.domain.VoteOffice;
import edu.esprit.electronicVotingEJB.intership.interfaces.ManagementServicesLocal;
import edu.esprit.electronicVotingEJB.intership.interfaces.ManagementServicesRemote;

/**
 * Session Bean implementation class ManagementServices
 */
@Stateless
public class ManagementServices implements ManagementServicesRemote,
		ManagementServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ManagementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initDB() {
		VoteOffice voteOffice = new VoteOffice("tunis", "madrasah");
		VoteOffice voteOffice2 = new VoteOffice("sfax", "jeme3");

		ElectorBis electorBis = new ElectorBis("melek", "ons");
		ElectorBis electorBis2 = new ElectorBis("marwen", "mira");
		ElectorBis electorBis3 = new ElectorBis("walid", "racheg");
		ElectorBis electorBis4 = new ElectorBis("foulen", "ben foulen");

		entityManager.persist(voteOffice);
		entityManager.persist(voteOffice2);

		entityManager.persist(electorBis);
		entityManager.persist(electorBis2);
		entityManager.persist(electorBis3);
		entityManager.persist(electorBis4);

	}

	@Override
	public void assignElectorsToVoteOffice(List<ElectorBis> electorBis,
			int idVoteOffice) {
		VoteOffice voteOfficeFound = entityManager.find(VoteOffice.class,
				idVoteOffice);

		System.out.println(voteOfficeFound.getLocationVoteOffice());

		voteOfficeFound.addElectorBisToOffice(electorBis);

		entityManager.merge(voteOfficeFound);

	}

	@Override
	public ElectorBis findElectorById(int idElector) {

		return entityManager.find(ElectorBis.class, idElector);
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public List<User> findAllUsers() {

		return entityManager.createQuery("select u from User u")
				.getResultList();
	}

	@Override
	public User login(String login, String pwd) {
		User user;
		String jpql = "select u from User u where  u.login='" + login
				+ "'and u.password='" + pwd + "'";
		Query query = entityManager.createQuery(jpql);
		try {
			user = (User) query.getSingleResult();

		} catch (Exception e) {
			return null;
		}
		return user;
	}

	@Override
	public void deleteUser(int id) {
		entityManager.remove(entityManager.find(User.class, id));

	}

}
