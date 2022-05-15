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
        diceSimulator = dice.nextInt(6) + 1;
        //Creating a for loop.
        for(int i = 0; i < 11; i++)
        {
            //Printing the valuediceSimulator of the die.
            System.out.println(i);
            //Incrementing i.
            i++;
        }
        
    }
}
