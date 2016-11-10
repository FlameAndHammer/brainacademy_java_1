package udovenko.labwork36.testcustomannotation;

import java.lang.annotation.*;

/**
 * Created by gladi on 09.11.2016.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyPermission {
    PermissionAction value();
}
