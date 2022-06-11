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
    //Creating a constructor to represent the act of making a withdrawal.
    public float withdrawMoney()
    {   //Checking if the withdrawal amount is greater than 0.
        if(withdrawal > 0)
        {
            //Return balance left over.
            return withdrawal;
        }
    }
}
