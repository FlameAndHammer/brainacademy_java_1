package udovenko.labwork36.testcustomannotation;

/**
 * Created by gladi on 10.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ivan");
        User user2 = new User("Petro");
        user1.setPermissions(PermissionAction.USER_WRITE);
        user2.setPermissions(PermissionAction.USER_READ);

        Action action = new Action();

        //Write to file
        action.write(user1, "User1");
        action.write(user2, "User2");

        //Read from file
        action.read(user1);
        action.read(user2);
    }
}
