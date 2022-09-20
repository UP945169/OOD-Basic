package com.fdmgroup.polymorphism.Exercises;

public class Customer extends UserAccount {

    private static int minAdminPasswordLength;

    public Customer(String username, String password, String fullName) {
        super(username, password, fullName);
    }

    @Override
    public boolean changePassword(String newPass, String confirmPass) {
        if((newPass.length() >= minAdminPasswordLength)){
            return super.changePassword(newPass, confirmPass);
        }
        return false;
    }


    public static int getMinAdminPasswordLength() {
        return minAdminPasswordLength;
    }

    public static void setMinAdminPasswordLength(int minAdminPasswordLength) {
        Customer.minAdminPasswordLength = minAdminPasswordLength;
    }

    @Override
    public void accessWebsite() {
        System.out.println("Accessing website as a customer");
    }
}
