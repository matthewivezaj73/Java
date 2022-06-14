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
        //Asking the user what type of topping they would like to add.
        System.out.println("Please enter the topping you would like to add:\t");
        //Allowing the user to enter a topping.
        
        //Adding a topping to the icecream.
        Sherbet.addTopping(keyboard.nextLine());
        //Printing out the topping.
        System.out.println();
        //Printing the details of the icecream.
        Sherbet.printToppings();
    }
}
