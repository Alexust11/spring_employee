package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeServise {
    Employee employeeAdd(String firstName, String lastName, int numberDepartment, double salary) ;

    Employee employeeFind(String firstName, String lastName, int numberDepartment, double salary);

    Employee employeeRemove(String firstName, String lastName, int numberDepartment, double salary);

//    Map<String, Employee> employeeGetAll();
//
//    List<Employee> employeeGetAllList();
//
//    void EmployeeIsAbsent(Map employee, Employee currentEmployee);
//
//    void EmployeeAlreadyExists(Map employee, Employee currentEmployee);



}
