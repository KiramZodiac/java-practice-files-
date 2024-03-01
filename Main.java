
//java comment test
//import java.util.Scanner;
//
//class inputDemo{
//    public static void main(String[] args){
//        Scanner.in;
//        in = new Scanner(System.in);
//        .
//        .
//        .
//    }
//}

public class Main {

    int y = 5;

    static void myMethod(String fname, int age) {
        System.out.println("my name is " + fname + "and my age is" + age);
    }

    static void method2(String lname, int grades) {
        System.out.println(lname + "and ur grades ae" + grades);
    }

    public static void main(String[] args) {

        Main obj1 = new Main();
        Main obj2 = new Main();

        System.out.println(obj1.y);
        System.out.println(obj2.y);

        method2("zaga", 50);
        myMethod("akram", 20);

        String lname;
        lname = "mageye";

        String firstName = "akram";
        System.out.println("Thank lord!! \"please\" guide me through");
        System.out.println("anaother1" + " " + lname);

        System.out.println(78233343 + " " + firstName);

        final int num = 36;
        int num2 = 5566;
        System.out.println(num + num2);

        int age = 25;
        int voteAge = 18;
        String name = "Akram Zodiac";
        if (age >= voteAge) {
            System.out.println(name + "u can vote ");
        }

        /*
         * fizbuzz
         * numbers = 100
         * if numbers % 3 = fizz
         * if number% 5 = buzz
         * if number % 5 & 3 = fizzBuzz
         * 
         */
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        String[] cars = { "volvo", "benzwe", "bmw" };
        for (int b = 0; b < cars.length; b++) {
            System.out.println(cars[b]);
        }

    }

}
