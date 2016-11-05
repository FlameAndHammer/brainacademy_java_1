package shevchenko.homework_jdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by ПК on 02.11.2016.
 */
class Student {
    private String lastName;
    private String firstName;
    private int studentsId;
    protected static ArrayList<Student> arrAllStudents = new ArrayList<Student>();

    protected Student(int id,String lastName,String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentsId = id;
        boolean flag = true;
        for(int i = 0; i < arrAllStudents.size(); i++){
            if(arrAllStudents.get(i).getStudentsId()==id){
                flag = false;
            }
        }
        if(flag) {
            arrAllStudents.add(this);
        }
    }

    protected void setFirstName(String firstName) {this.firstName = firstName;}
    protected void setLastName(String lastName) {this.lastName = lastName;}
    protected void setStudentsId(int studentsId) {this.studentsId = studentsId;}

    protected String getLastName() {return lastName;}
    protected String getFirstName() {return firstName;}
    protected int getStudentsId() {return studentsId;}

    protected static void addStudentToDatabase(int id, String LastName,String FirstName){
        String name = "INSERT INTO students" + "(id,LastName,FirstName)" + "VALUES(?,?,?);";
        try (PreparedStatement ps = ConectDataBase.getInstConectDB().connection.prepareStatement(name)) {
            ps.setInt(1, id);
            ps.setString(2, LastName);
            ps.setString(3, FirstName);
            ps.executeUpdate();
            System.out.println("insert ok!!!!!!!");
            Student student = new Student(id,LastName,FirstName);
        } catch (SQLException e) {
           // System.out.println("Student with id = " + id + " is already Exist");;
        }
    }

    protected static void addStudentsToDataBase(){
        Student.addStudentToDatabase(1,"Ivanov","Ivan");
        Student.addStudentToDatabase(2,"Petrov","Petya");
        Student.addStudentToDatabase(3,"Smirnov","Sema");
        Student.addStudentToDatabase(4,"Veider","Stepa");
        Student.addStudentToDatabase(5,"Simonov","Vasya");
        Student.addStudentToDatabase(6,"Sidorov","Grisha");
        Student.addStudentToDatabase(7,"Ytochkin","Edik");
        Student.addStudentToDatabase(8,"Nikolaev","Nikolai");
        Student.addStudentToDatabase(9,"Stecenko","Lesha");
        Student.addStudentToDatabase(10,"Petrenko","Genya");
    }

    protected static ArrayList<Student> makeArrOfStudentsFromDB(){
        try(Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute(("SELECT * FROM students"));
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                int id = rs.getInt("Id");
                String lastName = rs.getString("LastName");
                String firstName = rs.getString("FirstName");
                Student student = new Student(id,lastName,firstName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrAllStudents;
    }
}
