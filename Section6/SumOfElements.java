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
        //Creating an array.
        int[][] my2DArray = new int[10][10]; 
    }
    //Creating a method called sumElements.
    public static void sumElements(int[][] my2DArray)
    {
        //Creating a random object.
        Random myRandomInt = new Random(); 
    }
}
