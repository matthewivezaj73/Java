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
        //Checking if the user is withdrawing more than they have.
        if(myBank.balance < myBank.withdrawal)
        //Printing the account owner's name.
        System.out.println("The account owner is, " + myBank.getOwner("Matthew"));
        //Printing the balance.
        System.out.println("You are starting with, " + myBank.balance(0));
        //Printing the details for myBank.
        myBank.displayBankingDetails();

    }
}
