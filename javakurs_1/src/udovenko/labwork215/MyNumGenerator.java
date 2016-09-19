package udovenko.labwork215;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by gladi on 19.09.2016.
 */
class MyNumGenerator {
    private final int numOfElm;
    private final int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate(){
        List<Integer> ls = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < numOfElm; i++){
            ls.add(rnd.nextInt(maxNumb));
        }
        return ls;
    }
}
