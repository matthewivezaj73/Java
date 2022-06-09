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
    }
}
