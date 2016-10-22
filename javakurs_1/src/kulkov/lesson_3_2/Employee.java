package kulkov.lesson_3_2;

import java.io.Serializable;

/**
 * Created by User on 19.10.2016.
 * Serializable class
 */
public class Employee implements Serializable {
    private String name;
    private String address;
    private transient int SSN;          //non-serializable field
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Employee(String name, String address, int SSN, int number) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }
}
