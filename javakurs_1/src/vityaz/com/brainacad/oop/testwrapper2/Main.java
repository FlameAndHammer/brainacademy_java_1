package vityaz.com.brainacad.oop.testwrapper2;


public class Main {
    private static Double compute(Long a, Integer b){
        return  (double) a + b;
    }

    public static void main (String [] args){
        Long a = 3l;
        Integer b = 7;
        Double res = Main.compute(a, b);
        System.out.println(res);
        System.out.println(res.getClass());
    }
}
