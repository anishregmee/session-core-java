package day5;

import day1.Address;
import day1.BankAccount;

import java.util.Objects;

public class WorkingWithNull {
    public static void main(String[] args) {

//        BankAccount anishAccount = new BankAccount();//dont use this way of creating an object inorder to avoid null point
                                                     //point exception

//        Address address = null;

        Address address = new Address("CountryName", "StateName", null, "StreetName");

        BankAccount anishAccount = new BankAccount("534354", null, 20, address, "12/12/2020", "haltom", "1212112");
        System.out.println(anishAccount.getBalance());
        System.out.println(anishAccount.getAccountNumber());
        System.out.println(anishAccount.getAddress());
        System.out.println(anishAccount.getAccountOwner());

        anishAccount.setAccountNumber("112233");

        int length = anishAccount.getAccountNumber().length();

        boolean isAddressNull = Objects.isNull(anishAccount.getAddress());
        System.out.println(isAddressNull);

        if (!isAddressNull){
            String addressCity = anishAccount.getAddress().getCity();
            System.out.println(addressCity);
        }
    }
}
