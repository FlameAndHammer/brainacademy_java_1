package kulkov.lesson_2_10;

/**
 * Created by User on 31.08.2016.
 * Creating wrappers
 */
class WrapperDemo {
    public static void main(String[]args) {
        //Define integer variables different ways but with the same value
        Integer x1 = 10;                        //literal
        Integer x2 = new Integer(10);           //new instance of class integer
        Integer x3 = Integer.valueOf(10);       //get literal through unboxing
        Integer x4 = Integer.parseInt("10");    //get literal through parsing
        //Check the references on equality
        //To check the content use equals() method
        System.out.println(x1 == x2);
        System.out.println(x1 == x3);
        System.out.println(x1 == x4);
        System.out.println(x2 == x3);
        System.out.println(x2 == x4);
        System.out.println(x3 == x4);
        //Use boxing and unboxing
        System.out.println(compute((byte)10, 190));
    }

    static Long compute(Byte b, Integer i) {    //Byte and Integer instances as attributes
        long l = b.byteValue() + i.intValue();  //Unbox the content of these instances, sum it, and write the sum to long primitive
        return Long.valueOf(l);                 //Box the value of long primitive to Long instance and return it
    }
}
