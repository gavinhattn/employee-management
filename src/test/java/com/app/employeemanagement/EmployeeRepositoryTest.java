package com.app.employeemanagement;

import com.app.employeemanagement.repository.EmployeeRepository;
import com.app.employeemanagement.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testFindAll() {
        List<Employee> employees = employeeRepository.findAll();
        assertEquals(0, employees.size());
    }
}
