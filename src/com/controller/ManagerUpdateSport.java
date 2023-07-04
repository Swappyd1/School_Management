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

import com.model.Sport;

/**
 * Servlet implementation class ManagerUpdateSport
 */
@WebServlet("/ManagerUpdateSport")
public class ManagerUpdateSport extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Sport sp = new Sport();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerUpdateSport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = request.getParameter("sportid");
		int id1 = Integer.parseInt(id);
		
		sp = ErpDao.getSportId(id1);
		
		HttpSession session = request.getSession();
		session.setAttribute("list", sp);
		
		response.sendRedirect("updateSport.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String sportname = request.getParameter("sportname");
		
		sp.setSportname(sportname);
		
		int status = ErpDao.updateSport(sp);
		
		if (status > 0)
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Sport Updated');");
			pw.println("location = 'ManagerViewSport.jsp';");
			pw.println("</script>");
		}
		else
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Sport NOT Updated');");
			pw.println("location = 'ManagerViewSport.jsp';");
			pw.println("</script>");
		}
	}

}
