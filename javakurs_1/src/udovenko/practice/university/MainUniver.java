package udovenko.practice.university;

import udovenko.practice.jdbc.Database;

import java.sql.*;

/**
 * Created by gladi on 01.11.2016.
 */
public class MainUniver {
    private static final String URL_CONNECTION = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7142570?useSSL=false";
    public static void main(String[] args) {
        Database db = new Database(URL_CONNECTION, "sql7142570", "IhFJ7Auv7Z");
        db.connect();
        Connection conn_db = db.getConn();

        //Create new student and add to database;
        new Student("Ivan", "Ivanov", conn_db).addBase();

        Register register = new Register(Date.valueOf("2016-11-2"), 2, 1, conn_db);
        System.out.println(register);
        try {
            register.addBase();
        }catch (SQLIntegrityConstraintViolationException sqle){
            System.out.println("Duplicate entry");
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(register);
        db.close();
    }
}
