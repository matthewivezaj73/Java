/*
        Matthew Ivezaj
        5/25/2022
        MethodsDemo
*/
//Creating a public class.
public class MethodsDemo {
    //Creating a main method.
    //Header of the method.
    public static void main(String[] args)
    {
        //Body of the method.
        //Passing a user defined method to main.
        printHello();
        //Passing a user defined method to main.
        printNumber(10);
        //Creating a variable.
        int result = giveMe10();
    }

    //Creating a new void, paramerless method.
    public static void printHello()
    {
        //Printing a message to the user.
        System.out.println("Hello there!");
    }

    //Creating a void, parameterized method.
    public static void printNumber(int a)
    {
        //Printing the number to the user.
        System.out.println("The number is " + a);
    }

    //Creating a value-returning, parameterless method.
    public static int giveMe10() 
    {
        //returning 10.
        return 10;
    }

    //Value returning parameterized method.
    public static int addThese(int num1, int num2)
    {
        //Returning num1 + num2.
        return num1 + num2;
    }
}
