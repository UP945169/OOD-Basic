package com.fdmgroup.Inheritence.Exercises;

public class Runner {
    public static void main(String[] args) {
        AdminUser adm1 = new AdminUser("John", "1234", "John Right");
        AdminUser adm2 = new AdminUser("Jane", "1234", "Jane Left");

        Customer customer1 = new Customer("Customer1", "Weak password", "Customer1");
        Customer customer2 = new Customer("Customer2", "Weak password", "Customer2");

        System.out.println(adm1.changePassword("1234","1234"));
        System.out.println(adm2.changePassword("wert","qwerty"));

        adm1.accessWebsite();
        customer1.accessWebsite();

        UserAccountManager uam1 = new UserAccountManager();
        UserAccount ua1 = new UserAccount("Sus" , "1234", "susruth Puppala") {
            @Override
            public void accessWebsite() {
                System.out.println("I have accessed this website");
            }
        };

        uam1.addUser(ua1);
    }
}
