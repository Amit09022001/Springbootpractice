package com.example.firstSpringProject.exception;

public class EmployeeNotFoundException extends RuntimeException{
    private Integer id;
     public EmployeeNotFoundException(Integer id){
         super("Could not find Employee by given Employee Id :"+id);

    }
}
