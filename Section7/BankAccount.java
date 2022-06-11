/**
 *      Matthew Ivezaj
 *      6/11/2022
 *      BankAccount.java
 */
//Creating a public class.
public class BankAccount {
    //Creating private variables.
    private static double balance;
    private static double withdrawal;
    private static double deposit;
    //Creating a public method.
    public BankAccount(double balance, double withdrawal, double deposit)
    {
        //Initializing variables.
        BankAccount.balance = balance;
        BankAccount.withdrawal = withdrawal;
        BankAccount.deposit = f;
    }
    //Creating a constructor to represent the act of checking your balance.
    public float balance()
    {
        //Returning the current balance.
        return balance;
    }
    //Creating a constructor to represent the act of making a deposit.
    public float deposit()
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
            System.out.println("You now have, " + (balance - withdrawal) + ", left over.");
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
    //Creating a constructor to represent the act of making a withdrawal.
    public float withdrawMoney()
    {
        //Returning the amount to withdraw.
        return withdrawal;
    }
}
