package udovenko.labwork215;

import java.util.*;

/**
 * Created by gladi on 19.09.2016.
 */
//Lab Work 2-15-4
class MyNumGenerator {
    private final int numOfElm;
    private final int maxNumb;
    private Random rnd = new Random();

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List<Integer> generate(){
        List<Integer> ls = new ArrayList<Integer>(numOfElm);
        for (int i = 0; i < numOfElm; i++){
            ls.add(rnd.nextInt(maxNumb));
        }
        return ls;
    }

//    Lab Work 2-15-5
    public Set<Integer> generateDistinct(){
        Set<Integer> ls = new HashSet<Integer>(numOfElm);
        for (int i = 0; i < numOfElm; i++){
            ls.add(rnd.nextInt(maxNumb));
        }
        return ls;
    }
}
