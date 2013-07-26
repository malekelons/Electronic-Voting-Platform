package edu.esprit.electronicVotingWeb.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import edu.esprit.electronicVotingEJB.domain.Elector;
import edu.esprit.electronicVotingEJB.intership.domain.ElectorBis;
import edu.esprit.electronicVotingEJB.intership.domain.User;
import edu.esprit.electronicVotingEJB.intership.interfaces.ManagementServicesLocal;
import edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesLocal;

@ManagedBean
public class ElectorCtr {
	// the model
	private Elector elector = new Elector();
	private User user = new User();
	private List<User> users = new ArrayList<User>();
	private DataModel<User> dataModel = new ListDataModel<User>();

	// the injection of the proxy
	@EJB
	private ElectorServicesLocal proxy;
	@EJB
	private ManagementServicesLocal managementServicesLocal;

	// creation of the presentation method

	public String doAddElector() {
		proxy.addElector(elector);
		return "";
	}

	public String doDeleteUser() {
		User userSelected = dataModel.getRowData();
		managementServicesLocal.deleteUser(userSelected.getId());
		return "";
	}

	public String doLogin() {
		String navigateTo = "";
		try {
			User userFound = managementServicesLocal.login(user.getLogin(),
					user.getPassword());

			if (userFound != null) {
				if (userFound instanceof ElectorBis) {
					navigateTo = "/view/menu.xhtml";
				} else {
					navigateTo = "/view/details.xhtml";

				}
			} else {
				navigateTo = "/view/error.xhtml";
			}

		} catch (Exception e) {

		}
		return navigateTo;
	}

	public String navigateTo() {
		System.out.println("ok");
		return "/view/otherPage.xhtml";
	}

	public Elector getElector() {
		return elector;
	}

	public void setElector(Elector elector) {
		this.elector = elector;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		users = managementServicesLocal.findAllUsers();
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public DataModel<User> getDataModel() {
		dataModel.setWrappedData(managementServicesLocal.findAllUsers());
		return dataModel;
	}

	public void setDataModel(DataModel<User> dataModel) {
		this.dataModel = dataModel;
	}

}
