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
            //Requesting user input.
            individualName = keyboard.nextLine();
            //Checking to see if the name is 1 character or longer.
            if(individualName.length() > 5)
            {
                //Print a message out to the user.
                System.out.print("Please enter 5 individuals:\t");
                
                //Adding the individual to the list.
                //Incrementing place counter.
                placeCounter += 1;
            }
            //Handling the alternative case.
            else
            {

            }
        }
    }
}
