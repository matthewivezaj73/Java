/*
        Matthew Ivezaj
        5/26/2022
        CountDown
*/
//Creating a public class.
public class CountDown {
    //Creating main method.
    public static void main(String[] args)
    {
        //Calling countDownFrom.
        // countDownFrom(10);
        //Calling countUpTo.
        countUpTo(0,10);
    }
    //Creating another method.
    public static void countDownFrom(int num)
    {
        //Creating an if statement.
        if(num >= 0)
        {
            //Printing a message to the user.
            System.out.println(num);
            //Calling the same method we are in.
            countDownFrom(num - 1);
        }
    }
    //Creating a method called countUpTo.
    public static void countUpTo(int num1, int num2)
    {
        //Creating an if statement.
        if(num2 >= num1)
        {
            //Printing a message to the user.
            System.out.println(num1);
            //Incrementing num1 by 1.
            num1 = num1+1;
            //Calling the same method we are in.
            countUpTo(num1, num2);
        }
    }
}
