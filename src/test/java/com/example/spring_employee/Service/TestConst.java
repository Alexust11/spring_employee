package com.example.spring_employee.Service;

import com.example.spring_employee.Model.Employee;

public class TestConst {
   public final static Employee MAX_SALARY=new Employee("Ivan", "Ivanov", 2, 30000);
   public final static Employee MIN_SALARY=new Employee("Petr", "Petrov", 1, 20000);
   public final static double SUM_SALARY=30000;
   public static final Employee EMPLOYEE_DOUBLE_SURNAME = new Employee("Ivan", "Ivanov-Petrov", 2, 34000);
   public static final Employee EMPLOYEE_ALL_CAPITAL_LETTERS=new Employee("IVAN", "IVANOV", 2, 34000);
   public static final Employee EMPLOYEE_LOWCASE_LETTERS=new Employee("ivan", "ivanov", 2, 34000);
   public static final Employee EMPLOYEE_INCORRECT_SYMBOL= new Employee("iva!!", "ivanov", 3, 2000);
}
