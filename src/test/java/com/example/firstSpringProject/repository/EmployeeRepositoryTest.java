package com.example.firstSpringProject.repository;

import com.example.firstSpringProject.entity.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;
    Employee employee;

    @BeforeEach
    void setUp() {
        employee=new Employee(1,"Amit Kumar",349098.78,
                "OISV","Noida,Uttarpradhesh",735532125,"amitkumarnic00hmt@gmail.com");
        employeeRepository.save(employee);
    }

    @AfterEach
    void tearDown() {
        employee=null;
        employeeRepository.deleteAll();
    }

    @Test
    void testFindByEmployeeName_Found(){
         Employee employee2=employeeRepository.findByEmpName("Amit Kumar");
        assertThat(employee2.getEmpId()).isEqualTo(employee.getEmpId());
        assertThat(employee2).isEqualTo(employee);
        assertThat(employee2.getEmpName()).isEqualTo(employee.getEmpName());
        assertThat(employee2.getBaseLocation()).isEqualTo(employee.getBaseLocation());
    }

    void testFindByEmployeeName_NotFound(){

    }
}
