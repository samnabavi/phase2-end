package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EmployeeDao;
import com.model.Employee;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("eUsername");
		String password = request.getParameter("ePassword");

		EmployeeDao ed = new EmployeeDao();
		List<Employee> lst = ed.getAllEmployees();
		
		for (Employee e : lst) {
			if (e.getUsername().equals(username) && e.getPassword().equals(password)) {
				HttpSession session = request.getSession();
				session.setAttribute("employeese", e);
				request.getRequestDispatcher("loggedin.jsp").forward(request, response);
				//response.sendRedirect("loggedin.jsp");
				return;
				
			}
		}
		
		response.sendRedirect("wrong-login.jsp");
		
		

	}

}
