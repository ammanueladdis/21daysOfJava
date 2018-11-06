// Fig. 3.5: GradeBookTest.java
// Creating a GradeBook object and pass a String to its displayMessage method
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String args[]) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        // create a GradeBook object and assign it to myGradeBook
        GradeBook myGradeBook = new GradeBook();
        //prompt for and input the course name
        System.out.println("Please enter the course name:");
        String nameOfCourse = input.nextLine(); // read the line of text
        System.out.println(); // output a blank line

        // call the displayMessage method from myGradeBook and pass an argument called nameOfCourse
        myGradeBook.displayMessage(nameOfCourse);
    }
}
