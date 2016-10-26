package vityaz.com.brainacad.oop.testcollection3;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            list1.add("list1_num_" + i);
            list2.add("list2_num_" + i);
        }
        printElement(list1);
        System.out.println();
        printElement(list2);
        System.out.println();
        list1.addAll(list2);

        printElement(list1);
    }
    public static void printElement (List<?> list){
        Iterator<?> itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
