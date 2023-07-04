package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoC.ErpDao;

import com.model.Announcement;

/**
 * Servlet implementation class AdminDeleteAnnouncement
 */
@WebServlet("/AdminDeleteAnnouncement")
public class AdminDeleteAnnouncement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Announcement an = new Announcement();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDeleteAnnouncement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
        String id = request.getParameter("anid");
		
		int id1 = Integer.parseInt(id);
		
		ErpDao.deleteAnouncement(id1);
		
		response.sendRedirect("AdminViewAnnoucement.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
