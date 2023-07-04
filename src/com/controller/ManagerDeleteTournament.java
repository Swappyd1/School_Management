package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoC.ErpDao;

import com.model.Tournament;

/**
 * Servlet implementation class ManagerDeleteTournament
 */
@WebServlet("/ManagerDeleteTournament")
public class ManagerDeleteTournament extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Tournament t = new Tournament();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerDeleteTournament() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = request.getParameter("tournamentid");
		int id1 = Integer.parseInt(id);
		
		ErpDao.deleteTournament(id1);
		
		response.sendRedirect("ManagerViewTournament.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
