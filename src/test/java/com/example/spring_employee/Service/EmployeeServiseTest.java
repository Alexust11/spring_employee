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

import static com.example.spring_employee.Service.TestConst.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

    @Test
    void checkCorrectAddIsEmpty() {
        assertThat(employeeServiceOut.getAll()).isEmpty();
    }

    @Test
    void DoubleSurName() {
        Employee expected=employeeServiceOut.add(Employee_DoubleSurname.getFirstName(),Employee_DoubleSurname.getLastName(),
                                                 Employee_DoubleSurname.getNumberDepartment(),Employee_DoubleSurname.getSalary());
        assertEquals(expected, Employee_DoubleSurname);
    }

    @Test
    void allCapitalLetters() {
        Employee expected=employeeServiceOut.add(EMPLOYEE_ALL_CAPITAL_LETTERS.getFirstName(),EMPLOYEE_ALL_CAPITAL_LETTERS.getLastName(),
                EMPLOYEE_ALL_CAPITAL_LETTERS.getNumberDepartment(),EMPLOYEE_ALL_CAPITAL_LETTERS.getSalary());
        assertEquals(expected, EMPLOYEE_ALL_CAPITAL_LETTERS);
    }
    @Test
    void  allLowCaseLetters() {
        Employee expected=employeeServiceOut.add(EMPLOYEE_LOWCASE_LETTERS.getFirstName(),EMPLOYEE_LOWCASE_LETTERS.getLastName(),
                EMPLOYEE_LOWCASE_LETTERS.getNumberDepartment(),EMPLOYEE_LOWCASE_LETTERS.getSalary());
        assertEquals(expected, EMPLOYEE_LOWCASE_LETTERS);

    }
    @Test
    public void shouldReturnEmployeeIncorrectParamException() {
        assertThrows(RuntimeException.class,
                () -> employeeServiceOut.add(EMPLOYEE_INCORRECT_SYMBOL.getFirstName(),
                        EMPLOYEE_INCORRECT_SYMBOL.getLastName(),
                        EMPLOYEE_INCORRECT_SYMBOL.getNumberDepartment(),
                        EMPLOYEE_INCORRECT_SYMBOL.getSalary()));
    }

}