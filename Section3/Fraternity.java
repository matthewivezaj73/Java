//Importing library.
import java.util.Scanner;
//Creating a Java class.
public class Fraternity {
    //Creating a main method.
    static public void main(String[] args)
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Creating variables.
        char gender;
        int age;
        //Printing a question to the user.
        System.out.println("Are you male or female (Enter m for male and f for female): ");
        //Accepting user input. Need to add .charAt(0), otherwise it will not work.
        gender = keyboard.next().charAt(0);

        //Printing a question to the user.
        System.out.println("How old are you: ");
        //Accepting user input.
        age = keyboard.nextInt();

        //Using if/else to determine if the user is eligible.
        if((gender == 'm' || gender == 'M') && age >= 19)
        {
            //Printing a message out to the user.
            System.out.println("You are old enough to join the fraternity, welcome!");
        }
        //Handling the alternative case
        else {
            //Printing our a message to the user.
            System.out.println("Sorry, but you are not eligible to join the fraternity group");
        }

    }
}
