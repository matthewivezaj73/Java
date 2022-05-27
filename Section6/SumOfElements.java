//Importing two libraries.
import java.util.ArrayList;
import java.util.Random;
/*
        Matthew Ivezaj
        5/26/2022
        SumOfElements
*/
//Creating a public class.
public class SumOfElements {
    //Creating a public method. 
    public static void main(String[] args)
    {
        //Creating an arraylist.
        ArrayList<Integer> myArrayList = new ArrayList<>();
        //Creating a random object.
        Random myRandomInt = new Random();
        //Creating a for loop to insert random numbers in the list.
    }   
    //Creating a public method.
    public static void sumElements(int[][] myArrayList)
    {
        //Creating a regular for loop.
        for(int element = 0; element < myArrayList.length; element++)
        {
            //Using another for loop to access the elements.
            for(int num = 0; num < myArrayList.length; num++)
            {
                //Adding the elements together.
                myArrayList[element][num] = myRandomInt.nextInt(100);
            }
        }
    }
}
