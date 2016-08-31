package torba.Lab_2_9.com.brainacad.oop.testwrapper.com.brainacad.oop.testwrapper2;

public class Main {

    static Long compute(Byte b, Integer i){
        Long l = b.longValue() + i.longValue();
        return l;
    }

    public static void main(String[] args){

        System.out.println(compute(new Byte((byte) 5), new Integer(200)));

    }

}
