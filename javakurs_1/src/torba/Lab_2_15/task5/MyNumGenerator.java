package torba.Lab_2_15.task5;

import java.util.Set;
import java.util.HashSet;

public class MyNumGenerator {

    int numOfElm;
    int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public Set generate() {

        Set s = new HashSet<Integer>();

        while (s.size() < numOfElm) {
           s.add((int) (Math.random() * (maxNumb + 1)));
        }

        return s;
    }

}
