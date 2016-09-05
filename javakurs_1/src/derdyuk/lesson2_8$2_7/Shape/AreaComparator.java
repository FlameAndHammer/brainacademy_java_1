package derdyuk.lesson2_8$2_7.Shape;

import java.util.Comparator;

/**
 * Created by maossi on 03.09.2016.
 */
public class AreaComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape object1 =(Shape) o1;
        Shape object2 = (Shape) o2;
        if (object1.calcArea() < object2.calcArea()){
            return 1;
        }
        else if (object1.calcArea() > object2.calcArea()){
            return -1;
        }
        else return 0;
    }
}
