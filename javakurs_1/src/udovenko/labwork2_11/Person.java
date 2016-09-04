package udovenko.labwork2_11;

/**
 * Created by gladi on 02.09.2016.
 */
class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            throw new InvalidAgeException("Invalid age");
        }
    }
}
