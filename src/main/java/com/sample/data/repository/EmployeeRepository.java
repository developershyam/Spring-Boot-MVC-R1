package com.sample.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.data.model.Employee;

/**
 * This interface is designed for employee CRUD operations.
 * 
 * @author shyam.pareek
 *
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
