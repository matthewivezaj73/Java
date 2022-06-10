/*
        Matthew Ivezaj
        6/09/2022
        Book
*/
//Creating java class.
public class Book {
    //Creating private variables.
    private String author;
    private String title;
    private String genre;
    private int numPages;
    //Creating a constructor.
    public Book(String author, String title, String genre, int numPages)
    {
        //accessing only the variable by using this.
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
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
    public static void printBookDetails(Book book)
    {
        //Returning the book title.
        return title;
        //Printing the author of the book.
        System.out.println("by " + book.getAuthor());
        //Printing out the number of pages in the book.
        System.out.println("has " + book.getNumPages() + " pages, and it's genre is " + 
        book.getGenre());
        //Adding some padding.
        System.out.println("\n");
    }
}
