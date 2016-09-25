package kulkov.lesson_2_15;

import java.util.*;

/**
 * Created by User on 18.09.2016.
 * Practice with collections
 */
public class Main {
    public static void main(String[] args) {
        //2.15.1
        List<String> arrayList = new ArrayList<String>(11);             //Initialize array list of strings with initial capacity of 11 elements
        for (int i = 0; i <= 10; i++) {
            arrayList.add("number_" + i);                               //Fill list by adding elements to it in the loop
        }
        Iterator<String> arrayItr = arrayList.iterator();               //Initialize iterator of this list
        while (arrayItr.hasNext()) {                                    //While iterator detect next element of the list
            System.out.println(arrayItr.next());                        //Print next element to the console
        }
        System.out.println();
        //2.15.2
        List<String> linkedList = new LinkedList<String>();             //Initialize linked list of strings
        Random r = new Random();                                        //Initialize randomizer
        for (int i = 0; i <= 10; i++) {                                 //Fill list by adding elements at random insertion points in the loop
            linkedList.add(r.nextInt(linkedList.size() + 1), "number_" + i);
        }
        Iterator<String> linkedItr = linkedList.iterator();             //Initialize iterator of this list and print the latter to the console
        while (linkedItr.hasNext()) {
            System.out.println(linkedItr.next());
        }
        System.out.println();
        //2.15.3
        ListIterator<String> listArrItr = arrayList.listIterator(), listLinkItr = linkedList.listIterator();    //Create list iterators
        while (listArrItr.hasNext()) {
            while (listLinkItr.hasNext()) {
                listArrItr.add(listLinkItr.next());                     //Insert linked list inside array list
            }
            listArrItr.next();                                          //Move the cursor to the end of array list
        }
        while (listArrItr.hasPrevious()) {
            listLinkItr.add(listArrItr.previous());                     //Insert updated array list into linked list starting from the last element
        }
        printElements(linkedList);                                      //Print linked list to the console
        System.out.println();
        //2.15.4-5
        MyNumGenerator generator = new MyNumGenerator(5, 64);           //Initialize number generator
        System.out.println(generator.generate());                       //Print generated numbers to console
        System.out.println(generator.generateDistinct());               //Print generated distinct numbers to console
        System.out.println();
        //2.15.6
        MyTranslator translator = new MyTranslator();                   //Initialize word translator
        translator.addNewWord("cat", "кот");                            //Add new words and their translation to dictionary
        translator.addNewWord("caught", "поймал");
        translator.addNewWord("mouse", "мышь");
        Scanner sc = new Scanner(System.in);                            //Initialize scanner to read from the console
        System.out.println(translator.translate(sc.nextLine()));        //Print the translation of a given line
    }

    private static <E> void printElements(List<E> list) {               //Use generics so method can work with any list
        Iterator<E> itr = list.iterator();                              //Initialize iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());                             //While there is a next element in the list print it to the console
        }
    }
}
