// Fig. 2.7: Addition.java
// Addition program that displays the sum of two numbers.
import java.util.Scanner;

public class Addition {
    public static void main( String[] args ) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1, // first number to add
            number2, // second number to add
            sum; // sum of number1 and number 2

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read second number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        sum = number1 + number2; // add numbers then store the total in sum

        System.out.printf("Sum is %d\n", sum); // display sum
    }
}
