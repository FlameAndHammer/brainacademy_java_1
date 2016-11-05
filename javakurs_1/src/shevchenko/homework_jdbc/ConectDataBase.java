package shevchenko.homework_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by ПК on 02.11.2016.
 */
class ConectDataBase {
    private static ConectDataBase instConectDB = new ConectDataBase();
    private ConectDataBase(){}
    protected static ConectDataBase getInstConectDB(){
        return instConectDB;
    }

    Connection connection = null;

    protected void connectToDataBase(String password) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", password);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }
        createBase(password);
        addTablesToDataBase();
        Student.addStudentsToDataBase(); //add ten diferent students to table students
        Lecture.addLecturesToDataBase();// add three diferent lectures to table lecture
        Register.addRegisterToDB("geometry","04112016");
    }

    protected void createBase(String password) {
        try {
            Statement st = connection.createStatement();
            String str = "CREATE DATABASE HomeWorkShevchenkoJDBC";
            st.execute(str);
        }
        catch (SQLException e){
            System.out.println("DataBase is already exist");;
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HomeWorkShevchenkoJDBC", "root", password);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }
        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }

    protected void addTablesToDataBase(){
        try{
            Statement st = connection.createStatement();
            st.execute("CREATE TABLE `students` (`id` int NOT NULL, `LastName` VARCHAR(50), `FirstName` VARCHAR(50), PRIMARY KEY (`id`));");
        }
        catch (SQLException e){
            System.out.println("table is already exist");;
        }
        try{
            Statement st = connection.createStatement();
            st.execute("CREATE TABLE `lectures` (`LastNameOfProfessor` VARCHAR(50), `Lecture` VARCHAR(50));");
        }
        catch (SQLException e){
            System.out.println("table is already exist");;
        }
        try{
            Statement st = connection.createStatement();
            st.execute("CREATE TABLE `register` (`Lecture` VARCHAR(50), `Date` DATE,`StudentLastName` VARCHAR(50));");
        }
        catch (SQLException e){
            System.out.println("table is already exist");;
        }
    }


}
