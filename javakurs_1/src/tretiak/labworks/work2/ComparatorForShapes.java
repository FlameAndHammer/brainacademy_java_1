package tretiak.labworks.work2;


public class ComparatorForShapes implements java.util.Comparator {
    @Override
    public int compare(Object a, Object b){
        Shape s1 = (Shape) a;
        Shape s2 = (Shape) b;
        if(s1.calcArea() > s2.calcArea()){
            return 1;
        }else if(s1.calcArea() < s2.calcArea()){
            return -1;
        }
        return 0;
    }
}
