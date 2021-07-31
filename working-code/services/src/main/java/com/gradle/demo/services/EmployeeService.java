package com.gradle.demo.services;

import java.util.List;

import com.gradle.demo.models.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public List<Employee> listEmployees();
}
