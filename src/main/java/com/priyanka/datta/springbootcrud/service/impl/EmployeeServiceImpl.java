package com.priyanka.datta.springbootcrud.service.impl;

import com.priyanka.datta.springbootcrud.entity.Employee;
import com.priyanka.datta.springbootcrud.exception.EmployeeNotFoundException;
import com.priyanka.datta.springbootcrud.exception.NoEmployeeFoundException;
import com.priyanka.datta.springbootcrud.repository.EmployeeRepository;
import com.priyanka.datta.springbootcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAllEmployees() {

        List<Employee> employees = employeeRepository.findAll();
        if (employees.isEmpty())
            throw new NoEmployeeFoundException("No employee found");
        return employees;
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (!optionalEmployee.isPresent())
            throw new EmployeeNotFoundException("Employee with id : "+ id+" not found");
        return optionalEmployee.get();
    }

    @Override
    public void deleteEmployeeById(Integer id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (!optionalEmployee.isPresent())
            throw new EmployeeNotFoundException("Employee with id : "+ id+" not found");
        employeeRepository.deleteById(id);
    }
}
