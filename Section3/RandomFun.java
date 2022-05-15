/*
    Matthew Ivezaj
    May 14, 2022
    RandomFun
*/
//Importing library.
import java.util.Random;
//Creating a public Java class called RandomFun.
public class RandomFun {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a new random object.
        Random random = new Random();
        //Creating an integer.
        int myRandomNumber;
        //Assigning a value to myRandomNumber.
        myRandomNumber = random.nextInt();
        //Printing out a message to the user.
        System.out.println("The random number is:\t" + myRandomNumber);
        //Grabbing a random number.
        myRandomNumber = random.nextInt(1000);
    }
}
