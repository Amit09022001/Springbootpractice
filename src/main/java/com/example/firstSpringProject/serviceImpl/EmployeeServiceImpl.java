package com.example.firstSpringProject.serviceImpl;

import com.example.firstSpringProject.entity.Employee;
import com.example.firstSpringProject.repository.EmployeeRepository;
import com.example.firstSpringProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee(Employee employee) {
        return employeeRepository.findAll();
    }
    @Override
    public Employee addEmployeeDetails(Employee employee){
        return employeeRepository.save(employee);
    }
}
