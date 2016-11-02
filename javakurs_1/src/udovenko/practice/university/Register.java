package udovenko.practice.university;

import java.sql.*;

/**
 * Created by gladi on 01.11.2016.
 */
class Register implements DatabaseObject {
    private int regID;
    private Date dateLec;
    private int lecture;
    private int student;
    private Connection connection;

    public Register(Date dateLec, int lecture, int student, Connection connection) {
        this.dateLec = dateLec;
        this.lecture = lecture;
        this.student = student;
        this.connection = connection;
    }

    @Override
    public String toString(){
        return regID + " " + dateLec + " " + lecture + " " + student;
    }

    @Override
    public void addBase() throws SQLException{
        try (Statement stmt = connection.createStatement()) {
            String str = String.format("INSERT INTO register (date_lec, lecture, student) VALUES ('%s', '%s', %s)",
                    dateLec, lecture, student);
            stmt.executeUpdate(str, Statement.RETURN_GENERATED_KEYS);
            ResultSet rst = stmt.getGeneratedKeys();
            rst.first();
            regID = rst.getInt(1);
        } /*catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}
