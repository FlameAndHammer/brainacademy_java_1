package torba.Lab_2_9.com.brainacad.oop.testwrapper2;

public class Main {

/*
    static Long compute(Byte b, Integer i){
        Long l = b.longValue() + i.longValue();
        return l;
    }
*/

    static Double compute(Byte b, Integer i) {
        Double d = b.doubleValue() + i.doubleValue();
        return d;
    }

    public static void main(String[] args){

        //assert compute(new Byte((byte) 5), new Integer(200)) instanceof Long : "Incorrect type"; //??
        assert compute(new Byte((byte) 5), new Integer(200)).getClass().equals(Long.class) :
                "Incorrect type";
        System.out.println(compute(new Byte((byte) 5), new Integer(200)));

    }

}
