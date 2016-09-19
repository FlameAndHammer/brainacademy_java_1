package derdyuk.Collection.collections.task1;
import java.util.*;
/**
 * @author ANikulin
 *
 * change ??? on the fastest collection
 */
public class Main4 {

    public static void main(String[] args) {
        long start = new Date().getTime();
        Collection<String> list = new LinkedList<>();
        for(int i = 0;i < 1000000; i++){
            list.add(Integer.toString(i));
        }
        long finish = new Date().getTime();
        System.out.println(finish - start);

        start = new Date().getTime();

        for(int i = 0;i < 10000000; i++){
            list.remove(Integer.toString(i));
        }
        finish = new Date().getTime();
        System.out.println(finish - start);
    }
}
