/*
    Matthew Ivezaj
    Learning Java
    Working with operators
    May 10, 2022
*
*/



//A public class.
public class ArithmeticFun {
    //Creating the main method.
    public static void main(String[] args)
    {
        //Creating variables of type int.
        int a = 10;
        int b = 15;
        //THESE ARE BINARY OPERATORS.
        //Creating a variable to represent the sum.
        int result = a + b;
        //Creating a variable to represent the difference.
        int difference = a - b;
        //Creating a variable to represent the product.
        int product = a * b;
        //Creating a variable to represent the quotient.
        int quotient = b / a;
        //Creating a variable to represent the modulus.
        int remainder = b % a;
        //Printing out the difference.
        System.out.println("The difference is " + difference);
        //Printing out the product.
        System.out.println("The product is " + product);
        //Printing out the quotient.
        System.out.println("The quotient is " + quotient);
        //Printing out the remainder.
        System.out.println("The remainder is " + remainder);
        //Printing out the result.
        System.out.println("The result of the sum is: " + result);
        //Taking the result and adding 20.
        result += 20;
        //Printing out the new result.
        System.out.println("The result is now " + result);
        //Adding one on to the result.
        result++;

        //Displaying the result.
        System.out.println("result++ " + result);
        //Adding one on to the result.
        result--;
        //THESE ARE UNARY OPERATORS.
        //Displaying the result.
        System.out.println("result-- " + result);
        //Printing out the types of arithmetic operators in Java.
        System.out.println("The types of arithmetic operators in Java are -, +, /, *, and %.");
        //Printing out the types of compound operators in Java.
        System.out.println("The compound arithmetic operators in Java are +=, -=, *=, /=, and %=.");
        //MULTIPLYING PRODUCT BY TWO.
        product *= 2;
        //Printing out the value of the product.
        System.out.println(product);
    }
}
