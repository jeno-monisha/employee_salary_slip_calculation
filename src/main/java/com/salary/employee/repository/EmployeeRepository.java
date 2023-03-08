package com.salary.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salary.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
	
	Employee findById(int id);
	
	Employee findByEmpId(String empId);

	List<Employee> findByDesignation(String designation);

	List<Employee> findAllByOrderByDa();
	
	void deleteById(int id);
	

}
