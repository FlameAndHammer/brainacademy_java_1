package udovenko.practice.jdbc;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by gladi on 26.10.2016.
 */
class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Date birthday;

    public Employee(int id, String firstName, String lastName, int age, Date birthday) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return String.format("\n%d, %s, %s, %d, %te/%tm/%ty", id, firstName, lastName, age, birthday, birthday, birthday);
    }

    public static void main(String[] args) {
        Database db = new Database("jdbc:mysql://localhost:3306/myfirstschema?useSSL=false", "root", "123456");
        db.connect();
        ArrayList<Employee> employees = new ArrayList<>();
        try (Statement st = db.getConn().createStatement()){
            st.execute("SELECT * FROM employee");
            ResultSet rs = st.getResultSet();
            while (rs.next()){
                int id = rs.getInt("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                int age = rs.getInt("age");
                Date birthday = rs.getDate("birthday");
                employees.add(new Employee(id, firstName, lastName, age, birthday));
            }
            System.out.println(employees);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Change name one of employees
        Employee chEmployee = employees.get(2);
        chEmployee.firstName = "Alexandr";
        System.out.print("Name from employees");
        System.out.println(chEmployee);

        //Load change in database
        try (Statement st = db.getConn().createStatement()){
            String str = String.format("UPDATE employee SET firstName = '%s' WHERE id = %d",
                            chEmployee.firstName, chEmployee.id);
            st.executeUpdate(str);
            ResultSet rst = st.executeQuery(String.format("SELECT * FROM employee WHERE id = %d", chEmployee.id));
            rst.first();
            System.out.println("Name from database");
            System.out.printf("%d, %s, %s, %d, %s", rst.getInt("id"), rst.getString("firstName"),
                    rst.getString("lastName"), rst.getInt("age"), rst.getDate("birthday"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        db.close();
    }
}
