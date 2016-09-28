package udovenko.labwork217.testthread;

import java.util.Arrays;

/**
 * Created by gladi on 28.09.2016.
 */
class MySumCount extends Thread {
    private int startIndex;
    private int stopIndex;
    private int[] ints;
    private long resultSum = 0;

    public MySumCount(int startIndex, int stopIndex, int[] ints) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.ints = Arrays.copyOfRange(ints, startIndex, stopIndex);
    }

    @Override
    public void run(){
        for (int el: ints) {
            resultSum += el;
            Thread.yield();
        }
    }


    public long getResultSum() {
        return resultSum;
    }
}
