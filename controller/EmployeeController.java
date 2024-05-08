package com.project.Employee.time.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Employee.time.tracker.entity.Employee;
import com.project.Employee.time.tracker.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
    @GetMapping
    public List<Employee>getAllEmployees(){
    	return employeeService.getAllEmployees();
    }
    
    @GetMapping("/{id}")
   Employee getEmployeebyId(@PathVariable Long id) {
    	return employeeService.getEmployeebyId(id);
    }
    
    @PutMapping("/{id}")
    Employee updateEmp(@PathVariable Long id, @RequestBody Employee employee) {
    	employee.setId(id);
    	return employeeService.updateEmp(employee);
    }
    
    @DeleteMapping("/{id}")
    String deleteEmp(@PathVariable Long id) {
    	employeeService.deleteEmp(id);
    	return "Records Deleted Succesfully";
    }
}
