package kulkov.lesson_2_17.testthread2;

/**
 * Created by User on 26.09.2016.
 * Calculation with multithreading
 */
class MySumCount implements Runnable {
    //Fields
    private int startIndex;
    private int stopIndex;
    private int[] array;
    private long resultSum;
    //Getters and setters
    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public long getResultSum() {
        return resultSum;
    }

    @Override
    public void run() {
        long temp = 0;
        for (int i = startIndex; i <= stopIndex; i++) {
            temp += array[i];               //Sum each array value with index specified in range
        }
        resultSum = temp;
    }
}
