package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceImplTest {
    private static Employee MAX_SALARY=new Employee("Ivan", "Ivanov", 2, 30000);
    @Mock
    private EmployeeServise employeeServise;
    @InjectMocks
    private DepartmentServiceImpl departmentService;
    private List<Employee> actualEmployeeList;
    private final Integer numberDepActual=2;
    private final Integer numberDepExpected=2;
    @BeforeEach
    public void setUp() {

        Employee employee1 = new Employee("Petr", "Petrov", 1, 20000);
        Employee employee2 = new Employee("Ivan", "Ivanov", 2, 30000);
        Employee employee3 = new Employee("Petr", "Ivanov", 1, 25000);
        actualEmployeeList=new ArrayList<>(List.of(employee1,employee2,employee3));
        when(employeeServise.getAll()).thenReturn(actualEmployeeList);
    }

    @Test
    void getMaxSalary() {
        assertEquals(MAX_SALARY.getSalary(), departmentService.getMaxSalary(numberDepExpected));
    }

    @Test
    void getMinSalary() {
        assertEquals(actualEmployeeList.stream().filter(x->x.getNumberDepartment()==numberDepActual).min(Comparator.comparingDouble(Employee::getSalary)), departmentService.getMinSalary(numberDepExpected));
    }

    @Test
    void getAll() {
      assertEquals(actualEmployeeList.stream().filter(x->x.getNumberDepartment()==numberDepActual).collect(Collectors.toList()),departmentService.getAll(numberDepExpected));
    }

    @Test
    void getSumSalary() {
       assertEquals(actualEmployeeList.stream().filter(x->x.getNumberDepartment()==numberDepActual).mapToDouble(Employee::getSalary).sum(),departmentService.getSumSalary(numberDepExpected));
    }
}