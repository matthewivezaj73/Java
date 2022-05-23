//Creating a public class.
public class StringMethods2 {
    //Creating the structure for the main method.
    public static void main(String[] args)
    {
        //Creating strings.
        String myName = "John Baugh";
        //Creating the uppercase version of myName and assigning it to a variable.
        String upper = myName.toUpperCase();
        //Creating the lowercase version of myName and assigning it to a variable.
        String lower = myName.toLowerCase();
        //Creating an index.
        int whereIsB = myName.indexOf("B");
        //Creating a string.
        /**
         * This substring will start at the position specified, starts at B.
         */
        String lastName = myName.substring(5);
        //Printing out a message.
        System.out.println("Upper is " + upper);
        //Printing the value of lower.
        System.out.println("lower is " + lower);
    }
}
