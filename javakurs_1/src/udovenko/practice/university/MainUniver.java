package udovenko.practice.university;

import udovenko.practice.jdbc.Database;

import java.sql.Connection;

/**
 * Created by gladi on 01.11.2016.
 */
public class MainUniver {
    private static final String URL_CONNECTION = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7142570?useSSL=false";
    public static void main(String[] args) {
        Database db = new Database(URL_CONNECTION, "sql7142570", "IhFJ7Auv7Z");
        db.connect();
        Connection conn_db = db.getConn();
        System.out.println(new Student("Ivan", "Ivanov", conn_db));
        db.close();
    }
}
