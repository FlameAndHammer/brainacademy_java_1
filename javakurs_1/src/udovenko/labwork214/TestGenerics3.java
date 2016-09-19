package udovenko.labwork214;

import java.util.Arrays;

/**
 * Created by gladi on 19.09.2016.
 */
public class TestGenerics3 {
    public static void main(String[] args) {
        Integer[] arrInt = new Integer[10];
        for (int i = 0; i < arrInt.length; i++){
            arrInt[i] = i;
        }

        String[] arrStr = {"nul", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        MyMixer<?> mmInt = new MyMixer<Integer>(arrInt);
        System.out.println(Arrays.toString(mmInt.getArray()));
        System.out.println(Arrays.toString(mmInt.shufle()));

        mmInt = new MyMixer<String>(arrStr);
        System.out.println(Arrays.toString(mmInt.getArray()));
        System.out.println(Arrays.toString(mmInt.shufle()));
    }
}
