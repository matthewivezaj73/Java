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
        //Creating a variable to hold user number of courses.
        int courseNumber; 
        //Displaying choices to the user.
        System.out.println("Please enter \'1\' to select package 1."+
        "\nPlease enter \'2\' to select package 2.\nPlease enter \'3\'"+
        " to select package 3.\nPlease enter your choice here:\t\t");
        //Grabbing user input.
        userpackage = keyboard.next().charAt(0);

        //Creating a switch statement.
        switch (userpackage)
        {
            //Handling case 1.
            case '1':
                //Printing out a message regarding the package to the user.
                System.out.println("This package is $10/month.\nEach additional course is $6.");
                //Asking the user how many course they had taken this term.
                System.out.println("Please enter the number of extra courses would you like to take:\t");
                //Asking for user input.
                courseNumber = keyboard.nextInt();
                //Checking if the user asked for more than 0 courses.
                if(courseNumber > 0)
                {
                    //Printing a message to the user.
                    System.out.println("Your total is, " + (10 + (courseNumber * 6)) );
                }
                //Handling the alternative.
                else if(courseNumber == 0)
                {
                    System.out.println("Your total is, " + 10);
                }
                else
                {
                    System.out.println("Sorry, I did not get that.");
                }
                //Breaking from the statement.
                break;
            //Handling case 2.
            case '2':
                //Printing a message regarding package details to the user.
                System.out.println("This package is $12/month and it includes 4 courses per month.\nEach additional course is $4.");
                //Instructing the user to enter any more courses they would like to take.
                System.out.println("Please enter how many extra courses you would like to take:\t");
                //Asking the user to enter a number.
                courseNumber = keyboard.nextInt();
                //Creating an if, else if, else statement.
                if(courseNumber > 0)
                {
                    System.out.println("This package is");
                }
                //Handling the case where the user enters 0 for extra courses.
                else if(courseNumber == 0)
                {
                    System.out.println("Your total is, " + 10);
                }
                //Handling the case where the input was not understood.
                else
                {
                    System.out.println("Sorry, I did not get that.");
                }
                //Breaking from the statement.
                break;
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
