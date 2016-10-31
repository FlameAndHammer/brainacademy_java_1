package torba.jdbc.HomeTask_31_10_16;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Student> students = new ArrayList<Student>();
    private static ArrayList<Lecture> lectures = new ArrayList<Lecture>();
    private static ArrayList<Register> registers = new ArrayList<Register>();
    private static Scanner scanner = new Scanner(System.in);

    private static String getString(String s) {
        String result = "";
        while (result.trim().equals("")) {
            System.out.print(s + ":");
            result = scanner.nextLine();
        }
        return result;
    }

    private static Date getDate(String s) {

        Date result = null;
        String str;
        String[] mas;
        Boolean fail;

        while (true) {
            fail = false;
            System.out.print(s + ":");
            str = scanner.nextLine();
            try {
                mas = str.split("\\D");
                if (mas[2].length() == 2) {mas[2] = "20" + mas[2];}
                result = new Date(Integer.valueOf(mas[2]) - 1900, Integer.valueOf(mas[1]) - 1, Integer.valueOf(mas[0]));
                if ( (result.getDay() == 6) || (result.getDay() == 0) ) {
                    System.out.println("There is no lectures on Saturday or Sunday.");
                    fail = true;
                }
            }
            catch (Exception e) {
                fail = true;
            }
            if (!fail) {break;}
        }

        return result;

    }

    private static void addStudent() {
        Student student = new Student(getString("First name"), getString("Last name"));
        if (students.indexOf(student) == -1) {
            students.add(student);
        }
    }

    private static void addLecture() {
        Lecture lecture = new Lecture(getString("Lecture name"), getString("Lecturer"));
        if (lectures.indexOf(lecture) == -1) {
            lectures.add(lecture);
        }
    }

    private static void addRegister() {
        Date date = getDate("Date");
        Lecture lecture = new Lecture(getString("Lecture name"), getString("Lecturer"));
        Student student = new Student(getString("First name"), getString("LastName"));
        Boolean fail = false;
        if (!students.contains(student)) {
            System.out.println(student + " hasn't found in students list.");
            fail = true;
        }
        if (!lectures.contains(lecture)) {
            System.out.println(lecture + " hasn't found in lectures list.");
            fail = true;
        }
        if (fail) {return;}
        student = students.get(students.indexOf(student));
        lecture = lectures.get(lectures.indexOf(lecture));
        Register register = new Register(date, lecture, student);
        if (registers.indexOf(register) == -1) {
            registers.add(register);
        }
    }

    private static void attendance() {
        java.util.Collections.sort(registers);
        for (Register r : registers) {
            System.out.println(r);
        }
    }

    public static void main(String[] args) {

        Connection conn;
        String choice;
        boolean exit = false;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "777");
        }
        catch (SQLException e) {
            System.out.println("Can't connect to the MySQL.");
            System.out.println(e.getMessage());
            return;
        }

        try (Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("SHOW DATABASES");
            Boolean existDatabase = false;
            while (rs.next()) {
                if (rs.getString("database").equals("studentsregistration")) {existDatabase = true;}
            }
            if (!existDatabase) {
                st.execute("CREATE SCHEMA `studentsRegistration`;");
                st.execute("USE `studentsregistration`;");
                st.execute("CREATE TABLE `students` (`id` VARCHAR(36) NOT NULL, `firstname` VARCHAR(50), " +
                           "`lastname` VARCHAR(50), PRIMARY KEY (`id`));");
                st.execute("CREATE TABLE `lectures` (`id` VARCHAR(36) NOT NULL, `name` VARCHAR(50), " +
                           "`lecturer` VARCHAR(50), PRIMARY KEY (`id`));");
                st.execute("CREATE TABLE `registers` (`id` VARCHAR(36) NOT NULL, `date` DATETIME, " +
                           "`lecture` VARCHAR(36), `student` VARCHAR(36), PRIMARY KEY (`id`));");
            }
            else {
                Date date;
                Student student;
                Lecture lecture;
                Register register;
                st.execute("USE `studentsregistration`;");
                rs = st.executeQuery("SELECT * FROM `students`;");
                while (rs.next()) {
                    student = new Student(rs.getString("firstName"), rs.getString("lastName"));
                    student.setId(rs.getString("id"));
                    students.add(student);
                }
                rs = st.executeQuery("SELECT * FROM `lectures`;");
                while (rs.next()) {
                    lecture = new Lecture(rs.getString("name"), rs.getString("lecturer"));
                    lecture.setId(rs.getString("id"));
                    lectures.add(lecture);
                }
                rs = st.executeQuery("SELECT r.*, s.id as stID, s.firstName, s.lastName, l.id as lectID, l.name, l.lecturer " +
                                     "FROM `registers` as r " +
                                     "LEFT JOIN `students` as s on r.student = s.id " +
                                     "LEFT JOIN `lectures` as l on r.lecture = l.id;");
                while (rs.next()) {
                    student = new Student(rs.getString("firstName"), rs.getString("lastName"));
                    student.setId(rs.getString("stID"));
                    lecture = new Lecture(rs.getString("name"), rs.getString("lecturer"));
                    lecture.setId(rs.getString("lectID"));
                    date = rs.getDate("date");
                    register = new Register(date, lecture, student);
                    register.setId(rs.getString("id"));
                    registers.add(register);
                }
            }
        }
        catch (SQLException e) {
            System.out.println("Can't check database existance/create database/read data from database.");
            System.out.println(e.getMessage());
        }

        while (!exit) {
            choice = getString("Operation(s - add student, l - add lecture, r - add register, a - attendance, exit - exit)");
            switch (choice) {
                case "s": addStudent(); break;
                case "l": addLecture(); break;
                case "r": addRegister(); break;
                case "a": attendance(); break;
                case "exit": exit = true;
            }
        }

        try (Statement st = conn.createStatement()) {
            st.execute("DELETE FROM `lectures`;");
            st.execute("DELETE FROM `students`;");
            st.execute("DELETE FROM `registers`;");
            for (Student student : students) {
                st.execute("INSERT `students` (`id`, `firstname`, `lastname`) VALUES ("
                           + "'" + student.getId() + "', "
                           + "'" + student.getFirstName() + "', "
                           + "'" + student.getLastName() + "');");
            }
            for (Lecture lecture : lectures) {
                st.execute("INSERT `lectures` (`id`, `name`, `lecturer`) VALUES ("
                        + "'" + lecture.getId() + "', "
                        + "'" + lecture.getName() + "', "
                        + "'" + lecture.getLecturer() + "');");
            }
            for (Register register : registers) {
                st.execute("INSERT `registers` (`id`, `date`, `lecture`, `student`) VALUES ("
                        + "'" + register.getId() + "', "
                        + "'" + register.getDate() + "', "
                        + "'" + register.getLecture().getId() + "', "
                        + "'" + register.getStudent().getId() + "');");
            }
        }
        catch (SQLException e) {
            System.out.println("Can't write data to the database.");
            System.out.println(e.getMessage());
            return;
        }

        try {
            conn.close();
        }
        catch (SQLException e) {
            System.out.println("Can't close the connection to the database");
            System.out.println(e.getMessage());
        }
    }

}
