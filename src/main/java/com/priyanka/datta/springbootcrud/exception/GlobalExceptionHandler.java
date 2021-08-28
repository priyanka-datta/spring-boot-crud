package com.priyanka.datta.springbootcrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<Object> handleEmployeeNotFoundException(EmployeeNotFoundException e){
        ErroneousResponse erroneousResponse = new ErroneousResponse();
        erroneousResponse.setErrorCode(HttpStatus.NOT_FOUND.getReasonPhrase());
        erroneousResponse.setErrorMessage(e.getMessage());
        return new ResponseEntity<>(erroneousResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoEmployeeFoundException.class)
    public ResponseEntity<Object> handleNoEmployeeFoundException(NoEmployeeFoundException e){
        ErroneousResponse erroneousResponse = new ErroneousResponse();
        erroneousResponse.setErrorCode(HttpStatus.NOT_FOUND.getReasonPhrase());
        erroneousResponse.setErrorMessage(e.getMessage());
        return new ResponseEntity<>(erroneousResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleServerException(Exception e){
        ErroneousResponse erroneousResponse = new ErroneousResponse();
        erroneousResponse.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        erroneousResponse.setErrorMessage(e.getMessage());
        return new ResponseEntity<>(erroneousResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
