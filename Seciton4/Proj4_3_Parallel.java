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
        //Creating a while loop.
        while (placeCounter < 5)
        {
            if(placeCounter < 5)
            {
                //Print a message out to the user.
                System.out.print("Please enter 5 individuals:\t");
                //Requesting user input.
                individualName = keyboard.nextLine();
                //Adding the individual to the list.
                //Incrementing place counter.
                placeCounter += 1;
            }
        }
    }
}
