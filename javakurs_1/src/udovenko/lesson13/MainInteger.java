package udovenko.lesson13;

/**
 * Created by gladi on 31.08.2016.
 */
public class MainInteger {
    static Long compute(Byte b, Integer i){     //Lab Work 2-10-2
        return Long.valueOf(b + i);
    }

    static Long compute1(Byte b, Integer i){     //Lab Work 2-11-5
        return (long)0;
    }

    public static void main(String[] args) {
        //Lab Work 2-10-1
        {
            Integer x1 = 10;
            Integer x2 = new Integer(10);
            Integer x3 = Integer.valueOf(10);
            Integer x4 = Integer.parseInt("10");

            System.out.println("< 128");
            System.out.println("==");
            System.out.println(x1 == x2);
            System.out.println(x1 == x3);
            System.out.println(x1 == x4);
            System.out.println(x2 == x3);
            System.out.println(x2 == x4);
            System.out.println(x3 == x4);

            System.out.println();
            System.out.println("equels");
            System.out.println(x1.equals(x2));
            System.out.println(x1.equals(x3));
            System.out.println(x1.equals(x4));
            System.out.println(x2.equals(x3));
            System.out.println(x2.equals(x4));
            System.out.println(x3.equals(x4));
        }

        {
            Integer x1 = 220;
            Integer x2 = new Integer(220);
            Integer x3 = Integer.valueOf(220);
            Integer x4 = Integer.parseInt("220");

            System.out.println();
            System.out.println("> 128");
            System.out.println("==");
            System.out.println(x1 == x2);
            System.out.println(x1 == x3);
            System.out.println(x1 == x4);
            System.out.println(x2 == x3);
            System.out.println(x2 == x4);
            System.out.println(x3 == x4);

            System.out.println();
            System.out.println("equels");
            System.out.println(x1.equals(x2));
            System.out.println(x1.equals(x3));
            System.out.println(x1.equals(x4));
            System.out.println(x2.equals(x3));
            System.out.println(x2.equals(x4));
            System.out.println(x3.equals(x4));
        }
        //Lab Work 2-10-2
        Long l = compute((byte)3, 7);
        System.out.println("Long l = " + l);

        //Lab Work 2-11-5
        Long lc = compute1((byte)3, 7);
        assert lc == 10;
    }
}
