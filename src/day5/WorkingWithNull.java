package day5;

import day1.BankAccount;

public class WorkingWithNull {
    public static void main(String[] args) {

        BankAccount anishAccount = new BankAccount();

        System.out.println(anishAccount.getBalance());
        System.out.println(anishAccount.getAccountNumber());
        System.out.println(anishAccount.getAddress());
    }
}
