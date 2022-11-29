package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class DepartmentServiceImplTest {

    @Mock
    private EmployeeServise employeeServise;
    @InjectMocks
    private DepartmentServiceImpl departmentService;
    private List<Employee> actualEmployeeList;
    @BeforeEach
    public void setUp() {
        Employee employee1 = new Employee("Petr", "Petrov", 1, 20000);
        Employee employee2 = new Employee("Ivan", "Ivanov", 2, 30000);
        Employee employee3 = new Employee("Petr", "Ivanov", 1, 25000);
    }

    @Test
    void getMaxSalary() {
    }

    @Test
    void getMinSalary() {
    }

    @Test
    void getAll() {
    }

    @Test
    void getSumSalary() {
    }
}