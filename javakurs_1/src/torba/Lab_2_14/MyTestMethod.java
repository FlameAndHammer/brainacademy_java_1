package torba.Lab_2_14;

public class MyTestMethod<T> { //T extends Number, Comparable

    public int calcNum(T[] arr, T maxelm) {

        int res = 0;

        for (T el : arr) {
            if ( ((Comparable)el).compareTo(maxelm) > 0 ) {
                res = res + 1;
            }
        }

        return res;

    }

    public double calcSum(T[] arr, T maxval) {

        double res = 0;

        for (T el : arr) {
            if ( ((Comparable)el).compareTo(maxval) > 0 ) {
                if ( el instanceof Integer) { // T.doubleValue();
                    res = res + (Integer) el;
                }
                if ( el instanceof Double) {
                    res = res + (Double) el;

                }
            }
        }

        return res;

    }

}
