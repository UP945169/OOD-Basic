package com.fdmgroup.Inheritence.Exercises;

import java.util.ArrayList;

public class UserAccountManager{
    ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();



    public void addUser(UserAccount user){
        userAccounts.add(user);
    }

    public boolean login(String username, String password){
        int index = 0;
        while (index < userAccounts.size()){
            if((userAccounts.get(index).getUsername().equals(username)) &&
                    (userAccounts.get(index).getPassword().equals(password))){
                return true;
            }
            else{
                index++;
            }
        }
        return false;
    }

}
