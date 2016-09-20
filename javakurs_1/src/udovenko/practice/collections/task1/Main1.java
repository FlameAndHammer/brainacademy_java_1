package udovenko.practice.collections.task1;

import java.util.*;

/**
 * @author ANikulin
 *
 * change ??? on the fastest collection
 */
public class Main1 {

    public static void main(String[] args) {
        long start = new Date().getTime();
        List<String> list = new ArrayList<String>();
        for(int i = 0;i < 100000; i++){
            list.add(Integer.toString(i));
        }
        long finish = new Date().getTime();
        System.out.println(finish - start);

        start = new Date().getTime();

        for(int i = 100000;i > 0; i--){
            list.add(i,Integer.toString(i));
        }
        finish = new Date().getTime();
        System.out.println(finish - start);
    }
}
