//Creating a public class.
public class HouseDemo {
    //Creating a method.
    public static void printHouseData(House aHouse)
    {
        //Creating a string named color and assigning it a value.
        String color = "Green";
        //Printing out the color.
        System.out.println(color);
        //Printing out all of the values in a string.
        System.out.println("The number of stories in the house are, "+aHouse.getNumStories()+"\n. The number of windows in the house are, " + aHouse.getNumWindows()+".\nThe color of the house is, " + aHouse.getColor()+".");
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
        //Calling the newly created method named printHouseData and using myHouse inside of it.
        printHouseData(myHouse);
        //Calling the newly created method named printHouseData and passing yourHouse inside of it.
        printHouseData(yourHouse);
    }
}
