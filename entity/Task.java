package com.project.Employee.time.tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private LocalDate date;
	private LocalTime startTime;
	private LocalTime endTime;
	private String project;
    private String taskCategory;
    private String description;
	
    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(Long id, LocalDate date, LocalTime startTime, LocalTime endTime, String project, String taskCategory,
			String description) {
		super();
		this.id = id;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.project = project;
		this.taskCategory = taskCategory;
		this.description = description;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getTaskCategory() {
		return taskCategory;
	}

	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * public Employee getEmployee() { return employee; }
	 * 
	 * public void setEmployee(Employee employee) { this.employee = employee; }
	 */

	@Override
	public String toString() {
		return "Task [id=" + id + ", date=" + date + ", startTime=" + startTime + ", endTime=" + endTime + ", project="
				+ project + ", taskCategory=" + taskCategory + ", description=" + description + "]";
	}
    
    }
