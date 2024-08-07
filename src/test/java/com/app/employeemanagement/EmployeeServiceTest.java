package com.app.employeemanagement;

import com.app.employeemanagement.entity.Employee;
import com.app.employeemanagement.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Test
    public void testGetAllEmployees() {
        Mockito.when(employeeRepository.findAll()).thenReturn(Collections.emptyList());
        assertEquals(0, employeeService.getAllEmployees().size());
    }

    @Test
    public void testGetEmployeeById() {
        Employee employee = new Employee();
        employee.setId(1L);
        Mockito.when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
        assertTrue(employeeService.getEmployeeById(1L).isPresent());
    }
}
