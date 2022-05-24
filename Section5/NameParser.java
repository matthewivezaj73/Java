//Importing a library.
import java.util.Scanner;
//Creating a java class.
public class NameParser {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Instructing the user to enter their name.
        System.out.print("Please enter your name:\t");
        //Grabbing input from the user.
        String fullname = keyboard.nextLine();
        //Taking the index of the space.
        int space_in_name = fullname.indexOf(" ") + 1; 
        //Creating the last name programmtically.
        String lastName = fullname.substring(space_in_name);
        //Creating an all lowercase version of the last name.
        String last = lastName.toLowerCase(); 
        //Printing the variable last.
        System.out.println(last);
        //End of first name.
        int endOfFirst = space_in_name - 2;
        //Creating a variable to hold the first name.
        String firstname = fullname.substring(0, (space_in_name - 1));
        //Making the firstname all uppercase.
        String first = firstname.toUpperCase();
        //Printing out the first name.
        System.out.println(firstname);
        //NEED TO FIND OUT WHY I HAVE THE ERROR BELOW.


 




        
        // String lastNameIndex = fullname.substring();
        //Taking the substring of the full name.
    }
}
