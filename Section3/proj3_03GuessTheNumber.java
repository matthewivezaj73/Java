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
        //Creating a new random object.
        Random random = new Random();
        //Creating an integer.
        int myRandomNumber;
        //Assigning a value to myRandomNumber.
        myRandomNumber = random.nextInt(1,100);

        System.out.println(myRandomNumber);
    }
}
