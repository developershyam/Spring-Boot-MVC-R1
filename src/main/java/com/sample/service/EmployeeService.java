package com.sample.service;

import java.util.List;

import com.sample.data.model.Employee;
/**
 * This interface is designed for employee business.
 * 
 * @author shyam.pareek
 *
 */
public interface EmployeeService {

	List<Employee> getEmployees();

	Employee getEmployee(Long id);

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(Long id);

}
