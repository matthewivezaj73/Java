/*
        Matthew Ivezaj
        5/28/2022
        Tic-Tac-Toe
*/
//Importing the scanner.
import java.util.Scanner;
//Creating a tictactoe class.
public class Proj6_2_TicTacToe {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Printing out a message to the user telling them to choose whether they want X or O.
        System.out.println("Would you like to be X or O:\t");
        //Creating a variable to hold user input.
        String userInput1 = keyboard.nextLine();
        //Checking if the user entered an X or an O.
        if(userInput1 == "X")
        {
            //Printing a message to the user.
            System.out.println("You are going first!");
        }
        //Handling the case where the user selects O.
        else
        {

        }
    }
}
