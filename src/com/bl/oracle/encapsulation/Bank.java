package com.bl.oracle.encapsulation;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNo(789056799767L);
        account.setName("shirisha");
        account.setAmount(10000f);
        System.out.println("Account Number :" + account.getAccountNo());
        System.out.println("Account holder Name : " + account.getName());
        System.out.println("balance amount : " + account.getAmount());
    }
}
