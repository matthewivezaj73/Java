/*
    Matthew Ivezaj
    May 17th, 2022
    Guess the number
*/
//Importing the random and Scanner tools.
import java.util.Random;
import java.util.Scanner;
//Creating a public class.
public class proj3_03GuessTheNumber {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a Scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Creating a new random object.
        Random random = new Random();
        //Creating an integer.
        int myRandomNumber;
        //Creating an integer.
        int userInput;
        //Asking the user to enter an integer between 1 and 100.
        System.out.println("Please enter a number between 1 and 100, inclusive:");
        //creating a variable to hold the users entry.
        userInput = keyboard.nextInt();
        //Assigning a value to myRandomNumber.
        myRandomNumber = random.nextInt(1,100);
        //Checking to see if the user input is lower than the random number.
        if(userInput < myRandomNumber)
        {
            //Notifing the user that the number generated is too low.
            System.out.println("Sorry, but, " + userInput + " is too low! Please try again.");
        }
        //Printing out the random number.
        System.out.println(myRandomNumber);
    }
}
