//Creating a public class.
public class RectangleDemo {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating rectangle objects.
        Rectangle r1 = new Rectangle();
        //Creating a new rectangle object.
        Rectangle r2 = new Rectangle(5, 10);
        //Printing out the rectangle object with a method call to it.
        System.out.println(Rectangle.getNumRectangles());
        // Creating a new rectangle object
        Rectangle r3;
        //Printing out a message to the user letting them know that rectangle 3 has been declared.
        System.out.println("After r3 declared: " + Rectangle.getNumRectangles());
        //Assigning r3 a value.
        r3 = new Rectangle(2.5, 4);
    }
}
