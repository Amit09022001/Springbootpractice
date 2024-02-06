package com.example.firstSpringProject.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
@ResponseStatus(NOT_FOUND)
@Data
@AllArgsConstructor

public class ApplicationExceptionHandler {
    @ExceptionHandler(EmployeeNotFoundException.class)
     ResponseEntity<ErrorDetails> employeeNotFoundHandler(EmployeeNotFoundException ex, WebRequest webRequest) {
        ErrorDetails errorDetails=new ErrorDetails(new Date(),ex.getMessage(),webRequest.getDescription(false));
        return  new ResponseEntity<>(errorDetails, NOT_FOUND);
    }
}
