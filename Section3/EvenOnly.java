//Importing Scanner.
import java.util.Scanner;
//Creating a public class.
public class EvenOnly {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Creating an int.
        int myNum = 0;
        //Printing a message to the user.
        System.out.print("Please enter an even number: ");
        //Looping through and incrementing myNum by 1.
        while(myNum < 11)
        {
            //Handling the case where myNum is equal to 11.
            if(myNum == 11)
            {
                //Incrementing myNum by 1.
                myNum+=2;
                //breaking out of the loop.
                break;
            }


        }
    }
}
