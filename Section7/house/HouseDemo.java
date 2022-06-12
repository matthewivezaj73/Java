//Linking the files under the house folder.
package house;
/*
        Matthew Ivezaj
        6/08/2022
        HouseDemo
*/
//Creating a public class.
public class HouseDemo {
    //Creating a method.
    public static void printHouseData(House aHouse)
    {
        //Printing out all of the values in a string.
        System.out.println("The number of stories in the house are, "+aHouse.getNumStories()+".\nThe number of windows in the house are, " + aHouse.getNumWindows()+".\nThe color of the house is, " + aHouse.getColor()+".");
        //Adding some padding.
        System.out.println("\n");
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
        //Calling the newly created method named printHouseData and passing myHouse inside of it.
        printHouseData(myHouse);
        //Calling the newly created method named printHouseData and passing yourHouse inside of it.
        printHouseData(yourHouse);
    }
}
