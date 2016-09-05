package tretiak.labworks.work4.ExceptionDemo;


public class Person {
    private int age;
    private String firstName;
    private String lastName;
    public Person (){
    }
    public void setAge(int a){
        if (a > 120 || a < 1){
            throw new InvalidAgeException("Invalid age");
        }
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String s){
        firstName = s;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String s){
        lastName = s;
    }
    public String getLastName(){
        return lastName;
    }


}
