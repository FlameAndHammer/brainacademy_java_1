package udovenko.labwork37.testlambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by gladi on 15.11.2016.
 */
public class TestLambda {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int i = 0; i < 10; i++){
            array[i] = Integer.valueOf((int)(100 * Math.random()));
        }
        System.out.println("Array before sorting: " + Arrays.toString(array));
        Arrays.sort(array, (i1, i2) -> i2 - i1);
        System.out.println("Sorted array in descending order: " + Arrays.toString(array));

        //Labwork 3-7-2
        System.out.println("Sum even items: " + sumEven(array, (i) -> i % 2 == 0));

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
        Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted array in the revers alphabetical order: " + strings);

        //Labwork 3-7-2
        System.out.print("Strings that start from 'T': " );
        printJStr(strings, s -> s.startsWith("T"));

        //Labwork 3-7-3
        strings.forEach(s -> System.out.println(updateList(s)));

    }

    //Labwork 3-7-2
    private static int sumEven(Integer[] array, Predicate<Integer> filter){
        int sum = 0;
        for (int el: array){
            if (filter.test(el)){
                sum = sum + el;
            }
        }
        return sum;
    }

    //Labwork 3-7-2
    private static void printJStr(List<String> list, Predicate<String> filter){
        List<String> result = new ArrayList<>();
        for (String el: list){
            if (filter.test(el))
                result.add(el);
        }
        System.out.println(result);
    }

    //Labwork 3-7-3
    private static String updateList(String string){
        MyConverter converter = s -> !MyConverter.isNull(s) ? s.toUpperCase() : null;
        return converter.convertStr(string);
    }
}
