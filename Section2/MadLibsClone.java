//Importing the scanner lib.
import java.util.Scanner;

//Creating the main class.
public class MadLibsClone {
    //Creating main method.
    public static void main(String[] args)
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Creating a variable.
        String girlname;
        String adjective1;
        String adjective2;
        String adjective3;
        String location;
        String boysname;
        String mansname;
        String clothing;
        String occupation;
        String occupation2;
        String hobby;
        /*
        Asking the user for the first adjective.
         */
        //Printing a question to the user.
        System.out.print("Please enter the name of a girl: ");
        //Grabbing a real number from the user.
        girlname = keyboard.nextLine();
        //Inserting another line.
        //Printing a question to the user.
        System.out.print("Please enter an adjective to describe the girl: ");
        //Obtaining user input.
        adjective1 = keyboard.nextLine();
        //Inserting a new line.
        //Printing a question to the user.
        System.out.print("Please enter another adjective describing her occupation: ");
        //Obtaining user input.
        adjective2 = keyboard.nextLine();
        //Inserting a new line.
        //Printing a question to the user.
        System.out.print("Please enter the girl's occupation: ");
        //Obtaining user input.
        occupation = keyboard.nextLine();
        //Inserting a new line.
        //Printing a question to the user.
        System.out.print("Please enter the name of the location the kingdom is in: ");
        //Obtaining user input.
        location = keyboard.nextLine();
        //Entering a new line.
        //Printing a question to the user.
        System.out.print("Please enter the type of clothing that she loved to wear: ");
        //Requesting input from the user.
        clothing = keyboard.nextLine();
        //Inserting a new line.
        //Printing a question to the user.
        System.out.print("Enter the girl's hobby: ");
        //Grabbing input from the user.
        hobby = keyboard.nextLine();
        //Adding a new line.
        //Printing a question to the user.
        System.out.print("Enter the adjective describing the job: ");
        //Grabbing user input.
        adjective3 = keyboard.nextLine();
        //Adding a new line.
        //Printing a question to the user.
        System.out.print("Please enter the boy's occupation: ");
        //Grabbing user input.
        occupation2 = keyboard.nextLine();
        //Adding a new line.
        //Printing a question to the user.
        System.out.print("Please enter the name of the boy: ");
        //Grabbing the name of the boy.
        boysname = keyboard.nextLine();
        //Entering a new line.
        //Printing a question to the user.
        System.out.print("Please enter the name of the girl's father: ");
        //Grabbing user input.
        mansname = keyboard.nextLine();
        //Entering a new line.
        //Telling a story.
        System.out.println("There once was a " + adjective1 + " girl named " + girlname + ", who was a " + adjective2 + " " + occupation + " in the kingdom of " + location);
        //Telling another paragraph of the story.
        System.out.println("She loved to wear " + clothing + " and to " + hobby + ". She wanted to marry the " + adjective3 + " " + occupation2 + " named " + boysname + " but her father, king " + mansname + " forbid her from seeing him.");
    }
}
