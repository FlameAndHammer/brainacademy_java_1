package udovenko.practice;

import java.util.Arrays;

/**
 * Created by gladi on 10.09.2016.
 */
public class Service {
    static int findNull(Listable[] array){
        for (int i = 0; i < Shop.MAX_LIST; i++){
            if (array[i] == null){
                return i;
            }
        }
        return Shop.MAX_LIST;
    }

    static void addListable(Listable[] array){
        int indNull = findNull(array);

    }
}
