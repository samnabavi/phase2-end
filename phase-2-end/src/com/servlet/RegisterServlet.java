package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("eId"));
		String sId = request.getParameter("eId");
		String name = (String) request.getParameter("eName");
		String username = (String) request.getParameter("eUsername");
		String password = (String) request.getParameter("ePassword");
		Employee emp = new Employee(id, name, username, password);
		if (sId.equals("") || name.equals("") || username.equals("") || password.equals("")) {
			response.sendRedirect("wrong-register.jsp");
		} else {
			
			EmployeeDao ed = new EmployeeDao();
			List<Employee> emps = ed.getAllEmployees();
			for( Employee e:emps ) {
				if(e.getId() == id) {
					response.sendRedirect("wrong-register.jsp");
					return; 
				}
			}
			
			// response.getWriter().println(product);
			HttpSession session = request.getSession();
			session.setAttribute("employeese", emp);

			//EmployeeDao ed = new EmployeeDao();
			ed.addEmployee(id, name, username, password);
			// request.getRequestDispatcher("add-to-db.jsp").forward(request, response);
			response.sendRedirect("registerd.jsp");
		}
	}

}
