package com.example.spring_employee.Controller;

import com.example.spring_employee.Model.Employee;
import com.example.spring_employee.Service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{id}/salary/max")
    public Double getMaxSalaryDep (@PathVariable("id") Integer numberDepartment) {
        return departmentService.getMaxSalary(numberDepartment);
    }
}
