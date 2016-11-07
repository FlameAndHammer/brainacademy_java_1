package udovenko.labwork35.testrecflection2;

import java.lang.reflect.*;

/**
 * Created by gladi on 07.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abcd";
        /*Field[] filds = null;
        filds = myStr.getClass().getDeclaredFields();
        for (Field e: filds){
            int m = e.getModifiers();
            System.out.println("Name: " + e.getName());
            if (Modifier.isPrivate(m))
                System.out.println("privat");
            System.out.println("Type: " + e.getType());
        }*/
        Field value = null;
        try {
            value = myStr.getClass().getDeclaredField("value");
            value.setAccessible(true);
            System.out.println("Old string value: " + myStr);
            value.set(myStr, new char[]{'z', 'x', 'c', 'v'});
            System.out.println("New string value: " + myStr);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        System.out.println("abcd");
    }
}
