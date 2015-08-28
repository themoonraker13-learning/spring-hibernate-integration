package com.codesters.springhib.employee.service;

import java.util.List;

import com.codesters.springhib.employee.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public void addEmployee(Employee employee);
}
