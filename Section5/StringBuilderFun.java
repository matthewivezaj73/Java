/**
 *      Matthew Ivezaj
 *      05/24/2022
 *      StringBuilderFun
 */
//Creating a public class.
public class StringBuilderFun {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a string builder.
        StringBuilder sb = new StringBuilder("John Baugh");
        //Appending a stringn to the StringBuilder.
        sb.append(" is awesome");
        //Printing a message.
        System.out.println(sb);
        //Inserting a string inside a string.
        sb.insert(5, "Phillip ");
        //Printing sb.
        System.out.println(sb);
        //Replacing index 22 through 29 with amazing.
        sb.replace(22, 29, "amazing");
        //Printing out sb.
        System.out.println(sb);
        //Removing the middle name.
        sb.delete(5, 13);
        //Printing out the name.
        System.out.println(sb);
        //Replacing the first name with Dr.
        sb.replace(0,4,"Dr.");
        //Printing out the new name.
        System.out.println(sb);
    }
}
