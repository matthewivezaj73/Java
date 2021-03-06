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
        ArrayList<String> Individuals = new ArrayList();
        //Creating variables.
        int placeCounter = 0;
        String individualName;
        int individualAge;
        //Print a message out to the user.
        System.out.print("Please enter 5 individual's names and ages.\n");
        //Creating a while loop.
        while(placeCounter < 5)
        {
            //Asing for the individual's name.
            System.out.print("What is the person's name:\t");
            //Requesting user input.
            individualName = keyboard.next();
            //Adding the individual's name to the list.
            IndividualNames.add(individualName);
            //Asking for the individual's age.
            System.out.print("What is the person's age:\t");
            //Requesting user input.
            individualAge = keyboard.nextInt();
            //Adding the individual's age to the list.
            IndividualAges.add(individualAge);
            //Creating a formatted string.
            String individual_Info = individualName + " is " + individualAge+" years old.\n";
            //Appending the formed string to a list.
            Individuals.add(individual_Info);
            //Incrementing place counter.
            placeCounter += 1;
        }
        //Creating an enhanced for loop and printing each individuals info.
        for(String i: Individuals)
        {
            //Printing out each value in the list.
            System.out.print(i);
        }
    }
}
