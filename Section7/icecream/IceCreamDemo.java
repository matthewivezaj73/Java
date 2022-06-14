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
        String userContinue = "";
        //Asking the user if they would like to add a topping.
        System.out.println("Would you like to add a topping to your icecream?\nPlease enter Yes or No:\t");
        //Allowing the user to add a topping.
        userContinue = keyboard.nextLine();
        //If the user enters yes.
        if(userContinue.length() > 1)
        {

        }
    }
}
