//Linking the files under the icecream folder.
package icecream;
//Importing library.
import java.util.ArrayList;
/*
        Matthew Ivezaj
        6/12/2022
        icecream.java
*/
//Creating a public class.
public class IceCream {
    //Creating an array list.
    ArrayList<String> toppings = new ArrayList<>();
    //Creating private variables.
    private String name;
    private int numScoops;
    private int cost;
    //Creating a public constructor.
    public String addTopping(String topping)
    {
        //Adding the single topping to the list.
        toppings.add(topping);
        //Returning the topping.
        return topping;
    }
    //Creating a constructor to get the cost.
    public int getCost(int Cost)
    {
        //Returning the cost of the item.
        return Cost;
    }
    //Creating a constructor to grab the name.
    public String getName(String name)
    {
        //Returning the name.
        return name;
    }
    //Creating a constructor to get the number of scoops the customer wants.
    public int getNumScoops(int Scoops)
    {
        //Returning the number of scoops.
        return Scoops;
    }
    //Creating IceCream Constructor.
    public IceCream()
    {

    }
    //Creating a constructor to print the toppings added.
    public void printToppings()
    {

    }
}
