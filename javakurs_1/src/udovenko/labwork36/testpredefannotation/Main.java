package udovenko.labwork36.testpredefannotation;

import java.util.Arrays;

/**
 * Created by gladi on 09.11.2016.
 */
class Main {
    @Deprecated
    public static int findMax(int... array){
        int max = 0;
        for (int el: array){
            if (el > max)
                max = el;
        }
        return max;
    }
    @SafeVarargs
    public static<T extends Number> T findMax(T... array){
        T max = null;
        try {
            max = (T)array[0].getClass().newInstance();
            for (T el: array){
                if (el.doubleValue() > max.doubleValue())
                    max = el;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }finally {
            return max;
        }
    }

    @SuppressWarnings("deprecation")
    public void main(){
        //System.out.println(findMax(3, 5, 7, 2, 4));
        //System.out.println(findMax(4.5, 3.2, 6.8));
    }
}
