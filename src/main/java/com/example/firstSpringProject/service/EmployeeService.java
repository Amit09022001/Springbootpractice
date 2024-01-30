package com.example.firstSpringProject.service;

import com.example.firstSpringProject.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee(Employee employee);
    public Employee addEmployeeDetails(Employee employee);
    public Employee getEmployeeById(int id);

    public Employee updateEmployee(Employee employee,int id);
}
