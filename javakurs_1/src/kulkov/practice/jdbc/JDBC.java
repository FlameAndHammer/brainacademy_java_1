package kulkov.practice.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Александр on 26.10.2016.
 * Java Database Connectivity. Getting connection
 */
class JDBC {
    public static void main(String[] args) {
        /*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }*/
        try (BufferedReader in = new BufferedReader(new FileReader("../db_config.txt"))) {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(in.readLine(), in.readLine(), in.readLine());
            } catch (SQLException e) {
                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();
                return;
            }

            if (conn != null) {
                System.out.println("You made it, take control your database now!");
            } else {
                System.out.println("Failed to make connection!");
            }

            try {
                conn.close();
            } catch (SQLException | NullPointerException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
