package com.fdmgroup.Inheritence;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private List<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, String jobTitle, int salary) {
        //veritcal chain constructor chaining
        super(name, jobTitle, salary);
    }

    public void manage(){
        System.out.println(getName() + " is managing their team");
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
