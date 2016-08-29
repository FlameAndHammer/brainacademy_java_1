package kulkov.lesson_2_8;

import java.util.Arrays;

/**
 * Created by User on 27.08.2016.
 * Practice using inheritance, polymorphism and abstraction
 */
public class Main {
    public static void main(String[]args) throws CloneNotSupportedException {
        Shape[] arr = new Shape[6];                         //Create an array of different shapes
        arr[0] = new Circle("YELLOW", 3.5);
        arr[1] = new Rectangle("GREY", 4, 11);
        arr[2] = new Triangle("PINK", 5, 9, 9);
        arr[3] = new Circle("GREEN", 4);
        arr[4] = new Rectangle("BLUE", 8, 5);
        arr[5] = new Triangle("ORANGE", 6, 8, 10);
        for (Shape elem: arr) {                             //For each shape in array
            elem.draw();                                    //Print information about it
        }
        System.out.println();                               //adding this for results readability
        Rectangle biggerRect = new Rectangle("WHITE", 15, 20);
        Rectangle smallerRect = new Rectangle("BLACK", 6, 9);
        System.out.println(biggerRect.compareTo(smallerRect) + "" + '\n');  //Compare the areas of a specified rectangles

        Rectangle[] arr2 = {new Rectangle("RED", 13, 8), new Rectangle("RED", 5, 24), new Rectangle("RED", 10, 10),
                new Rectangle("RED", 9, 15), new Rectangle("RED", 12, 14), new Rectangle("RED", 7, 19)};
        Arrays.sort(arr2);                                  //Sort rectangles in the array
        for (Rectangle r: arr2) {
            r.draw();                                       //Print their info to console
        }
        System.out.println();                               //adding this for results readability

        PaintedHome home = new PaintedHome(new Rectangle("VIOLET", 10, 15), new Triangle("AZURE",6 ,6 , 10));
        PaintedHome clonehome = home.clone();               //Make an exact copy of biggerRect object
        System.out.println(clonehome);                      //Print info about this copy

        System.out.println(home.equals(clonehome));         //Check the original and the copy on equality

        System.out.println(home.hashCode());                //Print their hash codes to verify the method equals() work correctly
        System.out.println(clonehome.hashCode());
    }
}
