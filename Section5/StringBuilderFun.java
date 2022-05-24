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
    }
}
