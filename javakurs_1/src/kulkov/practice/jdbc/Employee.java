package kulkov.practice.jdbc;

import java.util.Date;

/**
 * Created by User on 26.10.2016.
 * Table
 */
class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Date birthday;
    private int department;
    private int position;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getDepartment() {
        return department;
    }

    public int getPosition() {
        return position;
    }

    public Employee() {

    }

    public Employee (int id, String firstName, String lastName,
                     int age, Date birthday, int department, int position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.department = department;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", department=" + department +
                ", position=" + position +
                '}';
    }
}
