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
        BankAccount myBank = new BankAccount("Matthew", 232324, 4323, 7324);
        //Creating a bank account object.
        BankAccount yourBank = new BankAccount("Suzy", 432864, 3221, 42433);
        //Creating a bank account object.
        BankAccount hisBank = new BankAccount("Sam",762442, 32423.32, 43243.23);
        //Creating a bank account object.
        BankAccount herBank = new BankAccount(89423874.43, 298347.34, 878432.43);
        //Printing the details for myBank.
        myBank.displayBankingDetails();
        //Printing the details for yourBank.
        yourBank.displayBankingDetails();
        //Printing the details for hisBank.
        hisBank.displayBankingDetails();
        //Printing the details for herBank.
        herBank.displayBankingDetails();
    }
}
