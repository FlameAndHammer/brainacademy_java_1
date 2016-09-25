package udovenko.practice.collections.task4;

import java.util.*;


/**
 * Created by Александр on 19.09.2016.
 *
 * write Comporator for tree set to sort by value
 */
public class Main {
    public static void main(String[] args) {
        SortedSet sortedset = new TreeSet(
                new Comparator() {
                    @Override
                    public int compare(Object e1,
                                       Object e2) {
                        return 1;
                    }
                });

        SortedMap<String, Double> myMap = new TreeMap<String, Double>();
        myMap.put("a", 10.0);
        myMap.put("b", 9.0);
        myMap.put("c", 11.0);
        myMap.put("d", 2.0);
        sortedset.addAll(myMap.entrySet());
        System.out.println(sortedset);
    }

}
