// Fig. 2.15: Comparison.Java
// Compare integers using if statements, relational operators and equality operators
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        // create Scanner to obtain input
        Scanner input = new Scanner(System.in);

        int number1, number2; // initialize two int variables

        System.out.print("Enter first integer: "); // prompt user
        number1 = input.nextInt(); // read the first number from a user

        System.out.print("Enter the second integer: "); // prompt user for second number
        number2 = input.nextInt();

        // Equivalency
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);

        // Does not equal
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);

        // less than
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);

        // greater than
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);

        // less than or equal to
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);

        // greater than or equal to
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }
}
