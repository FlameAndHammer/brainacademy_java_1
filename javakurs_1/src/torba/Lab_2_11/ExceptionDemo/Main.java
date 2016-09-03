package torba.Lab_2_11.ExceptionDemo;

public class Main {

    public static void main(String[] args) {

        try {
            Person person = new Person();
            person.setAge(150);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
