package kulkov.lesson_2_11;

import java.util.Scanner;

/**
 * Created by User on 31.08.2016.
 * Practice with exceptions
 */
class Main {
    public static void main(String[]args) {
        try {
            throw new MyException("Hello!");            //Create exception instance using constructor
        } catch (MyException e) {
            System.out.println(e.getMessage());         //Since there is exception in 'try' block, handle with it here
        } finally {
            System.out.println("Bye!");                 //Start 'finally' block after exception is handled
        }

        MyTest t = null;                                //Create a null reference
        try {
            t.test();                                   //Try to invoke a method with it
        } catch (Exception e) {
            System.out.println(e.getMessage());         //Since it will produce NullPointerException, handle with it
        }

        Person person = new Person();                   //Create an instance of class Person
        try {
            person.setAge(1000);                        //Try to to invoke method
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());         //In case of age exception invocation print a message to the console
        }

        try {
            //Try to parse these strings
            Shape.parseShape("Rectangle:RED:7,3");
            Shape.parseShape("Triangle:GREEN:15,9,8");
            Shape.parseShape("Circle:BLUE:4");
            //Inform user that he/she should enter a string to parse
            System.out.println("Enter the string");
            Scanner scanner = new Scanner(System.in);   //Scan the console
            String line = scanner.nextLine();           //When user will enter something it will be converted to string
            Shape.parseShape(line);                     //Try to parse this string
        } catch (InvalidShapeStringException e) {       //In case of the method can't parse the string there will be exception invoked
            System.out.println(e.getMessage());         //Handle with it by sending a message to the console
        }
    }
}
