package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiseTest {
    private final EmployeeServiseImpl employeeServiceOut=new EmployeeServiseImpl();

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
        Employee actual =employeeServiceOut.add (firstName, lastName, numberDepartment, salary);
        assertEquals(expected, actual);
    }



    @ParameterizedTest
    @MethodSource("ParamsForEmployeeTest")
    void getAll() {
        List<Employee> expected = new ArrayList<>();
        expected.add(0, new Employee("Ivan","Ivanov",1,1000));
        expected.add(1, new Employee("P","Ivanov",1,1000));

        assertEquals(expected,employeeServiceOut.getAll());

    }
}