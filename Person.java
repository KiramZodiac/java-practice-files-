public class Person {
    String name = "John";
    int age = 30;

    // public methods cant be accesed without creating an object
    // it will throw an error if involked without creating an object instance
    public void myAdd(int num3, int num4) {
        System.out.println(num3 + num4);
    }

    public static void main(String[] args) {
        // created an object instance for accessing public methods
        Person ob = new Person();
        ob.myAdd(2, 50);

        String name2 = "zodiac";
        System.out.println(name2.toUpperCase());
        Person obj = new Person();
        System.out.println(obj.age);
        System.out.println(obj.name);

        int[] array = { 1, 3, 4, 5, 6, 7, 8, 9, 7, 6, 66, 7 };

        int gen = (array.length);
        System.out.println(gen);

        calculate(10, 2);
        even();
    }

    static void calculate(int num1, int num2) {
        if (num1 + num2 == 10) {
            System.out.println("win");
        }
    }

    static void even() {
        int sumOfEven = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                int gen = sumOfEven += i;
                System.out.println(gen);
            }
        }

    }

}
