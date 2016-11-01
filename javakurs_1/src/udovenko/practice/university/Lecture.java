package udovenko.practice.university;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by gladi on 01.11.2016.
 */
class Lecture {
    private int lcId;
    private String name;
    private String lNameLect;

    public Lecture(String name, String lNameLect, Connection conn) {
        this.name = name;
        this.lNameLect = lNameLect;
        addBase(conn);
    }

    @Override
    public String toString(){
        return lcId + " " + name + " " + lNameLect;
    }

    private void addBase(Connection conn){
        try (Statement st = conn.createStatement()){
            String string = String.format("INSERT INTO lecture (name, lname_lect) VALUES ('%s', '%s');", this.name, this.lNameLect);
            st.executeUpdate(string, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = st.getGeneratedKeys();
            rs.first();
            this.lcId = rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
