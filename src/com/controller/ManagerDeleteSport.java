package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoC.ErpDao;

import com.model.Sport;

/**
 * Servlet implementation class ManagerDeleteSport
 */
@WebServlet("/ManagerDeleteSport")
public class ManagerDeleteSport extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Sport sp = new Sport();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerDeleteSport() {
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
		
		ErpDao.deleteSport(id1);
		
		response.sendRedirect("ManagerViewSport.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
