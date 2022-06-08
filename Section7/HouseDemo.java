//Creating a public class.
public class HouseDemo {
    //Creating a method.
    public static void printHouseData(House myHouse)
    {
        //Creating a string named color and assigning it a value.
        String color = "Green";
        //Printing out the color.
        System.out.println(color);
        //Setting parameters.
        myHouse.setNumStories(20);
        //Setting the number of windows.
        myHouse.setNumWindows(16);
        //Setting the color of the house.
        myHouse.setColor("blue");
        //Printing out all of the values in a string.
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
