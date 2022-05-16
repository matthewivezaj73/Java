//Importing Scanner from java.util.
import java.util.Scanner;
//Creating a public class.
public class Poj3_1_LearningPackages {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Adding a variable to accept user input.
        char userpackage;
        //Displaying choices to the user.
        //Grabbing user input.
        userpackage = keyboard.next().charAt(0);;

        //Creating a switch statement.
        switch (userpackage)
        {
            //Handling case 1.
            case '1':
                System.out.println("This package is $10/month and includes 2 courses per month.\nEach additional course is $6.");
                //Breaking from the statement.
                break;
            //Handling case 2.
            case '2':
                //Printing a message regarding package details to the user.
                System.out.println("This package is $12/month and it includes 4 courses per month.\nEach additional course is $4.");
                //Breaking from the statement.
                break;
            //Handling case 3.
            case '3':
                //Printing a message regarding package details to the user.
                System.out.println("This package is $15/month and it includes 6 courses per month.\nEach additional course is $3.");
                //Breaking from the statement.
                break;
            //Handling the default case.
            default:
                //Notifying the user what they entered is invalid.
                System.out.println("You have entered an invalid package.");
                //Does not require a break since it is the last option.
        }

    }
    
}
