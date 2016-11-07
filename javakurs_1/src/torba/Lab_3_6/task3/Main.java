package torba.Lab_3_6.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException,
            InvocationTargetException {

        Class[] parTypes = {int.class};
        Constructor constructor = MyClass.class.getConstructor(parTypes);
        int parValue = 1;
        MyClass o = (MyClass) constructor.newInstance(parValue);

        Class[] parTypes1 = {int.class};
        Method method = MyClass.class.getMethod("setA", parTypes1);
        method.invoke(o, 33);

        System.out.println("Class name = " + o.getClass().getSimpleName()+" (" + o.getClass().getName()+")");

        System.out.println("All fields:");

        Field[] fields = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("Name = " + field.getName() + ", type = " + field.getType().getSimpleName() +
                    ", value = " + field.get(o));
        }

    }

}

