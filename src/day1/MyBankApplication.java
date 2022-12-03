package day1;

public class MyBankApplication {
    public static void main(String[] args) {

        BankAccount anishAccount = new BankAccount();

        anishAccount.setAccountNumber("12345");
        anishAccount.setAccountOwner("Anish Regmee");
//        anishAccount.setAddress("North Richland Hills");
        anishAccount.setBalance(7878);
        anishAccount.setOpeningDate("11/23/2020");
        anishAccount.setOpeningBranch("Fort Worth");
        anishAccount.setSocialSecurityNumber("111222333");

        BankAccount rameshAccount = new BankAccount();
        rameshAccount.setAccountNumber("67890");
        rameshAccount.setAccountOwner("Ramesh Tamang");
//        rameshAccount.setAddress("8989");
        rameshAccount.setBalance(5000);
        rameshAccount.setOpeningDate("11/28/2020");
        rameshAccount.setOpeningBranch("Decatur");
        rameshAccount.setSocialSecurityNumber("333222111");


        System.out.println(anishAccount.getAccountNumber());
        System.out.println(rameshAccount.getAccountNumber());
        System.out.println(rameshAccount.getBANK_NAME());
        System.out.println("testing passed");


    }
}
