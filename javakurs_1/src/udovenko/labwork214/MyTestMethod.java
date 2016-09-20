package udovenko.labwork214;

/**
 * Created by gladi on 19.09.2016.
 */
class MyTestMethod {
    static <T> int culcNum(T[] array, T maxelm){
        int result = 0;
        for (T e: array){
            if (((Comparable)e).compareTo(maxelm) > 0){
                result++;
            }
        }
        return result;
    }

//    Lab Work 2-14-3
    /*static <T extends Number> T culcSum(T[] array, T maxval){
        ;
        for (T e: array){
            if (((Comparable)e).compareTo(maxval) > 0){
                Number.;
            }
        }
    }*/
}
