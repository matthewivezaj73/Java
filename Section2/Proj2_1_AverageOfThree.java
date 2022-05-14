//Importing a package.
import java.util.Scanner;
//Creating a class.
public class Proj2_1_AverageOfThree {
    //Creating the main method.
    public static void main(String[] args)
    {
        //Creating a float value.
        double realNumber1;
        double realNumber2;
        double realNumber3;
        double realAverage;
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Printing a question to the user.
        System.out.println("Please enter a real number");
        //Grabbing a real number from the user.
        realNumber1 = keyboard.nextDouble();
        //Inserting another line.
        keyboard.nextLine();
        //Printing a question to the user.
        System.out.println("Please enter another real number");
        //Grabbing a real number from the user.
        realNumber2 = keyboard.nextDouble();
        //Inserting another line.
        keyboard.nextLine();
        //Printing a question to the user.
        System.out.println("Please enter another real number");
        //Grabbing a real number from the user.
        realNumber3 = keyboard.nextDouble();
        //Inserting another line.
        keyboard.nextLine();
        //Creating a variable that will act as the average of the numbers.
        realAverage = (realNumber1 + realNumber2 + realNumber3)/3;
        //Printing out the numbers to display to the user.
        System.out.println("The first real number is " + realNumber1);
        //Printing out the numbers to display to the user.
        System.out.println("the second real number is " + realNumber2);
        //Printing out the numbers to display to the user.
        System.out.println("The third real number is " + realNumber3);
        //Printing out the average to the user.
        System.out.println("The average of the real numbers you entered is " + realAverage);
    }
}
