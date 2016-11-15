package udovenko.labwork37.testlambda;

import java.util.Objects;

/**
 * Created by gladi on 15.11.2016.
 */
@FunctionalInterface
public interface MyConverter {
    public static boolean isNull(String string){
        return Objects.isNull(string);
    }

    public String convertStr(String s);
}
