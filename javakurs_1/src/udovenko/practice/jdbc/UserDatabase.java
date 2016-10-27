package udovenko.practice.jdbc;

/**
 * Created by gladi on 27.10.2016.
 */
class UserDatabase {
    private String name;
    private String password;

    public UserDatabase(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
