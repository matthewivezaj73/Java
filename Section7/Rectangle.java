//Creating a public class.
public class Rectangle {
    //Creating private variables.
    private double length;
    private double width;
    //Creating a static field.
    private static int numRectangles;
    //Creating a constructor.
    public Rectangle()
    {
        //Using this as a method call.
        this(1.0, 1.0);
    }
    //Creating another constructor with passed arguments.
    public Rectangle(double length, double width)
    {
        //accessing only the variable by using this.
        this.length = length;
        this.width = width;
    }
    //Creating a public constructor.
    public double getLength()
    {
        //returning the length.
        return length;
    }
    //Creating a public constructor.
    public double getWidth()
    {
        //returning the width.
        return width;
    }
    //Creating a public constructor.
    public void setLength(double length)
    {
        //accessing only the variable by using this.
        this.length = length;
    }
    //Creating a public constructor.
    public void setWidth(double width)
    {
        //accessing only the variable by using this.
        this.width = width;
    }
    //Creating a public constructor.
    public double area()
    {
        //Returning length * width.
        return length * width;
    }
    //Creating a static method.
    public static int getNumRectangles()
    {
        
    }
}

