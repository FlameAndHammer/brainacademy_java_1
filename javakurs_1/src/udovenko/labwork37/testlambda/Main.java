package udovenko.labwork37.testlambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by gladi on 15.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int i = 0; i < 10; i++){
            array[i] = Integer.valueOf((int)(100 * Math.random()));
        }
        System.out.println("Array before sorting: " + Arrays.toString(array));
        Arrays.sort(array, (i1, i2) -> (i2 - i1));
        System.out.println("Sorted array in descending order: " + Arrays.toString(array));

        List<String> strings = new ArrayList<>();
        strings.add("Nikulin");
        strings.add("Derbyuk");
        strings.add("Kulkov");
        strings.add("Mitrofanov");
        strings.add("Shevchenko");
        strings.add("Torba");
        strings.add("Tretiak");
        strings.add("Udovenko");
        strings.add("Vityaz");

        System.out.println("List before sorting: " + strings);
        Collections.sort(strings, (s1, s2) -> (s2.compareTo(s1)));
        System.out.println("Sorted array in the revers alphabetical order: " + strings);
    }
}
