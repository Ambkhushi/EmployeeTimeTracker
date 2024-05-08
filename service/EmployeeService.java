package com.project.Employee.time.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Employee.time.tracker.Repositiory.EmployeeRepo;
import com.project.Employee.time.tracker.entity.Employee;
import com.project.Employee.time.tracker.exception.ResourceNotFoundException;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee save(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
	public Employee getEmployeebyId(Long id) {
		return employeeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Error occurred while fetching employee with id:"+id));
	}
	
	public Employee updateEmp(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public void deleteEmp(long id) {
		employeeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Error occurred while deleting employee with id:"+id));
	}
	
}
