/*
        Matthew Ivezaj
        5/26/2022
        SumOfElements
*/
//Importing two libraries.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//Creating a public class.
public class SumOfElements {
    //Creating a public method. 
    public static void main(String[] args)
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Creating an arraylist.
        ArrayList<Integer> myArrayList = new ArrayList<>();       
        //Creating my integer variables to hold user input.
        int myFirstParam;
        int mySecondParam;
        //Printing out instruction to the user.
        System.out.print("Please enter the first parameter of the array we are building:\t");
        //Accepting user input.
        myFirstParam = keyboard.nextInt();
        //Printing out instructions to the user.
        System.out.print("Please enter the second parameter of the array we are building:\t");
        //Accepting user input.
        mySecondParam = keyboard.nextInt();
        //Creating an array.
        int[][] my2DArray = new int[myFirstParam][mySecondParam]; 
    }
    //Creating a method called sumElements.
    public static void sumElements(int[][] my2DArray)
    {
        //Creating a random object.
        Random myRandomInt = new Random(); 
        //Creating a for loop.
        for(int num=0; num < my2DArray[num].length; num++)
        {
            //Adding each element in the array.
        }
    }
}
