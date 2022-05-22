/*
    Matthew Ivezaj
    05/21/2022
    Parallel
*/
//Importing libraries.
import java.util.Scanner;
import java.util.ArrayList;
//Creating a public class.
public class Proj4_3_Parallel {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Creating two arrays.
        ArrayList<String> IndividualNames = new ArrayList();
        ArrayList<Integer> IndividualAges = new ArrayList();
        //Creating variables.
        int placeCounter = 0;
        String individualName;
        int individualAge;
        //Print a message out to the user.
        System.out.print("Please enter 5 individuals names and ages:\t");
        //Creating a while loop.
        while (placeCounter < 5)
        {
            //Asing for the individual's name.
            System.out.print("What is the person's name:\t");
            //Requesting user input.
            individualName = keyboard.nextLine();
            //Asking for the individual's age.
            System.out.print("What is the person's age:\t");
            //Requesting user input.
            //Checking to see if the name is 1 character or longer.
            if(individualName.length() > 5)
            {
                //Printing a message to the user.
                System.out.println("Adding the individual now!");
                //Incrementing place counter.
                placeCounter += 1;
                
            }
            //Handling the alternative case.
            else
            {
                //Breaking out of the loop.
                break;
            }
        }
    }
}
