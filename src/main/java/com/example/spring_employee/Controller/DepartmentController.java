package com.example.spring_employee.Controller;

import com.example.spring_employee.Model.Employee;
import com.example.spring_employee.Service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{id}/employees")
    public List<Employee> getAll(@PathVariable("id") Integer numberDepartment) {
        return departmentService.getAll(numberDepartment);
    }


    @GetMapping("/{id}/salary/max")
    public Optional<Employee> getMaxSalaryDep(@PathVariable("id") Integer numberDepartment) {
        return departmentService.getMaxSalary(numberDepartment);
    }

    @GetMapping("/{id}/salary/min")
    public Optional<Employee> getMinSalaryDep(@PathVariable("id") Integer numberDepartment) {
        return departmentService.getMinSalary(numberDepartment);
    }

    @GetMapping("/{id}/salary/sum")
    public double getSumSalaryDep(@PathVariable("id") Integer numberDepartment) {
        return departmentService.getSumSalary(numberDepartment);
    }

//    @GetMapping("/employees")
//    public Map<Integer, List<Employee>> getAllSortDep() {
//        return departmentService.getAllSortDep();
//    }
}