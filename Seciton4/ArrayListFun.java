//Importing a library.
import java.util.ArrayList;
//Creating a public class named ArrayListFun.
public class ArrayListFun {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating an array list.
        /**
         * Do not need to insert String in the other brackets.
         */
        ArrayList<String> nameList = new ArrayList<>();

        //Creating an array list for integers.
        ArrayList<int> muNumList = new ArrayList<>();
        /**
         * Array lists only hold reference types, not primitive.
         */
        //Adding names to the list.
        nameList.add("John");
        nameList.add("Kyle");
        nameList.add("Matthew");
        nameList.add("Amanda");
        nameList.add("Wendy");

        //Creating a for loop.
        // for(int i = 0; i < nameList.size(); i++)
        // {
        //     //Printing out each element of the list from the index inside of get.
        //     System.out.println(nameList.get(i));
        // }
        //Creating an enhanced for loop.
        for(int i: nameList)
        {
            //Printing each element of the list.
            System.out.println(nameList.get(i));
        }
    }
}
