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
        //Calling the makeAMove method, so that the user will make a choice.
        makeAMove();
    }
    //Creating a method to allow the players to make their move.
    public static void makeAMove()
    {
        //Creating a variable.
        int userInput;
        //Adding a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Asking the user to add a column they would like to enter their counter in.
        System.out.println("Please enter a digit from 0 to place your counter in the first column.\n"+
        "Please enter a digit from 2 to place your counter in the second column\nPlease enter a digit from 4 to place your counter in the 3rd column");
        //Accepting user input.
        userInput = keyboard.nextInt();
        //Checking if the user entered if the user entered a 0, 2, or 4.
        if(userInput == 0)
        {
            //Printing out a message to the user.
            System.out.println("Good choice!");
        }
        //Handling the case where the user enters 2.
        else if(userInput == 2)
        {
            //Printing out a message to the user.
            System.out.println("Good choice!");
        }
        //Handling the case where the user enters a 4.
        else if(userInput == 4)
        {
            //Printing out a message to the user.
            System.out.println("Good choice!");
        }
        //Handling the case where the user enters anything else.
        else
        {
            //Printing out a message to the user.
            System.out.println("Sorry, but \'" + userInput+"\' is not a valid selection, please try again!");
        }
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
        }    
    }
    //Creating a method to create game board.
    public static void setUpBoard(String[][] gameBoard)
    {
        //Assigning certain cells |.
        //Printing out the first vertical line.
        gameBoard[0][1] = "|";
        gameBoard[2][1] = "|";
        gameBoard[4][1] = "|";
        //Printing out the second vertical line.
        gameBoard[0][3] = "|";
        gameBoard[2][3] = "|";
        gameBoard[4][3] = "|";
        //Adding underscores.
        //Printing out the first horizontal line.
        gameBoard[1][0] = "_";
        gameBoard[1][1] = "_";
        gameBoard[1][2] = "_";
        gameBoard[1][3] = "_";
        gameBoard[1][4] = "_";
        //Printing out the second horizontal line.
        gameBoard[3][0] = "_";
        gameBoard[3][1] = "_";
        gameBoard[3][2] = "_";
        gameBoard[3][3] = "_";
        gameBoard[3][4] = "_";
        //Adding some padding.
        System.out.println("\n");
        System.out.println();
        System.out.println();
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
            System.out.println("Please enter X or O:\t");
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
        }
    }
}

