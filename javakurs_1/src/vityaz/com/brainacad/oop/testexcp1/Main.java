package vityaz.com.brainacad.oop.testexcp1;


public class Main {
    public static void main(String[]args){
        try{
            Person person = new Person();
            person.setFirstName("Billy");
            person.setLastName("Bons");
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
            person.setAge(130);
            System.out.println(person.getAge());
        }
        catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
