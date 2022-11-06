package com.springbootpractise.crudapi.repository;

import java.util.List;

import com.springbootpractise.crudapi.model.Employee;

public interface EmployeeDAO {
	public List<Employee> get();
}
