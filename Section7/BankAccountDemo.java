/**
 *      Matthew Ivezaj
 *      6/11/2022
 *      BankAccountDemo.java
 */
//Creating a public class.
public class BankAccountDemo {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a bank account object.
        BankAccount myBank = new BankAccount(232324.00, 4323.32, 7324.32);
        //Creating a bank account object.
        BankAccount yourBank = new BankAccount(432864.32, 3221.34, 42433.14);
        //Creating a bank account object.
        BankAccount hisBank = new BankAccount(762442.34, 32423.32, 43243.23);
        //Creating a bank account object.
        BankAccount herBank = new BankAccount(89423874.43, 298347.34, 878432.43);
        //Printing the details for myBank.
        myBank.displayBankingDetails();
        //Printing the details for yourBank.
        yourBank.displayBankingDetails();
        //Printing the details for hisBank.
        hisBank.displayBankingDetails();
    }
}
