package shevchenko.homework_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by ПК on 04.11.2016.
 */
class Show {
    private static Show instanceShow = new Show();

    private Show() {
    }

    protected static Show getInstance() {
        return instanceShow;
    }

    protected void showArrOfAllStudents() {
        for (int i = 0; i < Student.arrAllStudents.size(); i++) {
            System.out.print(Student.arrAllStudents.get(i).getStudentsId() + "\t");
            System.out.print(Student.arrAllStudents.get(i).getLastName() + "\t");
            System.out.println(Student.arrAllStudents.get(i).getFirstName());
        }
    }

    protected void showAllStudentsFromDataBase() {
        System.out.println("-----------------------------------------------");
        System.out.println("List of All Students");
        System.out.println("-----------------------------------------------");
        System.out.println("ID \t LastNmae \t FirstName");
        try (Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute(("SELECT * FROM students"));
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("Id");
                String lastName = rs.getString("LastName");
                String firstName = rs.getString("FirstName");
                System.out.println(id + "\t" + lastName + "\t" + firstName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------");

    }

    protected void showArrOfLectures() {
        for (int i = 0; i < Lecture.arrLectures.size(); i++) {
            System.out.print(Lecture.arrLectures.get(i).getLastNameOfProfessor() + "\t");
            System.out.println(Lecture.arrLectures.get(i).getNameOfLecture());
        }
    }

    protected void showAllLecturesFromDataBase() {
        System.out.println("-----------------------------------------------");
        System.out.println("List of All Lectures");
        System.out.println("-----------------------------------------------");
        System.out.println("LastNameProfessor \t Lecture");
        try (Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute(("SELECT * FROM lectures"));
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                String lastName = rs.getString("LastNameOfProfessor");
                String lecture = rs.getString("Lecture");
                System.out.println(lastName + "\t" + lecture);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------");
    }

    protected String[][] getArrAllStudentsString() {
        ArrayList<Student> arrStudents = new ArrayList<Student>();
        try (Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute(("SELECT * FROM students"));
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("Id");
                String lastName = rs.getString("LastName");
                String firstName = rs.getString("FirstName");
                Student stud = new Student(id,lastName,firstName);
                arrStudents.add(stud);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int size = arrStudents.size();
        String[][] listStudents = new String[size][];
        for (int i = 0; i < size; i++){
            String[] arr = {String.valueOf(arrStudents.get(i).getStudentsId()),arrStudents.get(i).getLastName(),arrStudents.get(i).getFirstName()};
            listStudents[i] = arr;
        }
        return listStudents;
    }

    protected String[][] getArrAllLecturesString(){
        ArrayList<Lecture> arrLectures = new ArrayList<Lecture>();
        try (Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute(("SELECT * FROM lectures"));
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                String lastName = rs.getString("LastNameOfProfessor");
                String lecture = rs.getString("Lecture");
                Lecture lect = new Lecture(lastName,lecture);
                arrLectures.add(lect);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int size = arrLectures.size();
        String[][] listLectures = new String[size][];
        for (int i = 0; i < size; i++){
            String[] arr = {arrLectures.get(i).getLastNameOfProfessor(),arrLectures.get(i).getNameOfLecture()};
            listLectures[i] = arr;
        }
        return listLectures;
    }

    protected String[] getListLectures(){
        String str = "SELECT Lecture FROM homeworkshevchenkojdbc.lectures";
        ArrayList<String> arrLecturesNames = new ArrayList<String>();
        try (Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute((str));
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                String lecture = rs.getString("Lecture");
                arrLecturesNames.add(lecture);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int size = arrLecturesNames.size();
        String[] listOfLectures = new String[size];
        for(int i = 0; i < size; i++){
            listOfLectures[i] = arrLecturesNames.get(i);
        }
        return listOfLectures;
    }
}
