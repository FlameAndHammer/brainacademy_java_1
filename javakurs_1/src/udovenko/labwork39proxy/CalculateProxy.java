package udovenko.labwork39proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by gladi on 28.02.2017.
 */
public class CalculateProxy implements InvocationHandler {
    private Object objCalc;

    private CalculateProxy(Object objCalc) {
        this.objCalc = objCalc;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("The method <" + method.getName() + "> invoked with arg: "
        + Arrays.toString(args));

        Object result = method.invoke(objCalc, args);

        System.out.println("The method <" + method.getName() + "> ends with result: "
        + result.toString());
        return result;
    }

    public static Object newInstance(Object obj){
        return new CalculateProxy(obj);
    }
}
