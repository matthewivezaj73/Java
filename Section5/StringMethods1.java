//Creating a public class. 
public class StringMethods1 {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating variables.
        String name = "Matthew Ivezaj";
        String name2 = "Matthew Ivezaj";
        String name3 = "John Doe";
        //Creating a for loop to analyze a string.
        for(int i = 0; i < name.length(); i++)
        {
            //Printing a character from each name.
            System.out.println(name.charAt(i));
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

        }
        //Handling the case where the name is not greater than 0.
    }
}
