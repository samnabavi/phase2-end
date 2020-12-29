package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.utility.HibernateUtility;

public class EmployeeDao {
	public void addEmployee(int id, String name, String username, String password) {
		Session session = HibernateUtility.getSession();

		Transaction tx = session.beginTransaction();

		Employee emp = new Employee(id, name, username, password);
	

		session.save(emp);
		tx.commit();
		session.close();

	}

	public List<Employee> getAllEmployees() {
		Session session = HibernateUtility.getSession();
	 
		Transaction tx = session.beginTransaction();
		List<Employee> data = session.createQuery("FROM com.model.Employee").list();
		
		return data;

	}
}
