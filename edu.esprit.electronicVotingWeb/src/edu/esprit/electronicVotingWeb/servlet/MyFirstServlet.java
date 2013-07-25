package edu.esprit.electronicVotingWeb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.esprit.electronicVotingEJB.domain.Elector;
import edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesLocal;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyFirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			Context context = new InitialContext();

			ElectorServicesLocal proxy = (ElectorServicesLocal) context
					.lookup("ejb:edu.esprit.electronicVotingEAR/edu.esprit.electronicVotingEJB/ElectorServices!edu.esprit.electronicVotingEJB.services.interfaces.ElectorServicesLocal");

			PrintWriter printWriter = response.getWriter();
			Date date = new Date();

			String yourName = request.getParameter("name");
			printWriter
					.write("<html> <body><h1>asslemaaaa ya hmama ... tawa rahou "
							+ date
							+ "   ysallem 3lik "
							+ yourName
							+ "</h1></body></html>");

			Elector elector = new Elector();
			elector.setIdElector(10);
			elector.setFirstNameElector(request.getParameter("name"));

			proxy.addElector(elector);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
