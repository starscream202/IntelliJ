package com.syntax.class13;

public class Account {
    String AccountId;
    String userName;
    String password;
    double balance;
    String TypesofAccount;
    double limit;

    boolean login(String enteredUserName, String enteredpassword) {
        if (userName.equals(enteredUserName) &&
                password.equals(enteredpassword)) {
            return true;
        } else {
            return false;
        }

    }
}
