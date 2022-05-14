//Creating the public class.
public class ContinueBreak {
    //Creating the main method.
    public static void main(String[] args)
    {
        //Setting the variable.
        int count = 0;
        //Entering a while loop.
        while(count < 10)
        {
            //Checking to see if the count variable is equal to the value 5.
            if(count == 5)
            {
                //Incrementing count.
                count++;
                //If it is, break.
                break;
            }
            //Printing out the count and adding a tab.
            System.out.print(count + "\t");
            //Incrementing count.
            count++;
        }
    }
}
