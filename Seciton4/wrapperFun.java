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
        //Creating a variable using parseInt that has someValue passed to it.
    }
}
