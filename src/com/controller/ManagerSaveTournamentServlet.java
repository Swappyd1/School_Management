package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoC.ErpDao;

import com.model.Tournament;

/**
 * Servlet implementation class ManagerSaveTournamentServlet
 */
@WebServlet("/ManagerSaveTournamentServlet")
public class ManagerSaveTournamentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Tournament t = new Tournament();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerSaveTournamentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String tournament = request.getParameter("tournamentname");
		String startdate = request.getParameter("startdate");
		String location = request.getParameter("location");
		String noofstudent = request.getParameter("noofstudent");
		
		t.setTournamentname(tournament);
		t.setStartdate(startdate);
		t.setLocation(location);
		t.setNoofstudent(noofstudent);
		
		int status = ErpDao.insertTournament(t);
		
		if (status > 0)
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Tournament Added ');");
			pw.println("location='ManagerSaveTournament.jsp';");
			pw.println("</script>");
		}
		else
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Not ADDED ');");
			pw.println("location='ManagerSaveTournament.jsp';");
			pw.println("</script>");
		}
	}
	}


