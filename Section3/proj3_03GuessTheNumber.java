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
        //Creating a variable to keep track of the number of guesses.
        int numberOfGuesses;
        //Asking the user to enter an integer between 1 and 100.
        System.out.println("Please enter a number between 1 and 100, inclusive:");
        //creating a variable to hold the users entry.
        userInput = keyboard.nextInt();
        //Assigning a value to myRandomNumber.
        myRandomNumber = random.nextInt(1,100);
        //Creating a while loop that will loop until the user guesses the correct number.
        while(userInput != myRandomNumber)
        {
            //Checking to see if the user input is lower than the random number.
            if(userInput < myRandomNumber)
            {
                //Notifing the user that the number generated is too low.
                System.out.println("Sorry, but, \'" + userInput + "\'' is too low! Please try again.");
                //Incrementing the number of guesses.
            }
            //Handling the case where the userInput is too high.
            else if(userInput > myRandomNumber)
            {
                //Notifying the user that the number generated is too high.
                System.out.println("Sorry, but, \'" + userInput + "\'' is too high! Please try again.");
            }
            //Handling the case where the userInput is correct.
            else if(userInput == myRandomNumber)
            {
                //Notifying the user that they guessed correctly!
                System.out.println("Congratulations, \'"+userInput+"\'' was the correct number!");
            }
            //Handling the case where the input does not match what is required.
            else
            {
                //Notifying the user that the input is not valid.
                System.out.println("Sorry, but, \'" + userInput+"\' was a wasted guess, please try again.");
            }   
            //Handling the case where the number entered was not correct.
            if(userInput != myRandomNumber)
            {
                //Asking the user to guess another number.
                System.out.println("Please guess new number:");
                //creating a variable to hold the users entry.
                userInput = keyboard.nextInt();
            }
        }    
    }
}
