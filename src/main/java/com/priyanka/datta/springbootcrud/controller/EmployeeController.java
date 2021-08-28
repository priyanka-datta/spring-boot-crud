package com.priyanka.datta.springbootcrud.controller;

import com.priyanka.datta.springbootcrud.entity.Employee;
import com.priyanka.datta.springbootcrud.exception.CorrectResponse;
import com.priyanka.datta.springbootcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<Object> saveEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        CorrectResponse correctResponse = new CorrectResponse();
        correctResponse.setResponseCode(HttpStatus.CREATED.getReasonPhrase());
        correctResponse.setResponseMessage("Employee saved successfully");
        return new ResponseEntity(correctResponse,HttpStatus.CREATED);
    }

    @GetMapping("/findEmployees")
    public ResponseEntity<Object> finaAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();
        CorrectResponse correctResponse = new CorrectResponse();
        correctResponse.setResponseCode(HttpStatus.OK.getReasonPhrase());
        correctResponse.setEmployees(employees);
        return new ResponseEntity(correctResponse,HttpStatus.OK);
    }

    @GetMapping("/findEmployee/{id}")
    public ResponseEntity<Object> findEmployeeById(@PathVariable Integer id){
        Employee employee = employeeService.findEmployeeById(id);
        CorrectResponse correctResponse = new CorrectResponse();
        correctResponse.setResponseCode(HttpStatus.OK.getReasonPhrase());
        correctResponse.setEmployee(employee);
        return new ResponseEntity(correctResponse,HttpStatus.OK);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<Object> deleteEmployeeById(@PathVariable Integer id){
        employeeService.deleteEmployeeById(id);
        CorrectResponse correctResponse = new CorrectResponse();
        correctResponse.setResponseCode(HttpStatus.OK.getReasonPhrase());
        correctResponse.setResponseMessage("Employee deleted successfully");
        return new ResponseEntity(correctResponse,HttpStatus.OK);
    }
}
