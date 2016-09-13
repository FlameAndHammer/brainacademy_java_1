package kulkov.lesson_2_11;

/**
 * Created by User on 04.09.2016.
 * Practice with throwing exception handling
 */
class Person {
    //Fields
    private String firstName;
    private String lastName;
    private int age;
    //Getters and Setters
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

    public void setAge(int age) throws InvalidAgeException {        //Throw exception handling to an upper class
        if (age > 1 && age < 120) {                                 //Make conditions
            this.age = age;
        }
        else {                                                      //If conditions not met, invoke exception
            throw new InvalidAgeException("InvalidAgeException: age should be between 1 and 120!");
        }
    }
}
