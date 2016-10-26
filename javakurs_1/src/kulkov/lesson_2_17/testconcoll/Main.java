package kulkov.lesson_2_17.testconcoll;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by User on 30.09.2016.
 * Concurrent collections
 */
class Main {
    public static void main(String[] args) throws InterruptedException{
        ConcurrentMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();  //Initialize concurrent hash map

        Thread writer = new Thread(new Writer(map), "1st Writer");        //Create threads that will operate with that map
        Thread reader = new Thread(new Reader(map), "1st Reader ");

        writer.start();                                     //Add more threads for a test
        new Thread(new Writer(map), "2nd Writer").start();
        new Thread(new Writer(map), "3rd Writer").start();
        new Thread(new Reader(map), "2st Reader ").start();
        new Thread(new Reader(map), "3st Reader ").start();
        reader.start();
        reader.join();                                      //Pause main thread until the last reader has done its job
    }
}
