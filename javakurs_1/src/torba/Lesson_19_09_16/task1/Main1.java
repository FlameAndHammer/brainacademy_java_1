package torba.Lesson_19_09_16.task1;

import java.util.Date;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
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
