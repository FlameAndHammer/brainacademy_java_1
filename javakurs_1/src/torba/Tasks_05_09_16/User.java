package torba.Tasks_05_09_16;

public class User {
    private String name;
    private String password;
    private boolean admin;
    public User(String name, String password, boolean admin) {
        this.name = name;
        this.password = password;
        this.admin = admin;
    }
    public boolean getAdmin() {
        return admin;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
}
