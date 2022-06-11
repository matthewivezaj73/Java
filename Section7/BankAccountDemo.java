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
        BankAccount myBank = new BankAccount("Matthew", 0);
        //Depositing money into the bank.
        float my_balance = myBank.deposit(43243);
        //Printing the current amount the user has.
        System.out.println(my_balance);
        //Printing the account owner's name.
        System.out.println("The account owner is, " + myBank.getOwner("Matthew"));
        //Printing the balance.
        // System.out.println("You are starting with, " + myBank.balance(0));
        //Printing the money left over after a withdrawal.
        myBank.withdrawMoney(43234);

    }
}
