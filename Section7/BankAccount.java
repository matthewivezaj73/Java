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
    public BankAccount(String owner, int balance, int withdrawal, int deposit)
    {
        //Initializing variables.
        BankAccount.owner = owner;
        BankAccount.balance = balance;
        BankAccount.withdrawal = withdrawal;
        BankAccount.deposit = deposit;
    }
    //Creating a constructor to represent the act of checking your balance.
    public int balance(int balance)
    {
        //Returning the current balance.
        return balance;
    }
    //Creating a constructor to represent the act of making a deposit.
    public int deposit(int deposit)
    {
        //Returning the amount to deposit.
        return deposit;
    }
    //Creating a constructor to print the banking details.
    public void displayBankingDetails()
    {
        //Printing out the amount the user would like to withdraw.
        System.out.println("You are now withdrawing, "+withdrawal);
        //Printing out the amount the user would like to deposit.
        System.out.println("You are now depositing, " + deposit);
        //Checking if withdrawal is a number greater than 0.
        if(withdrawal > 0)
        {
            //Printing out the remaining balance.
            System.out.println(owner+", you now have, " + (balance - withdrawal) + ", left over.");
        }
        //Checking if the deposit is greater than 0.
        else if(deposit > 0)
        {
            //Printing out the remaining balance.
            System.out.println("You now have, " + (balance + deposit) + ", left over.");
        }
        //Handling the case where either or is less than 0.
        else
        {
            //Printing out a message to the user saying that the action is not allowed.
            System.out.println("Sorry, but that action is not allowed.");
        }
    }
    //Creating a constructor to represent the act of retrieving the owner name.
    //Creating a constructor to represent the act of making a withdrawal.
    public double withdrawMoney(int withdrawal)
    {
        //Returning the amount to withdraw.
        return withdrawal;
    }
}
