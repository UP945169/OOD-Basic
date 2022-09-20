package com.fdmgroup.polymorphism.Exercises;

public class AdminUser extends UserAccount {

    private static int minAdminPasswordLength;


    //override method
    @Override
    public boolean changePassword(String newPass, String confirmPass) {
        if(newPass.length() >= minAdminPasswordLength){
            return super.changePassword(newPass, confirmPass);
        }
        return false;
    }


    //overloading
    public boolean changePassword(String newPass, String confirmPass, UserAccount account){
        return account.changePassword(newPass,confirmPass);
    }

    public static int getMinAdminPasswordLength(){

        return minAdminPasswordLength;
    }

    public static void setMinAdminPasswordLength(int length){
        AdminUser.minAdminPasswordLength = length;
    }

    public AdminUser(String username, String password, String fullName) {
        super(username, password, fullName);
    }

    @Override
    public void accessWebsite() {
        System.out.println("Accessing website with admin rights");
    }
}
