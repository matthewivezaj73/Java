//Creating a public class.
public class HouseDemo {
    //Creating a method.
    public static int printHouseData(House myHouse)
    {
        //Returning the variable passed.
        
    }
    //Creating a method.
    public static void main(String[]args)
    {
        //Creating an object.
        House myHouse = new House();
        //Creating another object.
        House yourHouse = new House(3,10,"blue");
        //Calling methods from another file.
        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("red");
        //Calling methods from another file.
        // yourHouse.setNumStories(3);
        // yourHouse.setNumWindows(10);
        // yourHouse.setColor("blue");
        //Printing a method to the user.
        System.out.println("My house is " + myHouse.getColor() + " and has " + myHouse.getNumStories() + " stories and " + myHouse.getNumWindows() + " windows.\n");
        //Printing a method to the user.
        System.out.println("Your house is " + yourHouse.getColor() + " and has " + yourHouse.getNumStories() + " stories and " + yourHouse.getNumWindows() + " windows.");
    }
}
