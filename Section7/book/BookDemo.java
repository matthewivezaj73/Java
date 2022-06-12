//Linking the files under the book folder.
package book;
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
        //Calling the constructor to print the details of the gameOfThrones book.
        gameOfThrones.printBookDetails();
        //Calling the constructor to print the details of the math book.
        mathBook.printBookDetails();
        //Calling the constructor to print the details of the javabook.
        javaBook.printBookDetails();
    }
}
