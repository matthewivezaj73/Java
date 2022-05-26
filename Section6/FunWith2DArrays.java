/*
        Matthew Ivezaj
        5/26/2022
        FunWith2DArrays
*/
//Importing a library.
import java.util.Random;
//Creating a public class.
public class FunWith2DArrays {
    //Creating the main method.
    public static void main(String[] args)
    {
        //2 row x 3 column.
    }
    //Creating a new method. 
    public static void fill2DArray(int[][] twoDArr)
    {
        //Creating a random number generator.
        Random rand = new Random();
        //Creating a regular for loop.
        for(int i = 0; i < twoDArr.length; i++)
        {
            //Creating a new enhanced for loop.
            for(int j = 0; j < twoDArr[i].length; j++)
            {
                //Randomize 0 through 99 (inclusive)
                //row i, column j.
                twoDArr[i][i] = rand.nextInt(100);
            }
        }
    }
    //Creating a new method.
    public static void print2DArray(int[][] twoDArr)
    {
        //Creating an enhanced for loop.
        for(int[] arr : twoDArr)
        {
            //Creating a for loop to access the numbers.
            for(int num : arr)
            {
                //Printing out the numbers to the user.
                System.out.print(num+ " ");
            }
            //Adding some padding.
            System.out.println();
        }
    }
}
