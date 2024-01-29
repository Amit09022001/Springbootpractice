package com.example.firstSpringProject.controller;

import com.example.firstSpringProject.entity.Employee;
import com.example.firstSpringProject.repository.EmployeeRepository;
import com.example.firstSpringProject.serviceImpl.EmployeeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    public static final Logger LOGGER= LoggerFactory.getLogger(EmployeeController.class);
     private EmployeeRepository employeeRepository;
     public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }
    @Autowired
    EmployeeServiceImpl employeeServiceImpl;
      @GetMapping("/all")
    public ResponseEntity<List<Employee>>getAllEmployeeDetails(Employee employee){
         List<Employee> employeeList=employeeServiceImpl.getAllEmployee(employee);
         if(employeeList.size()<=0){
             LOGGER.error("Employee Details not found in Data base");
             return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
         }
//         return ResponseEntity.of(Optional.of(employeeList));
        LOGGER.info("Employee Details fetched from data base "+employeeList);
         return ResponseEntity.status(HttpStatus.OK).body(employeeList);



    }
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
          Employee employee1=null;
          try{
              employee1=employeeServiceImpl.addEmployeeDetails(employee);
              LOGGER.info("Employee added to database: "+employee1.toString());
              return ResponseEntity.status(HttpStatus.CREATED).body(employee1);


          }catch(Exception e){
              e.printStackTrace();
              return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

          }


    }
}
