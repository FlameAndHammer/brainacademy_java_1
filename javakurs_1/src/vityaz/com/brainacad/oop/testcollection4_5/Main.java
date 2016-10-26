package vityaz.com.brainacad.oop.testcollection4_5;


import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MyNumGenerator mng = new MyNumGenerator(10, 10);
        List<Integer> list = mng.generate();
        Set<Integer> set = mng.generateDistinct();
        System.out.println(list);
        System.out.println();
        System.out.println(set);
    }
}

