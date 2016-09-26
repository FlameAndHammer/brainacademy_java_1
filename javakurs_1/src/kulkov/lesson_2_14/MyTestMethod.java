package kulkov.lesson_2_14;

/**
 * Created by User on 16.09.2016.
 * Generic methods
 */
class MyTestMethod {
    //Find the number of values that higher than a specified one
    public static <T extends Number & Comparable<T>> void calcNum(T[] array, T maxElem) {
        int counter = 0;
        for (T elem : array) {
            if (elem.compareTo(maxElem) > 0) {
                counter++;
            }
        }
        System.out.printf("Number of elements that are greater than %s : %d\n", maxElem, counter);
    }
    //Calculate the sum of values that higher than a specified one
    public static <T extends Number & Comparable<T>> void calcSum(T[] array, T maxElem) {
        double sum = 0.0;
        for (T elem : array) {
            if (elem.compareTo(maxElem) > 0) {
                sum += elem.doubleValue();
            }
        }
        System.out.printf("Sum of elements that are greater than %s : %s\n", maxElem, sum);
    }
}
