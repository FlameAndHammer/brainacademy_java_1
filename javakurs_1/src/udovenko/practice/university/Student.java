package udovenko.practice.university;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by gladi on 01.11.2016.
 */
public class Student implements DatabaseObject {
    private int stId;
    private String fName;
    private String lName;
    private Connection connection;

    public Student(String fName, String lName, Connection connection) {
        this.fName = fName;
        this.lName = lName;
        this.connection = connection;
    }

    @Override
    public String toString(){
        return stId + " " + fName + " " + lName;
    }

    @Override
    public void addBase(){
        try (Statement stmt = connection.createStatement()){
            String str = String.format("INSERT INTO student (fname, lname) VALUES ('%s', '%s')", fName, lName);
            stmt.executeUpdate(str, Statement.RETURN_GENERATED_KEYS);
            ResultSet rst = stmt.getGeneratedKeys();
            rst.first();
            stId = rst.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
