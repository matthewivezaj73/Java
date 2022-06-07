//Creating a public class.
public class House {
    //Creating a method.
    public static void main(String[]args)
    {
        //Creating an object.
        House myHouse = new House();
        //Creating another object.
        House yourHouse = new House();
        //Calling methods from another file.
        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("red");
        //Calling methods from another file.
        yourHouse.setNumStories(3);
        yourHouse.setNumWindows(10);
        yourHouse.setColor("blue");
    }
}
