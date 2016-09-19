package _nikulin.practice.collections.task4;

import java.util.*;


/**
 * Created by Александр on 19.09.2016.
 *
 * write Comporator for tree set to sort by value
 */
public class Main {
    public static void main(String[] args) {
        /*SortedSet sortedset = new TreeSet(
                new Comparator() {
                    @Override
                    public int compare(Object e1,
                                       Object e2) {
                        return 1;
                    }
                });*/

        SortedSet<Map.Entry<String, Double>> sortedset = new TreeSet<Map.Entry<String, Double>>(
                new Comparator<Map.Entry<String, Double>>() {
                    @Override
                    public int compare(Map.Entry<String, Double> e1,
                                       Map.Entry<String, Double> e2) {
                        return e1.getValue().compareTo(e2.getValue());
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
