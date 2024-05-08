package com.project.Employee.time.tracker.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Employee {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String role;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Task> tasks = new ArrayList<>();
//	
//	public void sTasks(List<Task> tasks) {
//        this.tasks = tasks;
//        if (tasks != null) {
//            for (Task task : tasks) {
//                task.setEmployee(this);
//            }
//        }
//    }
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String name, String role, List<Task> tasks) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.tasks = tasks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", tasks=" + tasks + "]";
	}

	}
