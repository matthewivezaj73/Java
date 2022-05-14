//Importing the scanner lib.
import java.util.Scanner;
//Creating the public class.
public class SelectionFun {
    //Creating our main method.
    public static void main(String[] args)
    {

        //Creating variables.
        int age;
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Printing out a message.
        System.out.println("Welcome to the Pub and Grille");
        //Asking the user a question.
        System.out.println("Please enter your age: ");
        //Grabbing input from the user.
        age = keyboard.nextInt();
        //Checking if the user is 21 years old or older.
        if(age >= 21)
        {
            System.out.println("Here, have a beer.");
        }
        else if(age >= 16) {
            System.out.println("Here, have a coke!");
            System.out.println("At least you can drive!");
        }
        //Handling the case where the user is less than 21.
        else
        {
            System.out.println("Here, have a Coke!");
        }

        //Printing a response to the user.
        System.out.println("Thanks for coming to the Pub and Grille!");
    }
}
