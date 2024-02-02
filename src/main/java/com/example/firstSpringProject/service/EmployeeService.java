package com.example.firstSpringProject.service;

import com.example.firstSpringProject.entity.Employee;

import java.util.List;

public interface EmployeeService {
   List<Employee> getAllEmployee(Employee employee);
     Employee addEmployeeDetails(Employee employee);
     Employee getEmployeeById(int id);

     Employee updateEmployee(Employee employee,int id);

    public Employee getEmployeeByName(String employeeName);
}
