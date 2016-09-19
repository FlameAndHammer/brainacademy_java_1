package kulkov.practice.collections.task1;

import java.util.*;

/**
 * @author ANikulin
 *
 * change ??? on the fastest collection
 */
class Main2 {

    public static void main(String[] args) {
        long start = new Date().getTime();
        List<String> list = new ArrayList<>();
        for(int i = 0;i < 10000; i++){
            list.add(Integer.toString(i));
        }
        long finish = new Date().getTime();
        System.out.println(finish - start);

        start = new Date().getTime();

        for(int i = 10000;i > 0; i--){
            list.remove(Integer.toString(i));
        }
        finish = new Date().getTime();
        System.out.println(finish - start);
    }
}
