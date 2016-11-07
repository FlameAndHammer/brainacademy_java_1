package udovenko.labwork35.testrecflection1;

import java.lang.reflect.*;

/**
 * Created by gladi on 07.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyClass c = new MyClass();

        Class cClass = c.getClass();
        System.out.println("Class name: " + cClass.getName());

        System.out.println("Modifiers:");
        int modifier = cClass.getModifiers();
        printModifier(modifier);

        System.out.println("Public fields:");
        Field[] fields = cClass.getFields();
        printFields(fields);

        System.out.println("All fields:");
        fields = cClass.getDeclaredFields();
        printFields(fields);

        System.out.println("Constructors:");
        Constructor[] constructors = cClass.getConstructors();
        printConstructors(constructors);

        System.out.println("Methods:");
        Method[] methods = cClass.getDeclaredMethods();
        printMethods(methods);
    }

    private static void printModifier(int modifiers) {
        if (Modifier.isAbstract(modifiers)) {
            System.out.println("\tabstract");
        }
        if (Modifier.isFinal(modifiers)) {
            System.out.println("\tfinal");
        }
        if (Modifier.isPublic(modifiers)) {
            System.out.println("\tpublic");
        }
    }

    private static void printFields(Field[] fields) {
        for (Field elem : fields) {
            System.out.println("\tName: " + elem.getName());
            System.out.println("\tType: " + elem.getType().getName());
        }
    }

    private static void printConstructors(Constructor[] constructors) {
        int counting = 0;
        for (Constructor elem : constructors) {
            System.out.print("\tConstructor_" + counting++ + ": ");
            Class<?>[] typeParameters = elem.getParameterTypes();
            for (Class<?> next : typeParameters)
                System.out.print(next.getName() + ", ");
            System.out.println();
        }
    }
    private static void printMethods(Method[] methods) {
        for (Method elem : methods) {
            System.out.println("\tName: " + elem.getName());
            System.out.println("\t\tReturn type: " + elem.getReturnType());
            Class<?>[] typeParameters = elem.getParameterTypes();
            System.out.print("\t\tParam types: ");
            for (Class next : typeParameters)
                System.out.print(next.getName() + " ");
            System.out.println();
        }
    }
}
