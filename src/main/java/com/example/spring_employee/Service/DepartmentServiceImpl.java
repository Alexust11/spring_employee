package com.example.spring_employee.Service;


import com.example.spring_employee.Model.Employee;
import org.apache.el.stream.Stream;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeServise employeeServise;
//    private final Map<Integer,List<Employee>> employeeMap;

    public DepartmentServiceImpl(EmployeeServise employeeServise){                   //, Map<Integer, List<Employee>> employeeMap) {
        this.employeeServise = employeeServise;
//        this.employeeMap = employeeMap;
    }

    @Override
    public Optional<Employee> getMaxSalary(Integer numberDepartment) {
        return employeeServise.getAll().stream().filter(x->x.getNumberDepartment()==numberDepartment).max(Comparator.comparingDouble(Employee::getSalary));
    }

    @Override
    public Optional<Employee> getMinSalary(Integer numberDepartment) {
        return employeeServise.getAll().stream().filter(x->x.getNumberDepartment()==numberDepartment).min(Comparator.comparingDouble(Employee::getSalary));
    }

    @Override
    public List<Employee> getAll(Integer numberDepartment) {
        return employeeServise.getAll().stream().filter(x->x.getNumberDepartment()==numberDepartment).collect(Collectors.toList());
    }

    @Override
    public double getSumSalary(Integer numberDepartment) {
        return employeeServise.getAll().stream().filter(x->x.getNumberDepartment()==numberDepartment).mapToDouble(Employee::getSalary).sum();
    }




}
