package com.fdmgroup.Inheritence;

public class SalaryManager {


    public void increaseSalary(Employee employee, double percentage){
        int salary = employee.getSalary();
        int increase = (int) (salary * (percentage /100) );

        salary += increase;
        employee.setSalary(salary);
    }
}
