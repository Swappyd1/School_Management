package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoC.ErpDao;

import com.model.Student;

/**
 * Servlet implementation class ManagerDeleteStudent
 */
@WebServlet("/ManagerDeleteStudent")
public class ManagerDeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Student s = new Student();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerDeleteStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = request.getParameter("sid");
		int id1 = Integer.parseInt(id);
		
		ErpDao.deleteStudent(id1);
		
		response.sendRedirect("ManagerViewStudent.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
