/*
    Matthew Ivezaj
    May 17, 2022
    Divisible by three
*/
//Importing Scanner.
import java.util.Scanner;
//Creating a public class.
public class divisibleByThree {
    //Creating a mean method.
    public static void main(String[] args) 
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Creating an integer.
        int userInput;
        //Asking the user to enter an integer. 
        System.out.println("Please enter an integer:");
        //Allowing the user to input an answer.
        userInput = keyboard.nextInt();
        //Handling the case where the user enters 0.
        if (userInput == 0)
        {
            //Printing out a statement to the user telling them that the number is not divisible by three.
            System.out.println("You entered 0, sorry, but this cannot be successfully divided.");
        }
        //Inserting an if statement to see if the number is divisible by three.
        else if((userInput%3) == 0)
        {
            //Printing a message out to the user.
            System.out.println(userInput+" is divisible by three!");
        }
        
        //Handling the case where the number is not divisible by three.
        else
        {
            //Printing out a statement to the user telling them that the number is not divisible by three.
            System.out.println("Sorry, but "+userInput+" is not divisible by 3.");
        }
    }
}