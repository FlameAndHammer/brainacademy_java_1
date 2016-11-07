package shevchenko.homework_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by ПК on 04.11.2016.
 */
class Search {
    private static Search instSearch = new Search();
    private Search(){}
    protected static Search getInstSearch(){return instSearch;}

    protected String[][] searchPresentOfStudentByLastName(String lastName){
        ArrayList<String[]> arrList = new ArrayList<String[]>();
        String str = "Select students.LastName, students.FirstName, register.Lecture, register.Date from \n" +
                "students join register\n" +
                "on students.LastName = register.StudentLastName\n" +
                "where students.LastName = '" + lastName + "'";
        try(Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute((str));
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                String lastname = rs.getString("LastName");
                String firstname = rs.getString("FirstName");
                String lecture = rs.getString("Lecture");
                String date = rs.getString("Date");
                String[] list = {lastname,firstname,lecture,date};
                arrList.add(list);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int size = arrList.size();
        String[][] listOfLectures = new String[size][];
        for(int i = 0; i < size; i++){
            listOfLectures[i] = arrList.get(i);
        }
        return listOfLectures;
    }


    protected String[][] searchPresentOfStudentByFirstName(String firstName){
        ArrayList<String[]> arrList = new ArrayList<String[]>();
        String str ="Select students.LastName, students.FirstName, register.Lecture, register.Date from \n" +
                "students join register\n" +
                "on students.LastName = register.StudentLastName\n" +
                "where students.FirstName = '" + firstName + "'";
        try(Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute((str));
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                String lastname = rs.getString("LastName");
                String firstname = rs.getString("FirstName");
                String lecture = rs.getString("Lecture");
                String date = rs.getString("Date");
                String[] list = {lastname,firstname,lecture,date};
                arrList.add(list);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int size = arrList.size();
        String[][] listOfLectures = new String[size][];
        for(int i = 0; i < size; i++){
            listOfLectures[i] = arrList.get(i);
        }
        return listOfLectures;
    }
}
