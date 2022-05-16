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
                //Asking the user how many course they would like to take.\
                numberOfCourses = 
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
