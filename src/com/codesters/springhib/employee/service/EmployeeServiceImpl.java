package com.codesters.springhib.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codesters.springhib.employee.dao.EmployeeDAO;
import com.codesters.springhib.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
    private EmployeeDAO employeeDAO;

	@Override
	@Transactional("readTransactionManager")
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}
	
	@Override
	@Transactional("writeTransactionManager")
	public void addEmployee(Employee employee) {
		employeeDAO.addEmployee(employee);
	}
}
