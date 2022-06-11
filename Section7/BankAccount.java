/**
 *      Matthew Ivezaj
 *      6/11/2022
 *      BankAccount.java
 */
//Creating a public class.
public class BankAccount {
    //Creating private variables.
    private static String owner;
    private static int balance;
    private static int withdrawal;
    private static int deposit;
    //Creating a public method.
    public BankAccount(String owner, int balance)
    {
        //Initializing variables.
        BankAccount.owner = owner;
        BankAccount.balance = balance;
    }
    //Creating a constructor to represent the act of checking your balance.
    public int balance(int balance)
    {   
        //Handling the case where the balance is greater than 0.
        if(balance > 0)
        {
            //Returning the current balance.
            return balance;
        }
        //Handling the case where the balance is not greater than 0.
        else
        {
            //Returning false.
            return 0;
        }
    }
    //Creating a constructor to represent the act of making a deposit.
    public int deposit(int deposit)
    {
        //Returning the amount to deposit.
        return (balance + deposit);
    }
    //Creating a constructor to print the banking details.
    public void displayBankingDetails()
    {
        //Printing out the amount the user would like to deposit.
        System.out.println("You are now depositing, " + deposit);
        //Printing out the amount the user would like to withdraw.
        System.out.println("You are now withdrawing, "+withdrawal);
        //Checking if withdrawal is a number greater than 0.
        if((withdrawal > 0) && (deposit > 0))
        {
            //Printing out the remaining balance.
            System.out.println(owner+", you now have, " + (balance - withdrawal + deposit) + ", left over.");
        }
        //Handling the case where either or is less than 0.
        else
        {
            //Printing out a message to the user saying that the action is not allowed.
            System.out.println("Sorry, but that action is not allowed.");
        }
    }
    //Creating a constructor to represent the act of retrieving the owner name.
    public String getOwner(String owner)
    {
        //Returning the name of the owner.
        return owner;
    }
    //Creating a constructor to represent the act of making a withdrawal.
    public double withdrawMoney(int withdrawal)
    {
        //Executing code if the balance is greater than the withdrawal.
        if(balance > withdrawal)
        {
            //Returning the amount to withdraw.
            return (balance - withdrawal);
        }
        //Handling all other cases.
        else if(balance < withdrawal)
        {
            //Printing a message to the user.
            System.out.print("The balance will remain, ");
            //Returning 0.
            return balance;
        }
        //Handling all other cases.
        else
        {
            
        }
    }
}
