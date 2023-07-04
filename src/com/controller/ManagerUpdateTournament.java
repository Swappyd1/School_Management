package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DaoC.ErpDao;

import com.model.Tournament;

/**
 * Servlet implementation class ManagerUpdateTournament
 */
@WebServlet("/ManagerUpdateTournament")
public class ManagerUpdateTournament extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Tournament t = new Tournament();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerUpdateTournament() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
String id1 = request.getParameter("tournamentid");
		
		int id = Integer.parseInt(id1);
		
		t = ErpDao.getTournamentId(id);
		
		HttpSession session = request.getSession();
		session.setAttribute("list", t);
		
		response.sendRedirect("updateTournament.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
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
		
		int status = ErpDao.updateTournament(t);
		
		if (status > 0)
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Tournament Updated');");
			pw.println("location = 'ManagerViewTournament.jsp';");
			pw.println("</script>");
		}
		else
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Tournament NOT Updated');");
			pw.println("location = 'ManagerViewTournament.jsp';");
			pw.println("</script>");
		}
	}

	}


