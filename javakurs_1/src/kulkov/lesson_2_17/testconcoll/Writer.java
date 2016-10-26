package kulkov.lesson_2_17.testconcoll;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by User on 12.10.2016.
 * Writer puts key/value pairs to hash map
 */
class Writer implements Runnable {
    private ConcurrentMap<Integer, String> map;

    public Writer(ConcurrentMap<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        write(100);
    }

    private int write(int recursion) {
        if (recursion > 0) {
            map.put(recursion, Thread.currentThread().getName() + " - value: " + recursion);    //Put the thread name and the key number as the value
            return write(--recursion);              //Recursive call
        }
        return 0;
    }
}
