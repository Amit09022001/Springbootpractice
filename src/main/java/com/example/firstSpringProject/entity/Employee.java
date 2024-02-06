package com.example.firstSpringProject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int empId;
    @Column(name = "Emp_Name")
    private String empName;
    @Column(name = "Emp_Salary")
    private double empSalary;
    @Column(name = "Emp_Department")
    private String department;
    @Column(name = "Emp_baseLocation")
    private String baseLocation;
    private long empMobile;
    private String empEmail;


}
