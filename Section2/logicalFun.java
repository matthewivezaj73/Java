//Creating the class.
public class logicalFun {
    //Creating the main method.
    public static void main(String[] args)
    {
        //Defining two variables of type bool.
        boolean isRaining = false;
        boolean isWarm = false;
        //Combining the two bool variables.
        boolean combined = isRaining && isWarm;
        //Printing a message.
        System.out.println("Is it raining and worm? " + combined);
        //Reusing the variable.
        combined = isRaining || isWarm;
        //Printing out a message to determine if it is raining or not.
        System.out.println("Is it raining or warm? " + combined);
        //Overloading the previous value that was in combined.
        combined = !isRaining;
        //Printing a new message.
        System.out.println("Is it not raining outside? " + combined);
        //Reusing the variable.
        combined = !isWarm;
        //Printing out a message to determine if it is not warm.
        System.out.println("Is it not warm outside? " + combined);
        //Reusing the variable.
        combined = !isWarm && !isRaining;
        //Printing out a message to determine if it is not raining and it is not warm.
        System.out.print("Is it raining or is it warm outside? " + combined);
        //Reusing the variable.
        combined = !isWarm || !isRaining;
        //Printing out a message to determine if it is either not raining or not warm.
        System.out.println("It is either not raining or not warm outside: " + combined);
    }
}
