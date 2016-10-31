package torba.jdbc.HomeTask_31_10_16;

import java.util.UUID;

public class Student {

    private String id;
    private String firstName, lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        id = UUID.randomUUID().toString();
    }

    public String toString() {
        return "student " + firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    public boolean equals(Object st) {
        if ( (firstName.equals(((Student) st).getFirstName())) && (lastName.equals(((Student) st).getLastName())) ) {
            return true;
        }
        else {
            return false;
        }
    }

}