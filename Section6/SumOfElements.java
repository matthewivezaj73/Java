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
        //Creating my integer variables to hold user input.
        int myFirstParam;
        //Creating an array.
        int[][] my2DArray = new int[5][10]; 
    }
    //Creating a method called sumElements.
    public static void sumElements(int[][] my2DArray)
    {
        //Creating a random object.
        Random myRandomInt = new Random(); 
        //Creating a for loop.
        for(int j = 0; j < my2DArray.length; j++)
        {
            //Creating an embedded for loop to access each element.
            for(int i = 0; i < my2DArray[j].length; i++)
            {
                //Randomize 0 to infinite.
                my2DArray[i][j] = myRandomInt.nextInt();
                //Checking if i >= 1.
                if(i >= 1)
                {
                    //Adding the elements together.
                }
            }
        }
    }
}
