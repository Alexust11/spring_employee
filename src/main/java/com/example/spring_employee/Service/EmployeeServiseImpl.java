package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;
import com.example.spring_employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiseImpl implements EmployeeServise {
    private final EmployeeRepository employeeRepository=new EmployeeRepository();


    @Override
    public Employee add(String name, String surName, Integer numberDepartment, double salary) {
        Employee employee = new Employee(name, surName, numberDepartment, salary);
        employeeRepository.addEmployee(employee);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        return  employeeRepository.getAll();
    }


}
