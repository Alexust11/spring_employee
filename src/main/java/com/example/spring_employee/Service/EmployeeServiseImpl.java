package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiseImpl implements EmployeeServise {
     private final List<Employee> employeeList=new ArrayList<>();




    @Override
    public Employee employeeAdd(String firstName, String lastName, int numberDepartment, double salary) {
        Employee employee = new Employee(firstName,lastName,numberDepartment,salary);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee employeeFind(String firstName, String lastName, int numberDepartment, double salary) {


        return employeeList.stream().filter(employee -> employee.getFirstName().equals(firstName)&&employee.getLastName().equals(lastName)&&);
    }

    @Override
    public Employee employeeRemove(String firstName, String lastName, int numberDepartment, double salary) {
        return null;
    }
}
