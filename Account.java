import java.lang.reflect.Constructor;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Account {

    String userName;
    int accountNumber;
    Double balance;
    /*
     * Create a Java class representing a basic bank account. The account should
     * have the following features:
     * 
     * Account holder's name
     * Account number
     * Balance
     * Implement the following operations:
     * 
     * Constructor to initialize the account with the account holder's name, account
     * number, and an initial balance.
     * Method to deposit money into the account.
     * Method to withdraw money from the account (make sure the withdrawal does not
     * exceed the available balance).
     * Method to check and display the account balance.
     * Create a simple program that demonstrates the usage of this bank account
     * class. Instantiate a few accounts, deposit and withdraw money,
     * and display the final balances.
     */

    public static void main(String[] args) {
FileWriter myFileWriter = new FileWriter("null")




        try {
            File myFile = new File("myFile.txt");
            if (myFile.createNewFile()) {
                System.out.println("created the file :" + " " + myFile);
            } else {
                System.out.println("file already exists");
            }
        } catch (Exception e) {
            System.out.println("An error occured");
        }
    }
}
