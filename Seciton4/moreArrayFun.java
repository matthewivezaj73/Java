/*
    Matthew Ivezaj
    May 18th, 2022
    moreArrayFun
*/
//Creating a public class.
public class moreArrayFun {
    //Creating a main method.
    public static void main(String[] args)
    {
        //Initialzing the array.
        int[] anArray;
        anArray = new int[10];
        //Creating a standard for loop.
        for(int num = 0; num < anArray.length; num++)
        {
            //Assigning values to each element in the array.
            anArray[num] = num+1;
        }
        //Creating an enhanced for loop.
        for(int num: anArray)
        {
            //Printing out each element in the array.
            System.out.println(anArray[num]);
            //Creating an if statement.
        }
        
    }
}
