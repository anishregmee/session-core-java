package day1;

public class MyBankApplication {
    public static void main(String[] args) {

        BankAccount anishAccount = new BankAccount();

        anishAccount.accountNumber = "123456789";
        anishAccount.accountOwner = "Anish Regmee";
        anishAccount.address = "123456789";
        anishAccount.balance = 55000;
        anishAccount.openingDate = "11/28/2022";
        anishAccount.openingBranch = "Fort Worth";
        anishAccount.socialSecurityNumber = "111222333";
//            anishAccount.bankName = "Jp Morgan Chase";

        BankAccount rameshAccount = new BankAccount();
        rameshAccount.accountNumber = "123456789";
        rameshAccount.accountOwner = "Ramesh Tamang";
        rameshAccount.address = "8989";
        rameshAccount.balance = 5000;
        rameshAccount.openingDate = "11/28/2020";
        rameshAccount.openingBranch = "Decatur";
        rameshAccount.socialSecurityNumber = "333222111";
//            rameshAccount.bankName = "Bank of America";


        System.out.println(anishAccount.accountNumber);
        System.out.println(rameshAccount.accountNumber);
        System.out.println("testing passed");


    }
}
