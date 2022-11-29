package com.example.spring_employee.Service;

import com.example.spring_employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final EmployeeRepository employeeRepository=new EmployeeRepository();


    @Override
    public Double getMaxSalary(Integer numberDepartment) {
        return employeeRepository.getAll().stream().filter(x->x.getNumberDepartment()==numberDepartment).mapToDouble(x->x.salary).sum();
    }
}
