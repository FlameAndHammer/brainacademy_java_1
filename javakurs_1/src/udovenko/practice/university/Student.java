package udovenko.practice.university;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by gladi on 01.11.2016.
 */
public class Student {
    private int stId;
    private String fName;
    private String lName;

    public Student(String fName, String lName, Connection conn) {
        this.fName = fName;
        this.lName = lName;
        addBase(conn);
    }

    @Override
    public String toString(){
        return stId + " " + fName + " " + lName;
    }

    private void addBase(Connection conn){
        try (Statement st = conn.createStatement()){
            String string = String.format("INSERT INTO student (fname, lname) VALUES ('%s', '%s');", this.fName, this.lName);
            st.executeUpdate(string, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = st.getGeneratedKeys();
            rs.first();
            this.stId = rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
