package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoC.ErpDao;

import com.model.Staff;

/**
 * Servlet implementation class ManagerSaveStaffServlet
 */
@WebServlet("/ManagerSaveStaffServlet")
public class ManagerSaveStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Staff sf = new Staff();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerSaveStaffServlet() {
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
		
		String name = request.getParameter("name");
		String position = request.getParameter("position");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String joindate = request.getParameter("joindate");
		String logname = request.getParameter("logname");
		String logpass = request.getParameter("logpass");
		String dob = request.getParameter("dob");
		
		sf.setName(name);
		sf.setPosition(position);
		sf.setPhone(phone);
		sf.setAddress(address);
		sf.setGender(gender);
		sf.setAge(age);
		sf.setJoindate(joindate);
		sf.setLogname(logname);
		sf.setLogpass(logpass);
		sf.setDob(dob);
		
		int status = ErpDao.insertStaff(sf);
		
		if (status > 0)
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Staff Added');");
			pw.println("location = 'ManagerSaveStaff.jsp';");
			pw.println("</script>");
		}
		else
		{
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Staff  NOT Added');");
			pw.println("location = 'ManagerSaveStaff.jsp';");
			pw.println("</script>");
		}
		
	}

}
