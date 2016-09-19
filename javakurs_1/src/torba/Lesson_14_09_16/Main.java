package torba.Lesson_14_09_16;

public class Main {

    public static void main(String[] args) {
        MyTuple<String, Integer, Long> mt1 = new MyTuple<String, Integer, Long>("asd", 12, 10l);
        MyTuple<Double, String, String> mt2 = new MyTuple<Double, String, String>(10.2, "qwe", "zxc");

        System.out.println(mt1);
        System.out.println(mt2);

    }

}
