package com.priyanka.datta.springbootcrud.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.priyanka.datta.springbootcrud.entity.Employee;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorrectResponse {

    private String ResponseCode;

    private String responseMessage;

    private List<Employee> employees;

    private Employee employee;
}
