/**
 *      Matthew Ivezaj
 *      May 19, 2022
 *      wrapperFun
 */
//Importing arrayList.
import java.util.ArrayList;
//Creating a public class.
public class wrapperFun{
    //Creating a public class.
    public static void main(String[] args)
    {
        //Creating an arraylist.
        ArrayList<Integer> myAL = new ArrayList<>();
        //Adding integers to the array list.
        myAL.add(10);
        myAL.add(22);
        //Creating a for loop.
        for(int i = 0; i < myAL.size(); i++)
        {
            //Defining num.
            // int num = myAL.get(i);
            //Printing a references to the user.
            System.out.println(myAL.get(i));
        }
        //Creating a string integer.
        String someValue = "450";
        //Coverting the string number to a real number.
        int numericValue = Integer.parseInt(someValue);
        //Creating a string integer.
        String myValue = "3.14159";
        //Converting the string to a real double.
        double doubleValue = Double.parseDouble(myValue);
        //Adding 10 to the numericInt.
        numericValue += 10;
        //Printing out the value of numericValue.
        System.out.println(numericValue);
    }
}
