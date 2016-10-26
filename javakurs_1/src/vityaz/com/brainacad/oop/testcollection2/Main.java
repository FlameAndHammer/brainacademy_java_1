package vityaz.com.brainacad.oop.testcollection2;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            list.add((int)Math.round(Math.random()*list.size()), "num_" + i);
        }
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.println(element);
        }
    }

}
