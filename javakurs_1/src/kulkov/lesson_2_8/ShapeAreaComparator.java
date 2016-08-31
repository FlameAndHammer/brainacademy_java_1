package kulkov.lesson_2_8;

import java.util.Comparator;

/**
 * Created by User on 29.08.2016.
 * Comparator
 */
class ShapeAreaComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        if (shape1.calcArea() > shape2.calcArea()) {
            return 1;
        }
        if (shape2.calcArea() < shape2.calcArea()) {
            return -1;
        }
        return 0;
    }
}
