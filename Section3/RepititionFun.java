//Importing library.
import java.util.Scanner;
//Creating a class.
public class RepititionFun {
    //Creating the main method.
    public static void main(String[] args)
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Creating a variable.
        int input;

        //Priming read.
        System.out.println("Enter a non-negative integer.");
        System.out.println("Or negative to exit:\t");
        //Allowing the user to input something.
        input = keyboard.nextInt();

        //Testing for the input.
        while(input >= 0)
        {
            //Printing out the current input value.
            System.out.println(input);
            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative to exit:\t");
            //Accepting user input.
            input = keyboard.nextInt();

        }
        //Notifying the user that we are done.
        System.out.println("Done!");
        //Creating variables.
//        int count = 15;

        //Creating a while loop. A while loop is a pre-test loop. Selection code acts like a gate-keeper.
//        while(count < 10)
//        {
//            //Printing out each number.
//            System.out.println(count);
//            //Incrementing the variable.
//            count++;
//        }
        //Creating a variable.
//        int count2 = 15;
//        //Creating a while loop that will run after the body is executed.
//        do
//        {
//            //Printing out each number.
//            System.out.println(count2);
//            //Incrementing the variable.
//            count2++;
//        }
//        while(count2 < 10);
        //Creating a for loop to iterate over the values.
        /*
            For loops work best with control variables, or counters (i++).
         */
//        for(int i = 0; i < 10; i++)
//        {
//            //Printing out our value.
//            System.out.println(i);
//        }

    }
}
