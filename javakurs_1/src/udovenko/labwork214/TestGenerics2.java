package udovenko.labwork214;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by gladi on 19.09.2016.
 */
public class TestGenerics2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Integer[] arrInteger = new Integer[10];
        Double[] arrDouble = new Double[10];
        for (int i =0; i < arrInteger.length; i++){
            arrInteger[i] = rnd.nextInt(10);
            arrDouble[i] = rnd.nextDouble() * Double.valueOf("10");
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (Double el: arrDouble){
            sb.append(String.format("%.1f ", el));
        }
        sb.append(']');

        System.out.println("Array values: " + Arrays.toString(arrInteger));
        System.out.println("Number of elements that are greater than 3:");
        System.out.println(MyTestMethod.culcNum(arrInteger, Integer.valueOf("3")));

        System.out.println("Array values: " + sb.toString());
        System.out.println("Number of elements that are greater than 3:");
        System.out.println(MyTestMethod.culcNum(arrDouble, Double.valueOf("3")));

//        Lab Work 2-14-3
        System.out.println("Array values: " + Arrays.toString(arrInteger));
        System.out.println("Sum of elements that are greater than 3:");
        System.out.printf("%.2f\n", MyTestMethod.culcSum(arrInteger, Integer.valueOf("3")));
        System.out.println("Array values: " + sb.toString());
        System.out.println("Sum of elements that are greater than 3:");
        System.out.printf("%.2f\n", MyTestMethod.culcSum(arrDouble, Double.valueOf("3")));
    }
}
