/**
 *      Matthew Ivezaj
 *      5/20/2022
 *      Proj4_1_Arrays.java
 */
//Importing the arraylist package.
import java.util.ArrayList;
//Importing scanner.
import java.util.Scanner;
//Creating public class.
public class proj4_1_arrays
{
    //Creating main method.
    public static void main(String[] args)
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Creating an arraylist.
        ArrayList<Integer> myList = new ArrayList();
        //Created a variable to store user input.
        int userInput;
        //Telling the user to enter 5 integers.
        System.out.println("Please enter 5 integers: ");
        //Creating an enhanced for loop.
        for(int i: myList)
        {
            userInput = keyboard.nextInt();
        }
        //Asking the user for an integers.
        System.out.println("Please enter a number:\t");
        //Asking the user to enter a number.
        userInput1 = keyboard.nextInt();
    }
}