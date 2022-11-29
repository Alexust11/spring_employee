package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DepartmentService {
       Optional<Employee> getMaxSalary(Integer numberDepartment);


       Optional<Employee> getMinSalary(Integer numberDepartment);

       List<Employee> getAll(Integer numberDepartment);

       double getSumSalary(Integer numberDepartment);

//       Map<Integer, List<Employee>> getAllSortDep();
}
