/*
    Matthew Ivezaj
    May 18th, 2022
    moreArrayFun
*/
import java.util.Random;
//Creating a public class.
public class moreArrayFun {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Initialzing the array.
        int[] anArray = new int[10];
        //Creating a standard for loop.
        for(int num = 0; num < anArray.length; num++)
        {
            //Creating a new random object.
            Random random = new Random();
            //Creating an integer.
            int myRandomNumber;
            //Creating a random variable.
            myRandomNumber = random.nextInt(1,1000);

            //Assigning values to each element in the array.
            anArray[num] = myRandomNumber;
            //Printing out each element.
            System.out.println(myRandomNumber);

        }
        
        
    }
}
