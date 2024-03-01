
import java.util.Scanner;

public class Test1 {

    // Create a checkAge() method with an integer variable called age
    // If age is less than 18, print "access denied"
    static void checkAge(int age) {

        try (Scanner myScanner = new Scanner(System.in)) {
            String userName;
            System.out.println("enter userName:");
            userName = myScanner.nextLine();
            System.out.println("ur username is " + userName);
        }
        if (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("granted");
        }

    }

    public void addNUms(int a, int b) {
        String name = "Akram";
        System.out.println(a + b + name);
    }

    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.addNUms(22, 4);

        checkAge(2);
    }

}
