/*
        Matthew Ivezaj
        5/26/2022
        MethodCalls
*/
//Creating public class.
public class MethodCalls {
    //Creating the main method.
    public static void main(String[] args)
    {
        //Calling doSomething.
        doSomething();
    }

    //Creating a method called doSomething.
    public static void doSomething()
    {
        //Printing a message to the user.
        System.out.println("In doSomething!");

        //Creating a result variable.
        int result = getSomeValue();
        //Printing a message to the user.
        System.out.println("result: " + result);
    }

    //Creating another method.
    public static int getSomeValue()
    {
        //Returning an integer.
        return 150;
    }
}
