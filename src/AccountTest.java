// Fig. 3.14: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest {
    // main method begins execution of Java application
    public static void main(String [] args) {

        Account account1 = new Account(50.00); // create Account object
        Account account2 = new Account(-7.53); // create second Account

        // display  balance of each object
        System.out.printf("Account1's balance is $%.2f\n", account1.getBalance());
        System.out.printf("Account2's balance is $%.2f\n", account2.getBalance());

        // create Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        double depositAmount; // initialize the deposit variable to read and store input from user
        System.out.print("Enter deposit amount for account1: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("\n Adding %.2f to account1's balance\n\n", depositAmount);
        account1.credit(depositAmount);

        // display  balance of each object
        System.out.printf("Account1's balance is $%.2f\n", account1.getBalance());
        System.out.printf("Account2's balance is $%.2f\n", account2.getBalance());

        // user inputs deposit amount for Account2
        System.out.print("Enter deposit amount for account2: "); //prompt user
        depositAmount = input.nextDouble(); // user inputs deposit amount
        System.out.printf("\n Adding %.2f to account2's balance\n\n", depositAmount);
        account2.credit(depositAmount);

        // display  balance of each object
        System.out.printf("Account1's balance is $%.2f\n", account1.getBalance());
        System.out.printf("Account2's balance is $%.2f\n", account2.getBalance());
    }


}
