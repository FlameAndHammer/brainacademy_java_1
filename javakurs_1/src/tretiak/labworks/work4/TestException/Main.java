package tretiak.labworks.work4.TestException;


public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Str");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
        }
    }
}
