package tretiak.labworks.work4.ExceptionDemo;


public class Main {
    public static void main(String[] arg){
        try {
            Person person = new Person();
            person.setAge(220);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
