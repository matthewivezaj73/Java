//Importing library.
import java.util.Random;
//Creating a public class.
public class DiceSimulation {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a new random object.
        Random dice = new Random();
        //Creating a for loop.
        for(int i = 0; i < 10; i++)
        {
            //Grabbing the next integer.
            int my_dice = dice.nextInt(6);
            //Printing the value of the dice.
            System.out.println(my_dice);
        }
    }
}
