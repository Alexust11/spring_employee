package com.example.spring_employee.Controller;

import com.example.spring_employee.Model.Employee;
import com.example.spring_employee.Service.DepartmentService;
import com.example.spring_employee.Service.EmployeeServise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class EmployeeController {
    private final EmployeeServise employeeServise;


    public EmployeeController(EmployeeServise employeeServise) {
        this.employeeServise = employeeServise;
            }

    @GetMapping("/add")
    public Employee Add(@RequestParam("name") String name,
                        @RequestParam("surName") String surName,
                        @RequestParam("department") Integer numberDepartment,
                        @RequestParam("salary") double salary) {

        return employeeServise.add(name, surName, numberDepartment, salary);


    }



}