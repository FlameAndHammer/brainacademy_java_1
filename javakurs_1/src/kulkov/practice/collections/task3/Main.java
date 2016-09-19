package kulkov.practice.collections.task3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ANikulin
 *
 * compile code and get all true, you can change only Product class
 */
class Main {
    public static void main(String[] args) {
        Map<Product,Integer> map = new HashMap<>(); //can be changed
        map.put(null,  2);
        map.put(null,  1);
        System.out.println(map.size() == 1);

        Product p1 = new Product(100);
        Product p2 = new Product(1);
        Map map1 = new HashMap();
        map1.put(p1, 1);
        map1.put(p1, 2);

        System.out.println(map1.size() == 2);
        map1.put(p2, 2);
        map1.put(p2, 2);
        System.out.println(map1.size() == 3);
    }
}
