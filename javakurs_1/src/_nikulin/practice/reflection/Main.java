package _nikulin.practice.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        //example get Class
        Class<Test> example1 = Test.class;
        try {
            Class example3 = Class.forName("_nikulin.practice.reflection.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Test test = new Test();
        Class example4 = test.getClass();
        try {
            Test test1 = example1.newInstance();
            Object test2 = example4.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //example work with modifiers
        int mods = example1.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("default");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }
        //example get super class
        Class superclass = example1.getSuperclass();
        //example work with interfaces
        Class[] interfaces = example1.getInterfaces();
        for(Class exampleInterface : interfaces) {
            System.out.println( exampleInterface.getName() );
        }
        //example work with fields
        Field[] publicFields = example1.getFields();
        for (Field field : publicFields) {
            Class fieldType = field.getType();
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + fieldType.getName());
        }
        //example work with constructors
        Constructor[] constructors = example1.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
        //example work with methods
        Method[] methods = example1.getMethods();
        for (Method method : methods) {
            System.out.println("Name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType().getName());

            Class[] paramTypes = method.getParameterTypes();
            System.out.print("Type parameters: ");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }
    }
}


