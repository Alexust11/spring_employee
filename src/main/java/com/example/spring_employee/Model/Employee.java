package com.example.spring_employee.Model;

import java.util.Objects;

public class Employee {
    private String name;
    private String surName;
    public Integer numberDepartment;
    public double salary;

    public Employee(String name, String surName, Integer numberDepartment, double salary) {
        this.name = name;
        this.surName = surName;
        this.numberDepartment = numberDepartment;
        this.salary = salary;
    }


    public int getNumberDepartment() {
        return numberDepartment;
    }

    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
    }

    public String getLastName() {
        return surName;
    }

    public void setLastName(String lastName) {
        this.surName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && surName.equals(employee.surName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }

    @Override
    public String toString() {
        return   "firstName=" + name + ", lastName=" + surName + ", numberDepartment=" + numberDepartment +", salary=" + salary;
    }
}
