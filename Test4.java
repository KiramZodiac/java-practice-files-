import java.util.Scanner;

public class Test4 extends Thread {
    public static void main(String[] args) {

        Scanner myScannerNumber = new Scanner(System.in);

        System.out.println("enter number please");
        int number = myScannerNumber.nextInt();

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("fizzBuzz");
        else if (number % 5 == 0)
            System.out.println("fizz");
        else if (number % 3 == 0)
            System.out.println("buzz");
        else
            System.out.println(number);

        Test4 Thread = new Test4();
        Thread.start();
        System.out.println("out of the thread");

    }

    public void run() {
        System.out.println("in thread");
    }

}
