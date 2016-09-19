package kulkov.lesson_2_14;

/**
 * Created by User on 16.09.2016.
 * Generic methods
 */
class MyTestMethod {
    //Find the number of values that higher than a specified one
    public static <T extends Number> T calcNum(T[] array, T maxElem) {
        return calcNum(array, maxElem, 0, 0);                       //Invoke method with start values
    }

    private static <T extends Number> T calcNum(T[] array, T maxElem, int i, int res) {
        if (i < array.length) {
            if (array[i].doubleValue() > maxElem.doubleValue()) {
                res++;
            }
            return calcNum(array, maxElem, ++i, res);               //Recursion instead of cycle
        }
        System.out.println("Number of elements that are greater than " + maxElem + ":");
        System.out.println(res);                                    //Print the result to console
        return null;
    }
    //Calculate the sum of values that higher than a specified one
    public static <T extends Number> T calcSum(T[] array, T maxElem) {
        return calcSum(array, maxElem, 0, 0.0);                     //Invoke method with start values
    }

    private static <T extends Number> T calcSum(T[] array, T maxElem, int i, Double res) {
        if (i < array.length) {
            if (array[i].doubleValue() > maxElem.doubleValue()) {
                res += array[i].doubleValue();
            }
            return calcSum(array, maxElem, ++i, res);               //Recursion instead of cycle
        }
        System.out.println("Sum of elements that are greater than " + maxElem + ":");
        System.out.println(res);                                    //Print the result to console
        return null;
    }
}
