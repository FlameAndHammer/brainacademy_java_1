package torba.Lab_3_2.Task_3_2_1;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String adress;
    private int SSN;
    private int number;

    public void setName(String name) {this.name = name;}
    public void setAdress(String adress) {this.adress = adress;}
    public void setSSN(int SSN) {this.SSN = SSN;}
    public void setNumber(int number) {this.number = number;}

    public String getName() {return name;}
    public String getAdress() {return adress;}
    public int getSSN() {return SSN;}
    public int getNumber() {return number;}

    public String toString() {
        return "name: " + name + " adress: " + adress + " SSN: " + SSN + " number: " + number;
    }

    public Employee(String name, String adress, int SSN, int number) {
        this.name = name;
        this.adress = adress;
        this.SSN = SSN;
        this.number = number;
    }

}
