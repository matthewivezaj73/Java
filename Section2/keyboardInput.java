/*
    Matthew Ivezaj
    5/11/2022
    Keyboard input file
 */
//Importing a package.
import java.util.Scanner;
/*
You can also put java.util.scanner on line 17 instead of importing.
 */
//Main class.
public class keyboardInput {
    //Creating our main method.
    public static void main(String[] args)
    {
        //Creating a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Creating strings.
        String name;
        String city;
        //Creating an integer.
        int age;
        //Creating a float value.
        float realNumber;
        //Printing out a message to the user asking them for their name.
        System.out.println("What is your name?");
        //Creating a keyboard object.
        name = keyboard.nextLine();
        //Printing a question to the user.
        System.out.println("What is your age?");
        //Grabbing the age from the user.
        age = keyboard.nextInt();
        //Inserting another line.
        keyboard.nextLine();
        /*
            Need to insert another one because if it is
            not there, Java skips over the next question.
         */
        //Printing a question to the user.
        System.out.println("Please enter a real number");
        //Grabbing a real number from the user.
        realNumber = keyboard.nextFloat();

        //Inserting another line.
        keyboard.nextLine();
        //Asking the user for the name of their city.
        System.out.println("What is the name of your city?");
        //Grabbing the city from the user.
        city = keyboard.nextLine();

        //Printing a message to the user.
        System.out.println("Hello, " + name);
        //Printing out the age of the user.
        System.out.println("your age is " + age);
        //Printing the real number.
        System.out.println("The value of the real number is " + realNumber);
        //Printing a question to the user.
        System.out.println("Your city is " + city);

    }
}
