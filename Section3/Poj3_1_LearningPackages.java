import java.util.Scanner;
//Creating a public class.
public class Poj3_1_LearningPackages {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Adding a variable to accept user input.
        String userpackage;
        //Adding a package variable.
        String packageChosen;
        //Accepting input from the user.
        userpackage = keyboard.next();
 
        //Grabbing user input.
        userpackage = keyboard.next();

        //Displaying the available packages to the user.
        //Making a switch statement.
        switch (userpackage)
        {
            //Handling case 1.
            case 'Learning Package 1':
                //Printing a message regarding package details to the user.
                System.out.println("This package is $10/month and includes 2 courses per month.\nEach additional course is $6.");
                //Breaking from the statement.
                break;
            //Handling case 2.
            case 'Learning Package 2':
                //Printing a message regarding package details to the user.
                System.out.println("This package is $12/month and it includes 4 courses per month.\nEach additional course is $4.");
                //Breaking from the statement.
                break;
            //Handling case 3.
            case 'Learning Package 3':
                //Printing a message regarding package details to the user.
                System.out.println("This package is $15/month and it includes 6 courses per month.\nEach additional course is $3.")
        }
    }
    
}
