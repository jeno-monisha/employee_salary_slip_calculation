package com.salary.employee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salary.employee.model.Employee;
import com.salary.employee.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
@Transactional
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

	@GetMapping(value = "/employees")
	public List<Employee> getAllEmployees() {		
		return employeeRepository.findAll();
	}
	
	@GetMapping(value = "/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return employeeRepository.findById(id);
	}
	
	@GetMapping(value = "/employee/byEmpId/{empId}")
	public Employee getEmployeeByEmpId(@PathVariable("empId") String empId) {
		return employeeRepository.findByEmpId(empId);
	}
	
	@GetMapping(value = "/employee/byDesignation/{designation}")
	public List<Employee> getEmployeeByDesignation(@PathVariable("designation") String designation) {
		return employeeRepository.findByDesignation(designation);
	}
	
	@GetMapping(value = "/employees/orderByDa")
	public List<Employee> findAllByOrderByDaDesc() {
		return employeeRepository.findAllByOrderByDa();
	}
	
	@PostMapping(value = "/employee/save")
	public Employee saveEmployee(@RequestBody Employee employee) {	 
    	employeeRepository.save(employee);
    	return employee;
	}
	
	@PostMapping(value = "/employee/update")
	public Employee updateEmployee(@RequestBody Employee oldEmployee) {
		oldEmployee.setId(oldEmployee.getId()) ;
    	employeeRepository.save(oldEmployee);
    	return oldEmployee;
	}
	
	@DeleteMapping(value = "/employee/delete/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeRepository.deleteById(id);
	}
	
	@DeleteMapping(value = "/employees/deleteAll")
	public void deleteAllEmployees() {
		employeeRepository.deleteAll();
	}
}
