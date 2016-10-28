package udovenko.labwork217.testconcoll;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by gladi on 28.10.2016.
 */
class Reader extends Thread {
    private ConcurrentHashMap<Integer, String> chm;
    private int maxCount;

    public Reader(String name, ConcurrentHashMap chm, int maxCount) {
        super(name);
        this.chm = chm;
        this.maxCount = maxCount;
    }

    @Override
    public void run(){
        Random rnd = new Random();
        for (int i = 0; i < maxCount; i++){

        }
    }
}
