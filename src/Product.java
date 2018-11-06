// Page 64 Self-review 2.5 -
// this program will calculate the products of three integers provided by the user
import java.util.Scanner;

public class Product {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        int x, y, z, result;

        System.out.print("Enter the first integer: "); // prompt user for first integer
        x = input.nextInt();

        System.out.print("Enter the second integer: "); // you know what it is dawg
        y = input.nextInt();

        System.out.print("Enter the third integer: "); // the bird is the word on the third integer
        z = input.nextInt();

        result = x * y * z;
        System.out.printf("The product of your three integers is %d\n", result);
    }
}
