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
    public static void main()
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Creating an icecream object.
        IceCream Sherbet = new IceCream();
        //Creating a flag.
        Boolean not_done = false;
        //Creating a while loop.
        while(not_done != true)
        {
            //Adding a topping to the icecream.
            String myTopping = Sherbet.addTopping("lemon");
            //Printing out the topping
            //Printing the details of the icecream.
            Sherbet.printToppings();
        }
    }
}
