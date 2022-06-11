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
        BankAccount myBank = new BankAccount("Matthew", 0, 4323, 7324);
        //Printing the balance.
        System.out.println(myBank.balance(0));
        //Printing the details for myBank.
        myBank.displayBankingDetails();

    }
}
