package com.project.Employee.time.tracker.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Employee.time.tracker.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
