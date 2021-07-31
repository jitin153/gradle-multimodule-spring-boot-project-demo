package com.gradle.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gradle.demo.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
