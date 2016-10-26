package vityaz.com.brainacad.oop.testcollection4_5;


import java.util.*;



public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
            this.numOfElm = numOfElm;
            this.maxNumb = maxNumb;
        }

    public List<Integer> generate(){
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < numOfElm; i++){
        list.add(new Random().nextInt(maxNumb + 1));
    }
    return list;
    }

    public Set<Integer> generateDistinct(){
    Set<Integer> set = new HashSet<>();
    for(int i = 0; i < numOfElm; i++){
        set.add(new Random().nextInt(maxNumb + 1));
    }
    return set;
    }
}

