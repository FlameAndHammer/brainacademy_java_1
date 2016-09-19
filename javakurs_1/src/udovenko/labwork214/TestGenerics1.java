package udovenko.labwork214;

/**
 * Created by gladi on 14.09.2016.
 */
public class TestGenerics1 {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> mt1 = new MyTuple<String, Integer, Long>("Test1", 45, 234l);
        MyTuple<Double, String, String> mt2 = new MyTuple<Double, String, String>(34.5, "Gen1", "Gen2");
        long i = mt1.getFieldC();
    }
}
