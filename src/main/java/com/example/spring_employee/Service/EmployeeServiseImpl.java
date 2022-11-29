package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiseImpl implements EmployeeServise {
    private final List<Employee> employeeList=new ArrayList<>();


    @Override
    public Employee add(String name, String surName, Integer numberDepartment, double salary) {
        Employee employee = new Employee(name, surName, numberDepartment, salary);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        return  employeeList;
    }


}
