package udovenko.labwork215;

import java.util.*;

/**
 * Created by gladi on 19.09.2016.
 */
public class TestCollection1 {
//    Lab Work 2-15-3
    public static void printElements(Collection collection){
        Iterator itr = collection.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
//        Lab Work 2-15-1
        List<String> list1 = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            list1.add("number_" + i);
        }
        System.out.println("Lab Work 2-15-1");
        Iterator<String> itr = list1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        Lab Work 2-15-2
        List<String> listLink = new LinkedList<String>();
        Random rnd = new Random();
        for (int i =0; i < 10; i++){
            listLink.add("num_" + rnd.nextInt(10));
        }
        ListIterator<String> litr = listLink.listIterator();
        System.out.println("Lab Work 2-15-2");
        while (litr.hasNext()){
            System.out.println(litr.next());
        }

//        Lab Wor 2-15-3
        litr = listLink.listIterator(2);
        itr = list1.iterator();
        while (itr.hasNext()) {
            litr.add(itr.next());
        }
        System.out.println("Lab Work 2-15-3");
        printElements(listLink);

//      Lab Work 2-15-4
        MyNumGenerator mng = new MyNumGenerator(5, 64);
        System.out.println("Lab Work 2-15-4");
        System.out.println(mng.generate());

//      Lab Work 2-15-5
        System.out.println("Lab Work 2-15-5");
        System.out.println(mng.generateDistinct());

//      Lab Work 2-15-6
        System.out.println("Lab Work 2-15-6");
        MyTranslator mt = new MyTranslator();
        mt.addNewWorld("cat", "кот");
        mt.addNewWorld("caught", "поймал");
        mt.addNewWorld("mouse", "мышь");
        String string = "cat caught mouse";
        System.out.println(string);
        System.out.println(mt.Translate(string));
    }
}
