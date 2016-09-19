package kulkov.lesson_2_15;

import java.util.*;

/**
 * Created by User on 19.09.2016.
 * Generating numbers
 */
public class MyNumGenerator {
    //Fields
    private int numOfElem;                                  //Number of elements
    private int maxNumber;                                  //Max value
    //Constructor
    public MyNumGenerator(int numOfElem, int maxNumber) {
        this.numOfElem = numOfElem;
        this.maxNumber = maxNumber;
    }

    public List<Integer> generate() {                       //Create list of numbers
        Random r = new Random();                            //Initialize randomizer
        List<Integer> list = new ArrayList<Integer>();      //Initialize array list of integers
        for (int i = 0; i < numOfElem; i++) {               //Fill the list in the loop
            list.add(r.nextInt(maxNumber + 1));             //Element of the list should be in range from 0 to maxNumber
        }
        return list;
    }

    public Set<Integer> generateDistinct() {                //Create set of numbers
        Random r = new Random();
        Set<Integer> set = new HashSet<Integer>();          //Initialize hash set of integers
        for (int i = 0; i < numOfElem; i++) {               //Fill the set in the loop
            set.add(r.nextInt(maxNumber + 1));              //Elements with the same value will be added to a set only once
        }
        return set;
    }
}
