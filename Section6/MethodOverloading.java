/**
 *      Matthew Ivezaj
 *      5/25/2022
 *      MethodOverloading
 */
public class MethodOverloading {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a variable and assigning a method to it.
        int result = getResult(5);
        //Printing the variable.
        System.out.println(result);
        //Overloading result.
        result = getResult(5, 6);
        //Printing out result.
        System.out.println(result);
        //Overloading result.
        result = getResult(5, "12");
        //Printing out result.
        System.out.println(result);
    }
    //Creating a new method.
    public static int getResult(int num)
    {
        //Returning number passed multiplied by two.
        return num * 2;
    }
    //Overloading the previous method.
    public static int getResult(int num1, int num2)
    {
        //Multiplying two numbers passed into the method and returning them.
        return num1 * num2;
    }
    //Overloading the method again.
    public static int getResult(int num1, String value)
    {
        //Returning the number multiplied by a string value.
        return num1 * Integer.parseInt(value);
    }
    //Overloading the method again.
    public static String getResult(String str1, String str2)
    {
        //Returning the two strings concatenated into one.
        return str1 + " " + str2;
    }
}
