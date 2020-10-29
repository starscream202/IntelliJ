package com.syntax.class13;

public class BankingAPp {
    public static void main(String[] args) {
        Account AshAccount=new Account();
        AshAccount.userName="Starscream202";
        AshAccount.password="Pass123";
        AshAccount.TypesofAccount="Checking";
        AshAccount.balance=100000;
        AshAccount.AccountId="1217";
        boolean isLoggedIn=AshAccount
                .login("Starscream202",
                        "Pass123");
        System.out.println(isLoggedIn);
    }
}
