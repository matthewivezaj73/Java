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
        //Assigning certain cells |.
        gameBoard[2][1] = "|";
        gameBoard[4][1] = "|";
        gameBoard[2][3] = "|";
        gameBoard[4][2] = "|";
        gameBoard[2][3] = "|";
        gameBoard[4][3] = "|";
        //Calling the setUpBoard method to set up the tic tac toe board.
        setUpBoard(gameBoard);
        //Printing out a message to the user telling them to choose whether they want X or O.
        System.out.print("Would you like to be X or O (Please enter a capital X or capital O):\t");
        //Calling the startGame method to initialize the game.
        startGame();

    }
    //Creating a method to create game board.
    public static void setUpBoard(String[][] gameBoard)
    {
        //Inserting a blank line.
        System.out.println();
        //Printing out the game board.
        System.out.println("   |   |   ");
        //Printing out the next piece of the game board.
        System.out.println("___________");
        //Printing out the next piece of the game board.
        System.out.println("   |   |   ");
        //Printing out the next piece of the game board.
        System.out.println("___________");
        //Printing the next piece of the game board.
        System.out.println("   |   |   ");
    }
    //Creating a method to start the game.
    public static int startGame()
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);
        //Adding a variable.
        int myVariable = 0;
        //Creating a while loop.
        while(myVariable != 1)
        {
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
        //Returning passed object.
        return 0;
    }
}

