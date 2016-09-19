package _nikulin.practice.collections.task2;

import java.util.Date;
import java.util.*;

/**
 * @author ANikulin
 *
 * compile code and get all true, you can change only Product class
 */
public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(33, new Date(2011,11,22));
        Product p2 = new Product(33, new Date(2013,10,22));
        Product p3 = new Product(34, new Date(2001,1,1));
        Product p4 = new Product(35, new Date(1474297309565l));
        Product p5 = new Product(33, new Date(2013,10,22));

        Set<Product> productSet = new HashSet<>();
        productSet.add(p1);
        productSet.add(p2);
        productSet.add(p3);
        productSet.add(p4);
        System.out.println(productSet.size());
        System.out.println(productSet.contains(p2));
        System.out.println(productSet.contains(p5));

        Set<Product> productSet2 = new TreeSet<>();
        productSet2.add(p1);
        productSet2.add(p2);
        productSet2.add(p3);
        productSet2.add(p4);
        System.out.println(productSet2.size());
        System.out.println(productSet2.contains(p2));
        System.out.println(productSet2.contains(p5));
    }
}
