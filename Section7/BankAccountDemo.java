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
        //Asking the user how much money they would like to deposit.
        System.out.println("Please enter the amount you would like to deposit:\t");
        //Creating a flag.
        Boolean myFlag = false;
        //Creating a while loop.
        while(myFlag != true)
        {
            //Creating a try/catch block.
            try
            {
                //Allowing user to select an amount to deposit.
                double depositMoney = keyboard.nextDouble();
            }
            catch(Exception e)
            {
                //Printing a message to the user.
                System.out.println("Sorry, but that is not a valid entry.");
            }
            //Assigning a variable to the act of depositing money into the bank.
            int my_balance = myBank.deposit(43243);
            //Printing the current amount the user has.
            System.out.println(my_balance);
            //Printing the account owner's name.
            System.out.println("The account owner is, " + myBank.getOwner("Matthew"));
            //Printing the balance.
            System.out.print("Please enter the value you would like to withdraw from your bank account:\t");
            //Accepting user input.
            int myWithdrawal = keyboard.nextInt();
            //Creating a try/finally block.
            try 
            {
                
                //Printing the money left over after a withdrawal.
                System.out.println((myBank.withdrawMoney(my_balance, myWithdrawal)));
            }
            //Catching the exception where an invalid value has been entered.
            catch(Exception E)
            {
                //Printing out that the operation may not be completed.
                System.out.println("Sorry, but the entry was not valid, please try again! ");
            }

        }
        
    }
}
