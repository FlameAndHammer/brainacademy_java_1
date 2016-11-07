package udovenko.labwork35.labwork3_5_3;

import udovenko.labwork35.testrecflection1.MyClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by gladi on 07.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        try {
            Constructor cons = MyClass.class.getConstructor(int.class);
            MyClass myClassNew = (MyClass) cons.newInstance(112);

            Method method = myClassNew.getClass().getMethod("setA", int.class);
            method.invoke(myClassNew, 33);

            Field[] fields = myClassNew.getClass().getDeclaredFields();
            Field.setAccessible(fields, true);

            System.out.println("Class name: " + myClassNew.getClass().getName());
            System.out.println("All fields:");
            for (Field e: fields){
                System.out.println("\tName: " + e.getName());
                System.out.println("\tType: " + e.getType().getName());
                System.out.println("\tValue: " + e.get(myClassNew));
                System.out.println();
            }

        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }




    }
}
