package udovenko.practice.jdbc;

import java.sql.*;

/**
 * Created by Александр on 26.10.2016 and gladi on 27.10.2016.
 */
class Database {
    private Connection conn;
    private String connectionURL;
    private UserDatabase user;

    public Database(String connectionURL, String user, String password) {
        this.connectionURL = connectionURL;
        this.user = new UserDatabase(user, password);
    }

    public void connect(){
        try {
            conn = DriverManager.getConnection(connectionURL,
                    user.getName(), user.getPassword());
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (conn != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }

    public void close(){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConn() {
        return conn;
    }

    /*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL Database Driver?");
            e.printStackTrace();
            return;
        }*/




        /**/

}
