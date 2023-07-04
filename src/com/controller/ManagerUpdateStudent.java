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

import com.model.Student;

/**
 * Servlet implementation class ManagerUpdateStudent
 */
@WebServlet("/ManagerUpdateStudent")
public class ManagerUpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 Student s = new Student();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerUpdateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String id1 = request.getParameter("sid");
		int id = Integer.parseInt(id1);
		
		s = ErpDao.getStudentId(id);
		
		HttpSession session = request.getSession();
		session.setAttribute("list", s);
		
		response.sendRedirect("updateStudent.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("name");
		String logname = request.getParameter("logname");
		String logpass = request.getParameter("logpass");
		String standard = request.getParameter("standard");
		String division = request.getParameter("division");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		s.setName(name);
		s.setLogname(logname);
		s.setLogpass(logpass);
		s.setStandard(standard);
		s.setDivision(division);
		s.setAddress(address);
		s.setAge(age);
		s.setDob(dob);
		s.setGender(gender);
		s.setEmail(email);
		
		int status = ErpDao.updateStudent(s);
		
		if (status > 0)
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Data Updated');");
			pw.println("location = 'ManagerViewStudent.jsp';");
			pw.println("</script>");
		}
		else
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Data NOT Updated');");
			pw.println("location = 'updateStudent'.jsp';");
			pw.println("</script>");
		}
	
	
	
}
	}


