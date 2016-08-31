package kulkov.lesson_2_9;

import java.util.Scanner;

/**
 * Created by User on 31.08.2016.
 * Practice using strings
 */
public class Main {
    public static void main(String[]args) {
        //Create a few shapes using string parsing
        System.out.println(Shape.parseShape("Rectangle:RED:10,20"));
        System.out.println(Shape.parseShape("Triangle:GREEN:9,7,12"));
        System.out.println(Shape.parseShape("Circle:BLACK:10"));

        System.out.println();       //add for results readability

        System.out.println("Enter the number of shapes");
        Scanner scanner = new Scanner(System.in);               //Get data from the console
        int numberOfShapes = scanner.nextInt();                 //Define number of shapes by this data
        Shape[] shapes = new Shape[numberOfShapes];             //Create an appropriate array of shapes
        System.out.println("Enter your shapes data");
        for (int i = 0; i < numberOfShapes; i++) {
            scanner = new Scanner(System.in);                   //Get new data from the console
            String line = scanner.nextLine();                   //Put the data into string
            shapes[i] = Shape.parseShape(line);                 //Invoke a string parsing method and return the results into array
        }
        for (Shape elem: shapes) {                              //For each element of array
            elem.draw();                                        //Print it to the console
        }

    }
}
