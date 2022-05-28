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
        //Printing the array.
        System.out.println(myArrayList);
    }
    //Creating a method to print the list.
    public static void sumElements(ArrayList<Integer> myList)
    {
        //Creating an integer.
        int myNum = 0;
        //Creating standard for loop.
        for(int i = 0; i < myList.size(); i++)
        {
            //Adding each number up.
            myNum += myList.get(i);
        }
        //Returning the sum.
        return myNum;
    }
}
