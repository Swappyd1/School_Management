package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Announcement;

import DaoC.ErpDao;

/**
 * Servlet implementation class AdminSaveAnnouncementServlet
 */
@WebServlet("/AdminSaveAnnouncementServlet")
public class AdminSaveAnnouncementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Announcement an = new Announcement();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminSaveAnnouncementServlet() {
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
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String annname = request.getParameter("annname");
		String dateofan = request.getParameter("dateofan");
		
		an.setAnnname(annname);
		an.setDateofan(dateofan);
		
		int status = ErpDao.insertAnnouncement(an);
		
		if(status > 0)
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Announcement Added');");
			pw.println("location='AdminSaveAnnouncement.jsp';");
			pw.println("</script>");
		}
		else
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Announcement NOT Added');");
			pw.println("location='AdminSaveAnnouncement.jsp';");
			pw.println("</script>");
		}
	}

}
