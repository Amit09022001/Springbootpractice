package com.example.firstSpringProject.serviceImpl;

import com.example.firstSpringProject.entity.Employee;
import com.example.firstSpringProject.exception.EmployeeNotFoundException;
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
    public Employee addEmployeeDetails(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @Override
    public Employee updateEmployee(Employee employee, int id) {
        Employee emp=employeeRepository.findById(id).get();
        Employee emp1=null;
        if(emp==null){
            System.out.println("Employee doesnot exist");
        }
        else{
            emp.setEmpName(employee.getEmpName());
            emp.setEmpSalary(employee.getEmpSalary());
            emp.setBaseLocation(employee.getBaseLocation());
            emp.setDepartment(employee.getDepartment());
            emp.setEmpEmail(employee.getEmpEmail());
            emp.setEmpMobile(employee.getEmpMobile());
         emp1=employeeRepository.save(emp);

        }
        return emp1;
    }

    @Override
    public Employee getEmployeeByName(String employeeName) {
        return employeeRepository.findByEmpName(employeeName);
    }


}
