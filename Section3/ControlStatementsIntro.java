//Creating a public call.
public class ControlStatementsIntro {
    /*There are three types of control statements.
        - Sequential (default)
        - Selection
        - Repetition
    */
    //Creating a main method.
    public static void main(String[] args) {
        //Creating variables.
        int age = 19;
        //Starting out if statement
        if(age >= 16)
        {
            //Printing out a message.
            System.out.println("You can get your license.");
        }
        //Starting our else statement.
        else
        {
            //Printing out a message.
            System.out.println("You cannot drive yet.");
        }

        //Adding a new line.
        System.out.println("");
        //Creating a for loop.
        for(int i = 1; i <= age; i++)
        {
            System.out.println("Happy birthday " + i);
        }//end for
    } //end main
}
