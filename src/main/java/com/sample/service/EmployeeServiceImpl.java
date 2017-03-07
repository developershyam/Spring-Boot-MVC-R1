package com.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.data.model.Employee;
import com.sample.data.repository.EmployeeRepository;

/**
 * This class is used to implement business logic for application related
 * employee.
 * 
 * @author shyam.pareek
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {

		List<Employee> employees = new ArrayList<>();

		employeeRepository.findAll().forEach(employees::add);

		return employees;
	}

	public Employee getEmployee(Long id) {

		Employee employee = employeeRepository.findOne(id);

		return employee;
	}

	public Employee addEmployee(Employee employee) {

		employee = employeeRepository.save(employee);

		return employee;
	}

	public Employee updateEmployee(Employee employee) {

		employee = employeeRepository.save(employee);

		return employee;
	}

	public void deleteEmployee(Long id) {

		employeeRepository.delete(id);

	}

}
