package com.openclassroom.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openclassroom.api.model.Employees;
import com.openclassroom.api.service.EmployeeService;

@RestController
public class EmployeeController {
	
	 @Autowired
	    private EmployeeService employeeService;

	    /**
	    * Read - Get all employees
	    * @return - An Iterable object of Employee full filled
	    */
	    @GetMapping("/employees")
	    public Iterable<Employees> getEmployees() {
	        return employeeService.getEmployees();
	    }

}
