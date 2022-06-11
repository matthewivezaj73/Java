/**
 *      Matthew Ivezaj
 *      6/11/2022
 *      BankAccountDemo.java
 */
//Importing library.
import java.util.Scanner;
//Creating a public class.
public class BankAccountDemo {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Creating a bank account object.
        BankAccount myBank = new BankAccount("Matthew", 0);
        //Assigning a variable to the act of depositing money into the bank.
        int my_balance = myBank.deposit(43243);
        //Printing the current amount the user has.
        System.out.println(my_balance);
        //Printing the account owner's name.
        System.out.println("The account owner is, " + myBank.getOwner("Matthew"));
        //Printing the balance.
        System.out.print("Please enter the value you would like to withdraw from your bank account:\t");
        //Creating a try/except block.
        try 
        {
            //Accepting user input.
            int myWithdrawal = keyboard.nextInt();
            //Printing the money left over after a withdrawal.
            System.out.println((myBank.withdrawMoney(my_balance, myWithdrawal)));
        }
        finally
        {
            
        }
        
    }
}
