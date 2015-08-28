package com.codesters.springhib.employee.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.codesters.springhib.employee.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	@Qualifier("readSessionFactory")
	private SessionFactory readSessionFactory;
	
	@Autowired
	@Qualifier("writeSessionFactory")
	private SessionFactory writeSessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {		
		return readSessionFactory.getCurrentSession().createQuery("from Employee").list();
	}
	
	@Override
	public void addEmployee(Employee employee) {
		writeSessionFactory.getCurrentSession().save(employee);
	}
}
