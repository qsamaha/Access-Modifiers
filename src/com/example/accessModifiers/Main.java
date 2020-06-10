package com.example.accessModifiers;

public class Main {

    public static void main(String[] args) {
	    Account account = new Account("Q's Account");
	    account.deposit(10);
        account.withdrawal(5);
        account.withdrawal(-9);
        account.deposit(-3);
        account.calculateBalance();

        System.out.println("Balance on account is "+ account.getBalance());


    }
}
