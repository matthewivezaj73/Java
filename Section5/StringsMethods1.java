//Creating a public class. 
public class StringsMethods1 {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating variables.
        String name = "Matthew Ivezaj";
        String name2 = "Matthew Ivezaj";
        String name3 = "John Doe";
        String name4 = "John Baugh";
        //Creating a for loop to analyze a string.
        for(int i = 0; i < name.length(); i++)
        {
            //Printing a character from each name.
            System.out.print(name.charAt(i) + " ");
        }
        //Adding some padding.
        System.out.println();
        //Handling the case where the names are equal.
        if(name.equals(name2))
        {
            //Comparing two names to see if they are equal.
            System.out.println("The names are equal.");
        }
        //Handling the case where the names are not equal.
        else
        {
            //Printing a message stating the strings are not equal.
            System.out.println("The names are not equal!");
        }
        
        //Checking if name compared to name3 is greater than 0.
        if(name.compareTo(name3) > 0)
        {
            //Printing out a message to the user telling them that name is greater than name3.
            System.out.println("name > name3");
        }
        //Handling the case where the name is not greater than 0.
        else
        {
            //Handling the case where name is less than or equal to name3.
            System.out.println("name <= name3");
        }
        //Comparing the author's name to my own.
        if(name.equals(name4))
        {
            //Printing out a message saying that the names are equal.
            System.out.println("The names are equal!");
        }
        //Handling the case where the names are not equal.
        else
        {
            //adding a print statement.
            System.out.println("The names are not equal!");
        }
    }
}