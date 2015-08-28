package com.codesters.springhib.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codesters.springhib.employee.entity.Employee;
import com.codesters.springhib.employee.service.EmployeeService;;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listEmployees(ModelMap map) 
	{
		map.addAttribute("employee", new Employee());
		map.addAttribute("employeeList", employeeService.getAllEmployees());
		
		return "home";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute(value="employee") Employee employee, BindingResult result) 
	{
		employeeService.addEmployee(employee);
		return "redirect:/";
	}
}
