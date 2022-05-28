/*
        Matthew Ivezaj
        5/26/2022
        SumOfElements
*/
//Importing two libraries.
import java.util.ArrayList;
import java.util.Random;
//Creating a public class.
public class SumOfElements {
    //Creating a public method. 
    public static void main(String[] args)
    {
        //Creating my integer variables to hold user input.
        int myFirstParam;
        //Creating an array.
        ArrayList<Integer> myArrayList = new ArrayList<>();
        //Adding numbers to the arraylist.
        myArrayList.add(10);
        //Adding a number to the arraylist.
        myArrayList.add(22);
        //Adding a number to the arraylist.
        myArrayList.add(12);
    }
    //Creating a method to print the list.
    public static void printArray(int[][] myArrayList)
    {
        //Creating enhanced for loop.
        for(int[] arr : myArrayList)
        {
            //Creating an embedded enhanced for loop.
            for(int i : arr)
            {
                //Printing out the number in the list.
                System.out.println(i);
            }
        }
    }
}
