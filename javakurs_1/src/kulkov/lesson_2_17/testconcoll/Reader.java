package kulkov.lesson_2_17.testconcoll;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by User on 12.10.2016.
 * Reader finds values for the keys and print them to console
 */
class Reader implements Runnable {
    private Map<Integer, String> map;

    public Reader(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        read(100);
    }

    private int read(int recursion) {
        if (recursion > 0) {
            System.out.println(Thread.currentThread().getName() + map.get(recursion));      //Print the thread name and value to the console
            return read(--recursion);               //Recursive call
        }
        return 0;
    }
}
