package torba.Lesson_19_09_16.task1;

import java.util.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ANikulin
 *
 * change ??? on the fastest collection
 */
public class Main2 {

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
            list.remove(Integer.toString(i));
        }
        finish = new Date().getTime();
        System.out.println(finish - start);
    }
}
