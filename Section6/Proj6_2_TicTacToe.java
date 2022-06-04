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
        //Adding a variable.
        int placeCounter;
        //Adding a new scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Calling the startGame method to initialize the game.
        startGame();
        //Calling the setup board method to set up the board.
        setUpBoard(gameBoard);
        //Calling the print gameBoard method to print the game board.
        printGameBoard(gameBoard);
        //Calling the gamePlay method.
        gamePlay(gameBoard);
    }
    //Creating a method that allows the game to play.
    public static String gamePlay(String[][] gameBoard)
    {
        //Creating an int.
        int placeCounter = 0;
        //Creating a while loop.
        while(placeCounter < 100)
        {
            //Incrementing placeCounter.
            placeCounter = placeCounter + 1;
            //Creating a variable.
            String myLine = gameBoard[0][0] + gameBoard[0][2]+gameBoard[0][3];
            //Calling the makeAMovePlayerOne method.
            makeAMovePlayerOne(gameBoard);
            //Handling the case where all of the entries are in the same alignment.
            if(gameBoard[0][0].equals("X") && gameBoard[0][2].equals("X") && gameBoard[0][4].equals("X") || (gameBoard[0][0].equals("O") && gameBoard[0][2].equals("O") && gameBoard[0][4].equals("O")))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player One has won the game!");
                //Breaking out of the loop.
                break;
            }
            //Handling the case where all of the entries are in the same alignment.
            else if(gameBoard[0][0].equals("X") && gameBoard[2][0].equals("X") && gameBoard[4][0].equals("X") || (gameBoard[0][0].equals("O") && gameBoard[2][0].equals("O") && gameBoard[4][0].equals("O")))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player One has won the game!");
                //Breaking out of the loop.
                break;
            }
            //Handling the case where all of the entries are in the same alignment.
            else if(gameBoard[2][0].equals("X") && gameBoard[2][2].equals("X") && gameBoard[2][4].equals("X") || (gameBoard[2][0].equals("O") && gameBoard[2][2].equals("O") && gameBoard[2][4].equals("O")))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player One has won the game!");
                //Breaking out of the loop.
                break;
            }
            //Handling the case where all of the entries are in the same alignment.
            else if(gameBoard[0][0].equals("X") && gameBoard[2][2].equals("X") && gameBoard[4][4].equals("X") || (gameBoard[0][0].equals("O") && gameBoard[2][2].equals("O") && gameBoard[4][4].equals("O")))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player One has won the game!");
                //Breaking out of the loop.
                break;
            }
            //Handling the case where all of the entries are in the same alignment.
            else if(gameBoard[4][0].equals("X") && gameBoard[2][2].equals("X") && gameBoard[0][4].equals("X") || gameBoard[4][0].equals("O") && gameBoard[2][2].equals("O") && gameBoard[0][4].equals("O"))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player One won the game!");
                //Breaking out of the loop.
                break;
            }
            //Handling the case where all of the entries are in the same alignment.
            else if(gameBoard[4][0].equals("X") && gameBoard[4][2].equals("X") && gameBoard[4][4].equals("X") || gameBoard[4][0].equals("O") &&gameBoard[4][4].equals("O"))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player One has won the game!");
                //Breaking out of the loop.
                break;
            }
            //Printing the gameBoard.
            printGameBoard(gameBoard);
            //Calling the makeAMovePlayerTwo method.
            makeAMovePlayerTwo(gameBoard);
            //Handling the case where all of the entries are in the same alignment.
            if(gameBoard[0][0].equals("O") && gameBoard[0][2].equals("O") && gameBoard[0][4].equals("O"))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player Two has won the game!");
                //Breaking out of the loop.
                break;
            }
            //Handling the case where all of the entries are in the same alignment.
            else if(gameBoard[0][0].equals("O") && gameBoard[2][0].equals("O") && gameBoard[4][0].equals("O"))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player Two has won the game!");
                //Breaking out of the loop.
                break;
            }
            //Handling the case where all of the entries are in the same alignment.
            else if(gameBoard[2][0].equals("O") && gameBoard[2][2].equals("O") && gameBoard[2][4].equals("O"))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player Two has won the game!");
                //Breaking out of the loop.
                break;
            }
            //Handling the case where all of the entries are in the same alignment.
            else if(gameBoard[4][0].equals("O") && gameBoard[4][2].equals("O" ) && gameBoard[4][4].equals("O"))
            {
                //Printing out a message to the user saying that they won.
                
            }
            //Handling the case where all of the entries are in the same alignment.
            else if(gameBoard[4][0].equals("O") && gameBoard[2][2].equals("O") && gameBoard[0][4].equals("O"))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player Two has won the game!");
                //Breaking out of the loop.
                break;
            }
            //Handling the case where all of the entries are in the same alignment.
            else if(gameBoard[0][0].equals("O") && gameBoard[2][2].equals("O") && gameBoard[4][4].equals("O"))
            {
                //Printing out a message to the user saying that they won.
                System.out.println("Congratulations, Player Two has won the game!");
                //Breaking out of the loop.
                break;
            }
            //Printing the game board.
            printGameBoard(gameBoard);
        }        
        //Printing the match is over.
        return "The match is over.";
    }
    //Creating a method to allow the players to make their move.
    public static void makeAMovePlayerOne(String[][] gameBoard)
    {
        //Creating a variable.
        int columnInput;
        int rowInput;
        String playerOne;
        //Adding a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Adding some padding.
        System.out.println("\n");
        //Adding a message stating player one is up.
        System.out.println("It's player One's turn!");
        System.out.println("\n");
        System.out.println("\n");
        //Asking the user to add a column they would like to enter their counter in.
        System.out.println("Please enter a 0 to place your counter in the first column.\n"+
        "Please enter a 2 to place your counter in the second column\nPlease enter a 4 to place your counter in the third column");
        //Accepting user input for the column variable.
        columnInput = keyboard.nextInt();
        //Instructing the user to make a choice for which row they would like to enter their counter in.
        System.out.println("Please enter a 0 to place a counter in the first row.\n"+
        "Please enter a 2 to place a counter in the second row.\n" +"Please enter a 4 to place your counter in the third row" );
        //Accepting user input for the row variable.
        rowInput = keyboard.nextInt();
        //Accepting user input for the charInput.
        playerOne = "X";
        //Printing out the variable.
        System.out.println(playerOne+"\n");
        //Notifying the user that we are inserting their character of choice.
        System.out.println("We are now inserting an \'" + playerOne+"\' at position " + rowInput + ", " + columnInput+".");
        //Adding some padding.
        System.out.println("\n");
        //Adding the user's count to the gameboard. Row * Column
        gameBoard[rowInput][columnInput] = playerOne;
    }
    //Creating a method to allow the players to make their move.
    public static void makeAMovePlayerTwo(String[][] gameBoard)
    {
        //Creating a set of variables.
        int columnInput;
        int rowInput;
        String playerTwo;
        //Adding a scanner object.
        Scanner keyboard = new Scanner(System.in);
        //Adding some padding.
        System.out.println("\n");
        //Adding a message stating player 2 is up.
        System.out.println("It's player two's turn!");
        System.out.println("\n");
        System.out.println("\n");
        //Asking the user to add a column they would like to enter their counter in.
        System.out.println("Please enter a 0 to place your counter in the first column.\n"+
        "Please enter a 2 to place your counter in the second column\nPlease enter a 4 to place your counter in the third column");
        //Accepting user input for the column variable.
        columnInput = keyboard.nextInt();
        //Instructing the user to make a choice for which row they would like to enter their counter in.
        System.out.println("Please enter a 0 to place a counter in the first row.\n"+
        "Please enter a 2 to place a counter in the second row.\n" +"Please enter a 4 to place your counter in the third row" );
        //Accepting user input for the row variable.
        rowInput = keyboard.nextInt();
        //Accepting user input for the charInput.
        playerTwo = "O";
        //Printing out the variable that was just entered.
        System.out.print(playerTwo);
        //Notifying the user that we are inserting their character of choice.
        System.out.println("We are now inserting a \'" + playerTwo+"\' at position " + rowInput + ", " + columnInput+".");
        //Adding the user's count to the gameboard. Row * Column
        gameBoard[rowInput][columnInput] = playerTwo;
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
                System.out.print(myString);
            }
            //Adding some padding.
            System.out.println();
        }    
    }
    //Creating a method to create game board.
    public static void setUpBoard(String[][] gameBoard)
    {
        //Assigning * to all of the cells.
        gameBoard[0][0] = "*";
        gameBoard[0][2] = "*";
        gameBoard[0][4] = "*";
        gameBoard[2][0] = "*";
        gameBoard[2][2] = "*";
        gameBoard[2][4] = "*";
        gameBoard[4][0] = "*";
        gameBoard[4][2] = "*";
        gameBoard[4][4] = "*";
        //Assigning certain cells |.
        //Printing out the first vertical line.
        gameBoard[0][1] = "|";
        gameBoard[1][1] = "-";
        gameBoard[2][1] = "|";
        gameBoard[3][1] = "-";
        gameBoard[4][1] = "|";
        //Printing out the second vertical line.
        gameBoard[0][3] = "|";
        gameBoard[1][3] = "-";
        gameBoard[2][3] = "|";
        gameBoard[3][3] = "-";
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
                myVariable += 1;
            }
        }
    }
}