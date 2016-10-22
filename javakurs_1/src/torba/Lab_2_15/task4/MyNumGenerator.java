package torba.Lab_2_15.task4;

import java.util.ArrayList;
import java.util.List;

public class MyNumGenerator {

    int numOfElm;
    int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List generate() {

        List l = new ArrayList<Integer>();
        for (int i = 0; i < numOfElm; i++) {
            l.add((int) (Math.random() * (maxNumb+1)));
        }
        return l;
    }

}
