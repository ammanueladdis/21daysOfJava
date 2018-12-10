// Fig. 7.4: InitArray.java
// Calculating the values to be placed into the elements of an array.

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class InitArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // declare a new constant
        int[] array = new int[ARRAY_LENGTH]; // create the array

        // calculate the value for each array element
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;

        System.out.printf("%s%16s%n", "Index", "Value"); // print out the column headings

        // output each
        for (int i = 0; i < array.length; i++)
            System.out.printf("%5d%16d%n", i, array[i]);

        // Manny fucking around and testing a date to string API
        // declare new date variable date
        Date date = new Date();
        // initialize the SimpleDateFormat class and set the pattern
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        //initialize variable and use dateFormat to convert date to string
        String strDate = dateFormat.format(date);
        System.out.println("The current time is " + strDate + ".");
    }
}