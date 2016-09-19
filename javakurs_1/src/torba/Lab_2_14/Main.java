package torba.Lab_2_14;

public class Main {

    public static void main(String[] args) {

        MyTuple<String, Integer, Long> mt1 = new MyTuple<String, Integer, Long>("asd", 12, 10l);
        MyTuple<Double, String, String> mt2 = new MyTuple<Double, String, String>(10.2, "qwe", "zxc");

        System.out.println(mt1);
        System.out.println(mt2);

        System.out.println("-------------------------------------------------------------");

        Integer[] arr1 = new Integer[10];
        Double[] arr2 = new Double[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 10);
        }

        System.out.println("Array values: "+java.util.Arrays.toString(arr1));
        System.out.println("Number of elements that are greater than " + 3 +":");
        System.out.println((new MyTestMethod<Integer>()).calcNum(arr1, 3));
        System.out.println("Sum of elements that are greater than " + 3 +":");
        System.out.println((int)(new MyTestMethod<Integer>()).calcSum(arr1, 3));

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Math.random() * 10;
        }

        System.out.println("Array values: "+java.util.Arrays.toString(arr2));
        System.out.println("Number of elements that are greater than " + 3 +":");
        System.out.println((new MyTestMethod<Double>()).calcNum(arr2, 3.0));
        System.out.println("Sum of elements that are greater than " + 3 +":");
        System.out.println((new MyTestMethod<Double>()).calcSum(arr2, 3.0));

        System.out.println("-------------------------------------------------------------");

        Integer[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(new MyMixer<Integer>(a1).shuffle()));

        String[] a2 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println(java.util.Arrays.toString(new MyMixer<String>(a2).shuffle()));


    }

}
