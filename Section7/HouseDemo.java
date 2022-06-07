//Creating a public class.
public class HouseDemo {
    //Creating private variables.
    private int numStories;
    private int numWindows;
    private String color;

    //Creating a method.
    public int getNumStories()
    {
        //Returning one of our private variables.
        return numStories;
    }
    //Creating a method.
    public void setNumStories()
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
