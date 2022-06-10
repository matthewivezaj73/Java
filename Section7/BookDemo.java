/*
        Matthew Ivezaj
        6/09/2022
        BookDemo
*/
//Creating a BookDemo class.
public class BookDemo {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a gameOfThrones object.
        Book gameOfThrones = new Book("George Martin", 
        "Game of Thrones", "Fantasy", 864);

        //Creating a mathbook object.
        Book mathBook = new Book("James Stewart",
        "Calculus", "Math", 1392);

        //Creating a java book.
        Book javaBook = new Book("Joel Murach",
                "Murach's Java Programming", "Programming", 800);
    }

    //Creating a static method.
    public static void printBookDetails(Book book)
    {
        //Printing out a book's details to the user.
        System.out.println(book.getTitle());
        //Printing the author of the book.
        System.out.println("by " + book.getAuthor());
        //Printing out the number of pages in the book.
        System.out.println("has " + book.getNumPages() + " pages, and it's genre is " + 
        book.getGenre());
        //Adding some padding.
    }
}
