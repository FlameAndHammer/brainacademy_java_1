package torba.Lab_3_6.task2;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        String s = "abcd";

        System.out.println(s);

        Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        char[] value1 = {'z', 'x', 'c', 'v'};
        value.set(s, value1);

        System.out.println(s);

        System.out.println("abcd");

    }

}

