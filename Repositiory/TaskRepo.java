package com.project.Employee.time.tracker.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Employee.time.tracker.entity.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {

}
