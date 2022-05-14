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
        //Looping through and incrementing myNum by 1.
        while(myNum < 10)
        {
            //Handling the case where myNum is equal to 0.
            if(myNum%2 != 0)
            {
                //Incrementing myNum.
                myNum++;
                //Continuing the loop.
                continue;
            }
            //Printing out the number.
            System.out.println(myNum);
            //Incrementing myNum.
            myNum++;
        }
    }
}

