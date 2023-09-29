package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Integer> {
    
}
