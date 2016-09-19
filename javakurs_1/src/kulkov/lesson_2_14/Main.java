package kulkov.lesson_2_14;

/**
 * Created by User on 14.09.2016.
 * Practice with generics
 */
public class Main {
    public static void main(String[] args) {
        //Creating instances of the same class with different type variables
        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("Hello", 10, 50L);              //String, Integer, Long
        System.out.println(myTuple1.getA() + " " + myTuple1.getB() + " " + myTuple1.getC());
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(3.14, "Pi", "number");         //Double, String, String
        System.out.println(myTuple2.getA() + " " + myTuple2.getB() + " " + myTuple2.getC());
        System.out.println();

        Integer[] arr1 = {1,2,3,4,5,6,7,8,9};                       //Create an array of integer values
        MyTestMethod.calcNum(arr1, arr1[2]);                        //Find the number of values that higher than a specified one
        MyTestMethod.calcSum(arr1, arr1[2]);                        //Calculate the sum of values that higher than a specified one
        System.out.println();

        Double[] arr2 = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};      //Create an array of real values
        MyTestMethod.calcNum(arr2, arr2[2]);
        MyTestMethod.calcSum(arr2, arr2[2]);
        System.out.println();

        String[] arr3 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};   //Create an array of strings
        MyMixer<String> mixer = new MyMixer<String>();              //Invoke generic type
        mixer.shuffle(arr3);                                        //Shuffle the elements of array
        for (String elem : arr3) {                                  //Print array to console
            System.out.print(elem + ", ");
        }
    }
}
