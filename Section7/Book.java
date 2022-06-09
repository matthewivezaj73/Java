//Creating java class.
public class Book {
    //Creating private variables.
    private String author;
    private String title;
    private String genre;
    private int numPages;
    //Creating a constructor.
    public Book(String Author, String Title, String genre, int numPages)
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
    }
}
