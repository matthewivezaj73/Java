//Importing library.
import java.util.Random;
//Creating a public class.
public class DiceSimulation {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a new dice object.
        Random dice = new Random();
        //Creating a variable.
        int diceSimulator; 
        //Assigning a value to myRandomNumber.
        diceSimulator = dice.nextInt(1);
        //Creating a for loop.
        for(int i = 0; i < 7; i++)
        {
            //Printing the value of the dice.
            System.out.println(diceSimulator);
            //Incrementing i.
            i++;
        }
      
        
    }
}
