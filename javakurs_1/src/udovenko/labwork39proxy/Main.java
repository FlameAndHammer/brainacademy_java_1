package udovenko.labwork39proxy;

import java.lang.reflect.Proxy;

/**
 * Created by gladi on 28.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Calculate plainCalculator = new CalculateImpl();

        System.out.println("Call methods without proxy");
        System.out.println("Multiplication 3 and 4: " + plainCalculator.multiplication(3, 4));
        System.out.println("Division 3 and 4: " + plainCalculator.division(4, 2));

        //Dynamic proxy calc object
        Calculate proxyCalculator = (Calculate) Proxy.newProxyInstance(CalculateImpl.class.getClassLoader(),
                CalculateImpl.class.getInterfaces(), (CalculateProxy)CalculateProxy.newInstance(plainCalculator));
        System.out.println("Call methods using the proxy");
        proxyCalculator.multiplication(3, 4);
        proxyCalculator.division(4, 2);
    }
}
