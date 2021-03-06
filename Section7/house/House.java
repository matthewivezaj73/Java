//Linking the files under the house folder.
package house;
/*
        Matthew Ivezaj
        6/08/2022
        House
*/
//Creating a public class.
public class House {
    //Creating private variables.
    private int numStories;
    private int numWindows;
    private String color;
    //Creating a no-org constructor.
    public House()
    {
        //Assigning values to variables.
        numStories = 1;
        numWindows = 4;
        color = "gray";
    }

    //Parameterized constructor.
    public House(int numStories, int numWindows, String color)
    {
        //accessing only the variable by using this.
        this.numStories = numStories;
        //accessing only the variable by using this.
        this.numWindows = numWindows;
        //accessing only the variable by using this.
        this.color = "gray";
    }
    //Creating a method.
    public int getNumStories()
    {
        //Returning one of our private variables.
        return numStories;
    }
    //Creating a method.
    public void setNumStories(int numStories)
    {
        //Referencing the current object.
        this.numStories = numStories;
    }

    //Creating a method.
    public int getNumWindows()
    {
        //Returning numWindows.
        return numWindows;
    }
    //Creating a method.
    public void setNumWindows(int numWindows)
    {
        //Referencing the current object.
        this.numWindows = numWindows;
    }
    //Creating a method.
    public String getColor()
    {
        //Returning color.
        return color;
    }
    //Creating a method.
    public void setColor(String color)
    {
        //Referencing the current object.
        this.color = color;
    }
}