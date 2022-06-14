//Linking the files under the icecream folder.
package icecream;
/*
        Matthew Ivezaj
        6/12/2022
        IceCreamDemo.java
*/
//Importing libraries.
import java.util.Scanner;
//Creating a public class.
public class IceCreamDemo {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Defining a variable.
        String selectedTopping;
        //Creating an icecream object.
        IceCream Sherbet = new IceCream();
        //Creating a flag.
        int userContinue = 1;
        //Asking the user if they would like to add a topping.
        System.out.println("Would you like to add a topping to your icecream?\nPlease enter Yes or No:\t");
        //Allowing the user to add a topping.
        userContinue = keyboard.nextInt();
        //Creating a while loop.
        while(userContinue != 1)
        {
            //Asking the user what type of topping they would like to add.
            System.out.println("Please enter the topping you would like to add:\t");
            //Allowing the user to enter a topping.
            selectedTopping = keyboard.nextLine();
            //Adding a topping to the icecream.
            String myTopping = Sherbet.addTopping(selectedTopping);
            //Printing out the topping.
            System.out.println("The topping you selected is, " + myTopping);
            //Printing the details of the icecream.
            Sherbet.printToppings();
            //Asking the user if they would like to stop adding toppings.
            System.out.println("Would you like to add any other toppings?\nPlease enter yes or no (Y/N):\t");
            //Allowing the user to input a choice.
            Continue = keyboard.nextLine();
            //Checking if the user entered no.
            if(userContinue == "No")
            {
                //Notifying the user we are exiting the program.
                System.out.println("Now exiting the program.");
                //Breaking out of the loop.
                break;
            }
        }
    }
}
