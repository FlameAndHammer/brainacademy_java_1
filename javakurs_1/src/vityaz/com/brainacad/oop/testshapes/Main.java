package vityaz.com.brainacad.oop.testshapes;


import java.util.Arrays;

public class Main {
    //accessory newline method
    private static void goToNewLine(){
        System.out.println();
    }

    public static void main(String[] args){
        
        Shape [] arrayOfShapes = {new Circle(6), new Triangle("Yellow", 2, 6, 6),
                new Rectangle("Green", 2, 3),new Circle("Brown", 11), new Rectangle("Blue", 7, 2),
                new Rectangle("Grey", 25, 4), new Triangle("Pink", 3, 3, 3), new Rectangle(18, 19)};

        for(Shape arrayElement:arrayOfShapes){
            arrayElement.draw();
        }
        Main.goToNewLine();

        Shape rect1 = new Rectangle(12, 8);
        Shape rect2 = new Rectangle("Yellow", 18, 4);
        int compareResult = rect1.compareTo(rect2);
        switch (compareResult){
            case -1:{
                System.out.println(rect1.toString() + " have area less than next shape. " + rect2.toString());
                break;
            }
            case 0:{
                System.out.println(rect1.toString() + " have area equal than next shape. " + rect2.toString());
                break;
            }
            case 1:{
                System.out.println(rect1.toString() + " have area more than next shape. " + rect2.toString());
                break;
            }
        }
        Main.goToNewLine();

        Rectangle [] arr2 = {new Rectangle(1, 2), new Rectangle("white", 3, 1), new Rectangle("blue", 6, 7),
        new Rectangle("green", 9,9), new Rectangle("red", 6, 11), new Rectangle("grey", 7, 2), new Rectangle(9,7)};

        Arrays.sort(arr2);

        for (Rectangle arr2Element:arr2){
            arr2Element.draw();
        }

    }
}
