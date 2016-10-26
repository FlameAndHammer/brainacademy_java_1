package torba.Lab_2_15.task3;

import java.util.*;

public class Main {

    public static void printElements(List l) {
        Iterator it = l.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        LinkedList<String> ll = new LinkedList<String>();

        for(int i = 0; i <= 10; i++) {
            al.add("array" + i);
            ll.add("linked" + i);
        }

        Iterator<String> it1= al.iterator();
        Iterator<String> it2= ll.iterator();

        while(it1.hasNext()) {
            System.out.println(it1.next());
        }

        while(it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("---------------------------------------------------------------------------");

        ListIterator<String> listIt1 = al.listIterator();
        ListIterator<String> listIt2 = ll.listIterator();

        while(listIt2.hasNext()) {
            String el = listIt2.next();
            listIt1.next();
            listIt1.add(el);
        }

        printElements(al);

        System.out.println("---------------------------------------------------------------------------");

        listIt1 = al.listIterator();
        listIt2 = ll.listIterator();

        while (listIt1.hasNext()) {listIt1.next();}

        while(listIt2.hasNext()) {
            String el = listIt2.next();
            System.out.println("->" + listIt1.previous());
            listIt1.add(el);
        }

        printElements(al);

    }

}
