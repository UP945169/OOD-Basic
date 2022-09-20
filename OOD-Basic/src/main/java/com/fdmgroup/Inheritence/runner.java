package com.fdmgroup.Inheritence;

public class runner {
    public static void main(String[] args) {
        Manager manager = new Manager("John","Academy Manager", 100000);

        manager.manage();

        SalaryManager salaryManager1 = new SalaryManager();
        salaryManager1.increaseSalary(manager, 10);

        System.out.println(manager.getName() + " now earns " + manager.getSalary());
    }
}
