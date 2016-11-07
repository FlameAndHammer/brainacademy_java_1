package torba.Lab_3_6.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    private static String modifiersToString(int modifiers) {
        if (modifiers == 0) {return "";}
        String result = "";
        if (Modifier.isAbstract(modifiers)) {result = result + "abstract, ";}
        if (Modifier.isFinal(modifiers)) {result = result + "final, ";}
        if (Modifier.isPublic(modifiers)) {result = result + "public, ";}
        if (Modifier.isNative(modifiers)) {result = result + "native, ";}
        if (Modifier.isInterface(modifiers)) {result = result + "interface, ";}
        if (Modifier.isPrivate(modifiers)) {result = result + "private, ";}
        if (Modifier.isProtected(modifiers)) {result = result + "protected, ";}
        if (Modifier.isStatic(modifiers)) {result = result + "static, ";}
        if (Modifier.isStrict(modifiers)) {result = result + "strictfp, ";}
        if (Modifier.isSynchronized(modifiers)) {result = result + "synchronized, ";}
        if (Modifier.isTransient(modifiers)) {result = result + "transient, ";}
        if (Modifier.isVolatile(modifiers)) {result = result + "volatile, ";}
        char[] mas = new char[result.length()-2];
        for (int i = 0; i <=result.length()-3; i++) {mas[i] = result.charAt(i);}
        return new String(mas);
    }

    public static void main(String[] args) {

        MyClass c = new MyClass();
        Class cls = c.getClass();

        System.out.println("Class name = " + cls.getSimpleName() + "(" + cls.getName() + ")");

        System.out.println("Modifiers: " + modifiersToString(cls.getModifiers()));

        System.out.println("All fields: ");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Name = " + field.getName() + ", type = " + field.getType().getSimpleName() +
                    ", access modifier = " + modifiersToString(field.getModifiers()));
        }

        System.out.println("Constructors:");
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName()+" : ");
            Class[] parTypes = constructor.getParameterTypes();
            for (Class parType : parTypes) {
                System.out.print(parType.getSimpleName() + " ");
            }
            System.out.println("");
        }

        System.out.println("Methods");
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.print("Name = " + method.getName() + ", return type = " + method.getReturnType().getSimpleName()
                    + ", parameter types =");
            Class[] parTypes = method.getParameterTypes();
            for (Class parType : parTypes) {
                System.out.print(" " + parType.getSimpleName());
            }
            System.out.println("");
        }

    }

}

