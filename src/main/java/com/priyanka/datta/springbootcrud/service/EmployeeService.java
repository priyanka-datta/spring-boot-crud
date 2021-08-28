package com.priyanka.datta.springbootcrud.service;

import com.priyanka.datta.springbootcrud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> findAllEmployees();

    Employee findEmployeeById(Integer id);

    void deleteEmployeeById(Integer id);
}
