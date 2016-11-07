package shevchenko.homework_jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by ПК on 04.11.2016.
 */
class Register {
    private String date;
    private String lecture;
    protected ArrayList<Student> arrOfPresentStudents = new ArrayList<Student>();
    protected static ArrayList<Register> arrRegister = new ArrayList<Register>();

    protected Register(String lecture, String date) {
        this.date = date;
        this.lecture = lecture;
        boolean flag = true;
        for (int i = 0; i < arrRegister.size(); i++) {
            if ((arrRegister.get(i).getLecture().equals(lecture)) && (arrRegister.get(i).getDate().equals(date))) {
                flag = false;
            }
        }
        if (flag) {
            arrRegister.add(this);
        }
    }

    protected void setDate(String date) {
        this.date = date;
    }

    protected void setLecture(String lecture) {
        this.lecture = lecture;
    }

    protected String getDate() {
        return date;
    }

    protected String getLecture() {
        return lecture;
    }

    protected static void createPresentInDB(String lecture, String dates, ArrayList<String> arrPresentStudents) {
        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
        Date parsed = null;
        try {
            parsed = format.parse(dates);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
        String name = "INSERT INTO register" + "(Lecture,Date,StudentLastName)" + "VALUES(?,?,?);";
        for (int i = 0; i < arrPresentStudents.size(); i++) {
            try (PreparedStatement ps = ConectDataBase.getInstConectDB().connection.prepareStatement(name)) {
                ps.setString(1, lecture);
                ps.setDate(2, sql);
                ps.setString(3, arrPresentStudents.get(i));
                ps.executeUpdate();
                System.out.println("insert ok!!!!!!!");
            } catch (SQLException e) {
                System.out.println("cancel");
            }
        }
    }

    protected static boolean isExistLecture(String lecture, String dates) {
        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
        boolean flag = false;
        Date parsed = null;
        try {
            parsed = format.parse(dates);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
        String str = "Select distinct Lecture,Date from register\n" +
                "where Lecture = '" + lecture + "' and Date = '" + sql + "'";
        try (Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
            st.execute((str));
            ResultSet rs = st.getResultSet();
            flag = rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;

    }


    protected static void checkPresenStudents(String nameOfLecture, String date) {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
        String name = "INSERT INTO register" + "(Lecture,Date,StudentLastName)" + "VALUES(?,?,?);";
        Date parsed = null;
        try {
            parsed = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
        Student.makeArrOfStudentsFromDB();
        for (int i = 0; i < Student.arrAllStudents.size(); i++) {
            System.out.println(Student.arrAllStudents.get(i).getLastName() + " " + Student.arrAllStudents.get(i).getFirstName());
            System.out.println("If this student doesn`t present on this lecture please insert 0");
            int present = scan.nextInt();
            if (present != 0) {
                try (PreparedStatement ps = ConectDataBase.getInstConectDB().connection.prepareStatement(name)) {
                    ps.setString(1, nameOfLecture);
                    ps.setDate(2, sql);
                    ps.setString(3, Student.arrAllStudents.get(i).getLastName());
                    ps.executeUpdate();
                    System.out.println("insert ok!!!!!!!");
                } catch (SQLException e) {
                    System.out.println("cancel");
                }
            }
        }
    }

    protected static void addRegisterToDB(String nameOfLecture, String date) {
        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
        Date parsed = null;
        try {
            parsed = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
        ArrayList<String> arrAllStud = new ArrayList<>();
        if (!isExistLecture(nameOfLecture, date)) {
            try (Statement st = ConectDataBase.getInstConectDB().connection.createStatement()) {
                st.execute(("SELECT * FROM students"));
                ResultSet rs = st.getResultSet();
                while (rs.next()) {
                    String lastName = rs.getString("LastName");
                    arrAllStud.add(lastName);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String name = "INSERT INTO register" + "(Lecture,Date,StudentLastName)" + "VALUES(?,?,?);";
            for (int i = 0; i < arrAllStud.size(); i++) {
                try (PreparedStatement ps = ConectDataBase.getInstConectDB().connection.prepareStatement(name)) {
                    ps.setString(1, nameOfLecture);
                    ps.setDate(2, sql);
                    ps.setString(3, arrAllStud.get(i));
                    ps.executeUpdate();
                } catch (SQLException e) {
                    System.out.println("cancel");
                }
            }
        }
    }
}


