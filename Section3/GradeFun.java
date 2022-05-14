//Importing library.
import java.util.Scanner;
/*
    Matthew Ivezaj
    5/12/2022
    GradeFun
 */
//Creating a public class.
public class GradeFun {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Creating a scanner.
        Scanner keyboard = new Scanner(System.in);

        //Creating a variable.
        char grade;
        //Telling the user to enter a grade.
        System.out.println("Enter a grade: ");
        //Grabbing input from the user.
        grade = keyboard.next().charAt(0);

        //Creating a switch statement.
        switch (grade)
        {
            //Handling the case where the student receives an A.
            case 'A':
            case 'a':
                System.out.println("Great job!");
                break;
            //Handling the case where the student receives a B.
            case 'B':
            case 'b':
                System.out.println("Good job.");
                break;
            //Handling the case where the student receives a C.
            case 'C':
            case 'c':
                System.out.println("You can do better.");
                break;
            //Handling the case where the student receives a D.
            case 'D':
            case 'd':
                System.out.println("You're getting pretty close to failing.");
                break;
            //Handling the case where the student receives a F.
            case 'F':
            case 'f':
                System.out.println("You are failing the course!");
                break;
            //Handling the default case.
            default:
                System.out.println("You have entered an invalid grade.");
                //Does not require a break since it is the last option.
        }
    }
}
