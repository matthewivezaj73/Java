/**
 *      Matthew Ivezaj
 *      05/24/2022
 *      Name Permutations Project
 */
//Importing libraries.
import java.util.Scanner;
import java.util.ArrayList;
//Creating a public class.
public class Proj5_1_NamePermutations {
    //Creating the main method.
    public static void main(String[] args)
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Creating a list to hold first names.
        ArrayList<String> firstNames = new ArrayList<>();
        //Creating a list to hold last names.
        ArrayList<String> lastNames = new ArrayList<>();
        //Creating a place counter.
        int placeCounter = 0;
        //Creating a while loop.
        while(placeCounter < 6)
        {
            
        }
        //Printing a message out to the user.
        System.out.print("Please enter your name: ");
        //Accepting input from the user.
        String name = keyboard.nextLine();
        //Finding the space in the name.
        int findSpace = name.indexOf(" ");
        //Creating a new index for the last name.
        int lastSpace = findSpace+1;
        //Creating a new index to grab the last name.
        String last = name.substring(lastSpace);
        //Creating a new substring to grab the first name.
        String first = name.substring(0,findSpace);
        //Placing the first name into it's own list.
        firstNames.add(first);
        //Placing the last name into it's own list.
        lastNames.add(last);
    }
}
