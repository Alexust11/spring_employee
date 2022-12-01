package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiseTest {
    private final EmployeeServiseImpl employeeServiceOut = new EmployeeServiseImpl();

    public static Stream<Arguments> ParamsForEmployeeTest() {
        return Stream.of(
                Arguments.of("Ivan", "Ivanov", 1, 100000),
                Arguments.of("Petr", "Petrov", 1, 100000)
        );
    }

    @ParameterizedTest
    @MethodSource("ParamsForEmployeeTest")
    public void employeeAddTest(String firstName, String lastName, int numberDepartment, double salary) {
        Employee expected = new Employee(firstName, lastName, numberDepartment, salary);
        Employee actual = employeeServiceOut.add(firstName, lastName, numberDepartment, salary);
        assertEquals(expected, actual);
    }


    @Test
    void getAllTest() {
        Employee employee1 = new Employee("Ivan", "Ivanov", 1, 10000);
        Employee employee2 = new Employee("Petr", "Ivanov", 2, 20000);
        Employee employee3 = new Employee("Ivan", "Petrov", 3, 30000);
        List<Employee> actual = new ArrayList<Employee>();
        actual.add(employee1);
        actual.add(employee2);
        actual.add(employee3);
        employeeServiceOut.add("Ivan", "Ivanov", 1, 10000);
        employeeServiceOut.add("Petr", "Ivanov", 2, 20000);
        employeeServiceOut.add("Ivan", "Petrov", 3, 30000);
        List<Employee> expected = employeeServiceOut.getAll();
        assertEquals(expected, actual);
    }
}