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
        //Creating a 3 x 3 array.
        String[][] gameBoard = new String[5][5];
        //Calling the startGame method to initialize the game.
        startGame();
        //Calling the setup board method to set up the board.
        setUpBoard(gameBoard);
        //Calling the print gameBoard method to print the game board.
        printGameBoard(gameBoard);
        //Calling the startGame method to initialize the game.
        

    }
    //Creating a method to print the game board.
    public static void printGameBoard(String[][] Board)
    {
        //Creating an enhanced for loop.
        for(String[] arr : Board)
        {
            //Creating a for loop to access the numbers.
            for(String myString : arr)
            {
                //Printing out the numbers to the user.
                System.out.print(myString+ " ");
            }
            //Adding some padding.
            System.out.println();
        }    }
    //Creating a method to create game board.
    public static void setUpBoard(String[][] gameBoard)
    {
        //Assigning certain cells |.
        gameBoard[2][1] = "|";
        gameBoard[4][1] = "|";
        gameBoard[2][3] = "|";
        //Adding underscores.


        System.out.println(gameBoard);
    }
    //Creating a method to start the game.
    public static void startGame()
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Adding a variable.
        int myVariable = 0;
        //Creating a while loop.
        while(myVariable != 1)
        {
            //Asking the user to enter x or o.
            System.out.print("Please enter X or O:\t");
            //Creating a variable to hold user input.
            char userInput1 = keyboard.next().charAt(0);
            //Checking if the user entered an X or an O.
            if(userInput1 == 'X')
            {
                //Printing a message to the user.
                System.out.println("You are going first!");
                //Incrementing the variable.
                myVariable += 1;
            }
            //Handling the case where the user selects O.
            else if(userInput1 == 'O')
            {
                //Printing a message to the user.
                System.out.println("You are going second!");
                //Incrementing the variable.
                myVariable += 2;
            }
            //Handling the case where the user enters something else.
            else
            {
                //Printing out a message to the user instructing them to try entering an X or an O.
                System.out.print("Please enter an X or an O:\t");
            }
        }
    }
}

