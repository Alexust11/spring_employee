package com.example.spring_employee.repository;

import com.example.spring_employee.Model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRepository {
    private final List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getAll() {
        return employeeList;
    }

//    public Double findEmployee(Integer number) {
//        return employeeList.stream().filter(x->x.getNumberDepartment()==number).forEach();
//    }
}
