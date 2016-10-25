package udovenko.labwork32;

import java.io.Serializable;

/**
 * Created by gladi on 25.10.2016.
 */
class Employee implements Serializable {
    public static final long serialversionUID = 1L;
    private String name;
    private String address;
    private transient int SSN;
    private int number;

    public Employee(String name, String address, int SSN, int number) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }

    @Override
    public String toString(){
        return name + ' ' + address + ' ' + SSN + ' ' + number;
    }
}
