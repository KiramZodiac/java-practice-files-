import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.HashMap;

public class Hello {

    public static void main(String[] args) {

        Pattern myPattern = Pattern.compile("pro", Pattern.CASE_INSENSITIVE);

        Matcher matcher = myPattern.matcher("hello akram is agreat programmer");

        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("found it");
        } else {
            System.out.println("not found");
        }

        try {
            for (int c = 0; c < 20; c++) {
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.println("an erroe occured");
        }

        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[19]);

        } catch (Exception e) {
            System.out.println("error no idex 19");
        }

        Integer myInt1 = 1002;
        String myintString = myInt1.toString();
        System.out.println(myintString.length());

        String name1;
        String school;

        Scanner myclassScanner = new Scanner(System.in);

        System.out.println("what is ur name");
        name1 = myclassScanner.nextLine();
        System.out.println("yr name is " + name1);
        myclassScanner.nextLine();
        System.out.println("What is ur class");
        school = myclassScanner.nextLine();
        System.out.println(school);
        myclassScanner.close();

        HashSet<Integer> number = new HashSet<>();

        number.add(2);
        number.add(4);
        number.add(4);
        number.add(8);
        number.add(9);
        number.add(0);

        for (int a = 0; a <= 10; a++) {
            if (number.contains(a)) {
                System.out.println(a + "is present");
            } else {
                System.out.println(a);
            }
        }

        LocalTime myLocalTime = LocalTime.now();
        System.out.println(myLocalTime);
        LocalDate myDate = LocalDate.now();

        System.out.println(myDate);

        // HashMAp list

        HashMap<String, String> carList = new HashMap<String, String>();

        carList.put("model", "toyota");
        carList.put("class", "first-class");
        carList.put("gear", "manual");
        carList.put("country", "Kenya");

        for (String i : carList.keySet()) {
            System.out.println(carList.get(i));
        }

        System.out.println(carList);

        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("cow");
        animals.add("hen");
        for (int c = 0; c < animals.size(); c++) {
            System.out.println(animals.get(c));
        }

        System.out.println((animals.contains("dog")));

        ArrayList<Integer> myInt = new ArrayList<>();
        myInt.add(2344);
        myInt.add(63737);
        myInt.add(777373);

        for (int a = 0; a < myInt.size(); a++) {
            System.out.println(myInt.get(a));
        }

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("benze");
        cars.add("subaru");
        cars.add("mark2");
        cars.add("jeep");
        cars.add("mark x");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println(cars.get(1));
        System.out.println(cars.size());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalTime timeObj = LocalTime.now();
        System.out.println(timeObj);
        ArrayList<String> students = new ArrayList<>();

        students.add("mark");
        students.add("john");
        students.add("walder");
        students.add("imy");
        students.add("mark");

        for (String i : students) {
            System.out.println(i.length());
        }

        // define a scanner object fist
        Scanner scanObj = new Scanner(System.in);
        System.out.println("enter ur name please");
        String name = scanObj.nextLine();
        scanObj.nextLine();

        System.out.println("enter ur age");
        int age = scanObj.nextInt();

        System.out.println(name + age);

        scanObj.close();
    }
}
