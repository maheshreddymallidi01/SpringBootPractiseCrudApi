package com.springbootpractise.crudapi.service;

import java.util.List;

import com.springbootpractise.crudapi.model.Employee;

public interface EmployeeService {
	public List<Employee> get();
	public Employee get(int id);
	public void saveEmployee(Employee employee);
	public void deleteEmployee(int id);
}
