/*
    Matthew Ivezaj
    05/13/2022
    SumFun
 */


//Importing library.
import java.util.Scanner;
//Creating a public class.
public class SumFun {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a Scanner.
        Scanner keyboard = new Scanner(System.in);
        //Creating an int variable.
        int sumNum;
        int newSum;
        //Creating a counter.
        int placeCounter;
        //Giving newSum a value.
        newSum = 0;
        //Assigning a variable.
        placeCounter = 0;
        //Asking the user a question
        System.out.println("Please enter a positive number\n");
        //Telling the user to input a value to exit.
        System.out.println("or input a negative to exit:\t\t");
        //Grabbing the username from the user.
        sumNum = keyboard.nextInt();
        //Creating a while loop.
        while(sumNum >= 0)
        {
            //Adding the sum and inputted number together.
            newSum += sumNum;
            //Asking the user a question
            System.out.println("Please enter a number?\n");
            //Telling the user to input a value to exit.
            System.out.println("Please input a negative to exit:\t\t");
            //Grabbing the username from the user.
            sumNum = keyboard.nextInt();
        }
        //Printing the current value.
        System.out.println("The sum is " +newSum);
    }
}
