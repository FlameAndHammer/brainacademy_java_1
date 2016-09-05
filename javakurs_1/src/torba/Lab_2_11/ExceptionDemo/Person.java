package torba.Lab_2_11.ExceptionDemo;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        if ( (age < 1) || (age > 120) ) {
            throw new InvalidAgeException("Age is less, than 1 or is bigger than 120");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
