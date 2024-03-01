
//Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:
import java.text.NumberFormat;
import java.text.DateFormat;
import java.util.Scanner;
import java.time.Clock;
import java.time.LocalDateTime;

/*
Create a Java class representing a basic bank account. The account should have the following features:
Account holder's name
Account number
Balance
Implement the following operations:

Constructor to initialize the account with the account holder's name, account number, and an initial balance.
Method to deposit money into the account.
Method to withdraw money from the account (make sure the withdrawal does not exceed the available balance).
Method to check and display the account balance.
Create a simple program that demonstrates the usage of this bank account class. Instantiate a few accounts, deposit and withdraw money, and display the final balances.*/

public class Test {

    public static void main(String[] args) {
        String[] fruits = { "mango", "orange", "pineapple" };

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Scanner mysScanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("quit")) {
            System.out.println("please enter to play the game");
            System.out.println(input);
            input = mysScanner.nextLine().trim().toLowerCase();
        }

    }

}
