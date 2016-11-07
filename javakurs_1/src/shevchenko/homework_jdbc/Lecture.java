package shevchenko.homework_jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by ПК on 04.11.2016.
 */
class Lecture {
    private String nameOfLecture;
    private String lastNameOfProfessor;
    protected static ArrayList<Lecture> arrLectures = new ArrayList<Lecture>();

    protected Lecture(String lastNameOfTeacher,String nameOfLecture){
        this.nameOfLecture = nameOfLecture;
        this.lastNameOfProfessor = lastNameOfTeacher;
        boolean flag = true;
        for(int i = 0; i < arrLectures.size(); i++){
            if((arrLectures.get(i).getNameOfLecture().equals(nameOfLecture))&&(arrLectures.get(i).getLastNameOfProfessor().equals(lastNameOfTeacher))){
                flag = false;
            }
        }
        if(flag) {
            arrLectures.add(this);
        }
        arrLectures.add(this);
    }

    protected String getNameOfLecture() {return nameOfLecture;}
    protected String getLastNameOfProfessor() {return lastNameOfProfessor;}

    protected static void addLectureToDataBase(String lastNameProfessor,String lecture){
        boolean flag = true;
        try(Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute(("SELECT * FROM lectures"));
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                String lastNameOfProf = rs.getString("LastNameOfProfessor");
                String lectureName = rs.getString("Lecture");
                if((lastNameOfProf.equals(lastNameProfessor))&&(lectureName.equals(lecture))){
                    flag = false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (flag) {
            String name = "INSERT INTO lectures" + "(LastNameOfProfessor,Lecture)" + "VALUES(?,?);";
            try (PreparedStatement ps = ConectDataBase.getInstConectDB().connection.prepareStatement(name)) {
                ps.setString(1, lastNameProfessor);
                ps.setString(2, lecture);
                ps.executeUpdate();
                System.out.println("insert ok!!!!!!!");
                Lecture lect = new Lecture(lastNameProfessor, lecture);
            } catch (SQLException e) {
                System.out.println("Lecture" + lecture + " with professor = " + lastNameProfessor + " is already Exist");
            }
        }

    }

    protected static void addLecturesToDataBase(){
        Lecture.addLectureToDataBase("Fomichev","mathematics");
        Lecture.addLectureToDataBase("Petrosyan","physics");
        Lecture.addLectureToDataBase("Stoikov","geometry");
    }
    public static ArrayList<Lecture> makeArrOfLecturesFromDB(){
        try(Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute(("SELECT * FROM lectures"));
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                String lastNameOfProfessor = rs.getString("LastNameOfProfessor");
                String lectureName = rs.getString("Lecture");
                Lecture lecture = new Lecture(lastNameOfProfessor,lectureName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrLectures;
    }

}
