package udovenko;
import java.lang.Math.*;

/**
 * Created by gladi on 23.09.2016.
 */
public class TestOverload {
    void doJob(float x){
        System.out.println("float");
    }
    void doJob(double x){
        System.out.println("double");
    }
    void doJob(long x){
        System.out.println("long");
    }

    public static void main(String[] args) {
        long i = 5;
        new TestOverload().doJob(i);
        Math.cos(i);
    }

}
