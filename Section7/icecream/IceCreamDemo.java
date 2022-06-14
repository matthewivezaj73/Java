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
        //Creating an int.
        int userContinue = 0;
        //While the user enters yes.
        while(userContinue != 1)
        {
            //Asking the user what type of topping they would like to add.
            System.out.println("Please enter the topping you would like to add:\t");
            //Allowing the user to enter a topping.
            keyboard.nextLine();
            //Adding a topping to the icecream.
            String myTopping = Sherbet.addTopping(selectedTopping);
            //Printing out the topping.
            System.out.println("The topping you selected is, " + myTopping);
            //Printing the details of the icecream.
            Sherbet.printToppings();
            //Asking the user if they would like to stop adding toppings.
            System.out.println("Would you like to add any other toppings?\nPlease enter yes or no (0 for yes and 1 for no):\t");
            //Allowing the user to input a choice.
            userContinue = keyboard.nextInt();
        }
    }
}
