// Fig. 3.8: GradeBookTest.java
// Creating and manipulating a GradeBook object.
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String args[]) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        // create a GradeBook object and assign it to myGradeBook
        GradeBook myGradeBook = new GradeBook();
        // display initial value of courseName
        System.out.printf("Initial course name is %s\n\n", myGradeBook.getCourseName());
        // prompt for and read the course name
        System.out.println("Please enter the course name:");
        String theName = input.nextLine(); // read a line of text
        myGradeBook.setCourseName(theName); // set the course name from the input
        System.out.println(); // output a blank line
        // call the displayMessage method from myGradeBook and pass an argument called nameOfCourse
        myGradeBook.displayMessage();
    }
}
