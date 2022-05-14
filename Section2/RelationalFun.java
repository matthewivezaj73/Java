//Creating a class.

//Relationship operators
/*
>
>=
<
<=
==
!=
 */

public class RelationalFun {
    //Creating a main method
    public static void main(String[] args)
    {
        //Creating a variable of type bool.
        boolean myBool = true;
        boolean yourBool = false;
        //Creating variables of type int.
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        int currentAge = 27;
        //Printing out some statements.
        System.out.println("mybool is " + myBool);
        System.out.println("yourBool is " + yourBool);
        //Creating names.
        String myName = "John";
        String yourName = "John";
        //Relational operations.
        boolean ageComparison = myAge > yourAge;
        //Printing ageComparison.
        System.out.println("myAge > yourAge? " + ageComparison);
        //Overwriting the previous value on ageComparison with a new one.
        ageComparison = yourAge > bobsAge;
        //Printing a message.
        System.out.println("yourAge > bobsAge? " + ageComparison);
        //Comparing the ages.
        ageComparison = yourAge == bobsAge;
        //Printing the comparison.
        System.out.println("yourAge == bobsAge? " + ageComparison);
        //Comparing my age to 21.
        ageComparison = currentAge >= 21;
        //Printing out the boolean.
        System.out.println("currentAge >= 21? " + ageComparison);

        //Comparing names.
        boolean nameComparison = myName.equals(yourName);
        //Printing out a message.
        System.out.println("Do the names match? " + nameComparison);
    }
}
