//Importing package.
import java.util.Scanner;
//Importing library.
import java.util.ArrayList;
//Creating a public class.
public class Proj4_2_ArrayLists {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Creating an arraylist.
        ArrayList<Double> myList = new ArrayList();
        //Creating a variable.
        double userInput;
        int countInteger = 0;
        //Adding a primitive read.
        System.out.print("Pleaser enter a non-negative Integer.");
        System.out.print("Or negative to exit.\n\n");
        //Adding a while loop.
        while(countInteger < 5)
        {
            //Telling the user to enter a number greater that 0.
            System.out.print("Please enter a positive number (note that entering a negative exits the program):\t");
            //Requesting user input.
            userInput = keyboard.nextDouble();
            //Creating an if else statement.
            if(userInput > 0)
            {
                //Adding the input to the array.
                myList.add(userInput);
                //Notifying the user that the input has been hadded to the array list.
                System.out.println("Added!");
                //Incrementing countInteger.
                countInteger += 1;
            }
            //Handling the case where userInput < 0 is in the entry.
            else if(userInput < 0)
            {
                //Notifying the user that they are now exiting the program.
                System.out.print("Now exiting the program...");
                //Breaking out of the program.
                break;
            }
        }
        //Printing the list in reverse.
        for(int myInt = myList.size() - 1; myInt >= 0; myInt--)
        {
            //Printing out each value.
            System.out.println(myList.get(myInt));
        }
    }
}
