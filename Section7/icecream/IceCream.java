package icecream;
/*
        Matthew Ivezaj
        6/12/2022
        icecream.java
*/
//Creating a public class.
public class IceCream {
    //Creating an array list.
    String[][] Toppings = new String[2][2];
    //Creating private variables.
    private String name;
    private int numScoops;
    private int cost;
    //Creating a public constructor.
    public void addTopping(String topping)
    {
        //Adding the single topping to the list.
        Toppings.add(topping);
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
    //Creating a constructor to print the toppings added.
    public void printToppings()
    {

    }
}
