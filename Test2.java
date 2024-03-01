public class Test2 {

    static int count = 1;

    static void inc() {
        System.out.println(count++);
    }

    static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        inc();

        Person("Akram", 26);

        isEven(3);

        int age = 25;
        System.out.println(age);

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

    }

    static void Person(String name, int age) {
        System.out.println(name + " " + age);
    }

}

// Question 1: Declare a variable of type int named 'age' and assign it the
// value 25.
// Print the value of 'age' to the console.
// Question 2: Create a loop that prints the numbers from 1 to 5.
// Question 3: Write a method named 'isEven' that takes an int parameter and
// returns true if the number is even, false otherwise.
// Question 4: Create a class named 'Person' with instance variables 'name' and
// 'age'. Add a constructor to initialize these variables.
// Question 5: Create an object of the 'Person' class and set its name to "John"
// and age to 30. Print the details of the person.
// Question 6: Write a program that calculates the sum of all even numbers from
// 1 to 10.

// Question 7: Given an array of integers, write a method 'findMax' that returns
// the maximum value in the array.

// Question 8: Create an interface named 'Shape' with a method 'calculateArea'.
// Implement this interface in two classes: 'Circle' and 'Rectangle'.

// Question 9: Demonstrate polymorphism by creating an array of 'Shape' and
// calculating the area of each shape.

// Question 10: Write a program that takes user input for two numbers and prints
// their sum, difference, product, and quotient.

// Bonus Question: Implement a simple program using a HashMap to store and
// retrieve information about books (title, author, and publication year).

// Feel free to use comments to explain your code and approach each question.
