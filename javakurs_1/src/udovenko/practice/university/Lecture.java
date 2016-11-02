package udovenko.practice.university;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by gladi on 01.11.2016.
 */
class Lecture implements DatabaseObject {
    private int lcId;
    private String name;
    private String lNameLect;
    private Connection connection;

    public Lecture(String name, String lNameLect, Connection connection) {
        this.name = name;
        this.lNameLect = lNameLect;
        this.connection = connection;
    }

    @Override
    public String toString(){
        return lcId + " " + name + " " + lNameLect;
    }


    @Override
    public void addBase() {
        try (Statement stmt = connection.createStatement()){
            String str = String.format("INSERT INTO lecture (name, lname_lect) VALUES ('%s', '%s')", name, lNameLect);
            stmt.executeUpdate(str, Statement.RETURN_GENERATED_KEYS);
            ResultSet rst = stmt.getGeneratedKeys();
            rst.first();
            lcId = rst.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
