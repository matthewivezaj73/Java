//Creating a public class.
public class ArrayFun {
    //Creating main method.
    public static void main(String[] args)
    {
        /*
            Even though the elements of the array are integer 
            types, the array itself is a reference type.
        */
        //Creating an array reference.
        int[] myArray;
        //Initializing the array
        /*
            You cannot later modify arrays after they are created.
            Arrays are fixed in size.
        */
        myArray = new int[5];
        //Assigning a value to each index in the array.
        myArray[0] = 10;
        myArray[1] = 22;
        myArray[2] = 5;
        myArray[3] = 17;
        myArray[4] = 20;

        //Creating a for loop.
        //Note that putting an equal sign when comparing 
        //the i and myArray (<=), it will throw an error.
        
        //This error is known as an off by one error.
        for(int i = 0; i < myArray.length; i++)
        {
            //Printing a message to the user.
            System.out.println(myArray[i]);
        }
    }
}
