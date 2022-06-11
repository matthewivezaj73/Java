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
        //Creating an if statement to check if the balance > 0.
        //Creating a bank account object.
        BankAccount myBank = new BankAccount("Matthew", 0, 4323, 7324);
        //Printing the account owner's name.
        System.out.println("The account owner is, " + myBank.getOwner("Matthew"));
        //Printing the balance.
        System.out.println("You are starting with, " + myBank.balance(0));
        //Printing the details for myBank.
        myBank.displayBankingDetails();

    }
}
