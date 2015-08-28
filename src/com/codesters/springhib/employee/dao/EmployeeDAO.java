package com.codesters.springhib.employee.dao;

import java.util.List;

import com.codesters.springhib.employee.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getAllEmployees();

	public void addEmployee(Employee employee);
}