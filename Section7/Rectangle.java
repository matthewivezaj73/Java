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

        }
        //Creating another constructor with passed arguments.
        public Rectangle(double length, double width)
        {
            //accessing only the variable by using this.
            this.length = length;
            this.width = width;
        }
    }

