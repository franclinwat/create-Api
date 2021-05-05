package com.openclassroom.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassroom.api.model.Employees;
import com.openclassroom.api.repository.EmployeeRepository;

import lombok.Data;

@Data
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	 public Optional<Employees> getEmployee(final Long id) {
	        return employeeRepository.findById(id);
	    }

	    public Iterable<Employees> getEmployees() {
	        return employeeRepository.findAll();
	    }

	    public void deleteEmployee(final Long id) {
	        employeeRepository.deleteById(id);
	    }

	    public Employees saveEmployee(Employees employee) {
	        Employees savedEmployee = employeeRepository.save(employee);
	        return savedEmployee;
	    }

}
