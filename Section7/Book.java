/*
        Matthew Ivezaj
        6/09/2022
        Book
*/
//Creating java class.
public class Book {
    //Creating private variables.
    private static String author;
    private static String title;
    private static String genre;
    private static int numPages;
    //Creating a constructor.
    public Book(String author, String title, String genre, int numPages)
    {
        //accessing only the variable by using this.
        Book.author = author;
        Book.title = title;
        Book.genre = genre;
        Book.numPages = numPages;
    }
    //Creating a constructor to get the author.
    public String getAuthor()
    {
        //Returning the author.
        return author;
    }
    //Creating a constructor to get the title.
    public String getTitle()
    {
        //Returning the title.
        return title;
    }
    //Creating a constructor to get the genre.
    public String getGenre()
    {
        //Returning the genre.
        return genre;
    }
    //Creating a constructor to get the number of pages.
    public int getNumPages()
    {
        //Returning the number of pages.
        return numPages;
    }
    //Creating a static method.
    public void printBookDetails()
    {
        //Printing the book title.
        System.out.println(title);
        //Printing the author of the book.
        System.out.println("by " + author);
        //Printing out the number of pages in the book.
        System.out.println("has " + numPages + " pages, and it's genre is " + 
        genre);
        //Adding some padding.
        System.out.println("\n");
    }
}
