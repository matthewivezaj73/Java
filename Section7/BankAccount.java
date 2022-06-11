/**
 *      Matthew Ivezaj
 *      6/11/2022
 *      BankAccount.java
 */
//Creating a public class.
public class BankAccount {
    //Creating private variables.
    private static float balance;
    private static float withdrawal;
    private static float deposit;
    //Creating a public method.
    public BankAccount(float balance, float withdrawal, float deposit)
    {
        //Initializing variables.
        BankAccount.balance = balance;
        BankAccount.withdrawal = withdrawal;
        BankAccount.deposit = deposit;
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
        //Returning balance left over.
        return (balance + deposit);
    }
    //Creating a constructor to print the banking details.
    public void displayBankingDetails()
    {
        //Printing out the amount the user would like to withdraw.
        System.out.println("You are now withdrawing, ");
    }
    //Creating a constructor to represent the act of making a withdrawal.
    public float withdrawMoney()
    {
        //Return balance left over.
        return (balance - withdrawal);
    }
    
}
