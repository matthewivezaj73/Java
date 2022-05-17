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
        
        //creating a variable to hold the users entry.
        userInput = keyboard.nextInt();
        //Assigning a value to myRandomNumber.
        myRandomNumber = random.nextInt(1,100);

        System.out.println(myRandomNumber);
    }
}
