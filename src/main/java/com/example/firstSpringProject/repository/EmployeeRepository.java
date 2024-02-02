package com.example.firstSpringProject.repository;

import com.example.firstSpringProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public Employee findByEmpName(String empName);
}
