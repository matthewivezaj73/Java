/*
    Matthew Ivezaj
    5/28/2022
    addingElements
*/
//Importing arraylist.
import java.util.ArrayList;
//Creating a public class.
public class addingElements {
    //Creating a method.
    public static void main(String[] args)
    {
        //Creating an arraylist.
        ArrayList<Integer> myArrayList = new ArrayList();
        //Adding a number to the arraylist.
        myArrayList.add(4);
        //Adding a number to the arraylist.
        myArrayList.add(414);
        //Adding a number to the arraylist.
        myArrayList.add(5324);
        //Adding the elements and assigning them to a variable.
        int mySum = addElements(myArrayList);
    }
    //Creating a new method to add the elements together.
    public static int addElements(ArrayList<Integer> newList)
    {
        //Creating a variable set to 0.
        int myVariable = 0;
        //Creating a standard for loop.
        for(int x = 0; x < newList.size(); x++)
        {
            //Grabbing each number within the new list.
            myVariable = myVariable + newList.get(x);
        }
        //Adding a return statement.
        return myVariable;
    }
}
