package udovenko.labwork36.testcustomannotation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gladi on 09.11.2016.
 */
class User {
    private String name;
    private List<PermissionAction> permissions = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    public List<PermissionAction> getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionAction permission) {
        this.permissions.add(permission);
    }
}
