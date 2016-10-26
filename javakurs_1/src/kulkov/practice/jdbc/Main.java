package kulkov.practice.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 26.10.2016.
 * Java Database Connectivity. Creating statements
 */
class Main {
    private static List<Employee> temp = new ArrayList<Employee>();

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("../db_config.txt"))) {  //database, user, password
            try (Connection conn = DriverManager.getConnection(in.readLine(), in.readLine(), in.readLine())){
                try (Statement st = conn.createStatement()) {
                    st.execute("SELECT * FROM employee");                                   //query #1
                    ResultSet rs = st.getResultSet();
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String firstName = rs.getString("firstName");
                        String lastName = rs.getString("lastName");
                        int age = rs.getInt("age");
                        Date birthday = rs.getDate("birthday");
                        int department = rs.getInt("department");
                        int position = rs.getInt("position");
                        temp.add(new Employee(id, firstName, lastName, age, birthday, department, position));
                        System.out.printf("%d %s %s %d %s %d %d\n",
                                id, firstName, lastName, age, birthday, department, position);
                    }
                    st.execute("CREATE TABLE `myfirstschema`.`newemployee` (\n" +
                            "  `id` INT NOT NULL,\n" +
                            "  `firstName` VARCHAR(45) NULL,\n" +
                            "  `lastName` VARCHAR(45) NULL,\n" +
                            "  `age` INT NULL,\n" +
                            "  `birthday` DATETIME,\n" +
                            "  `department` int,\n" +
                            "  `position` int,\n" +
                            "  PRIMARY KEY (`id`),\n" +
                            "  UNIQUE INDEX `id_UNIQUE` (`id` ASC));");                     //query #2
                    for (Employee emp : temp) {
                        System.out.println(emp.toString());
                        st.execute("INSERT `myfirstschema`.`newemployee` (`id`,`firstName`,`lastName`,`age`,`birthday`,`department`,`position`)\n" +
                                "VALUES ( " + emp.getId() + ", '" + emp.getFirstName() + "', '" + emp.getLastName() + "', " + emp.getAge() +
                                ", '" + emp.getBirthday() + "', " + emp.getDepartment() + ", " + emp.getPosition() + ");");         //query #3
                    }
                } catch (SQLException e) {                                                  //Statement executing problems
                    e.printStackTrace();
                }
            } catch (SQLException e) {                                                      //Connectivity problems
                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();
            }
        } catch (IOException e) {                                                           //Configuration problems
            e.printStackTrace();
        }
    }
}
