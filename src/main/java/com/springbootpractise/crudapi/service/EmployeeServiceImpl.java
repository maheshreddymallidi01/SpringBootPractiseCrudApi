package com.springbootpractise.crudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootpractise.crudapi.model.Employee;
import com.springbootpractise.crudapi.repository.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDAO.get();
	}

}
