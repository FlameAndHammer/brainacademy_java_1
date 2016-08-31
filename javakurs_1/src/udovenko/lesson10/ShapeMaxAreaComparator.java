package udovenko.lesson10;

import java.util.Comparator;

/**
 * Created by gladi on 29.08.2016.
 */
class ShapeMaxAreaComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;

        if (shape1.calcArea() < shape2.calcArea()){
            return -1;
        }

        if (shape1.calcArea() > shape2.calcArea()){
            return  1;
        }

        return 0;
    }
}
