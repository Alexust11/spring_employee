package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;


import java.util.List;
import java.util.Map;

public interface EmployeeServise {


   Employee add(String name, String surName, Integer numberDepartment, double salary);

  List<Employee> getAll();
}
