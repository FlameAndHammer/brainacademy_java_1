package udovenko.labwork2_11;

/**
 * Created by gladi on 31.08.2016.
 */
public class MyException extends Exception {
    private String s;

    public MyException(String s){
        this.s = s;
    }

    public void outMessage(){
        System.out.println(s);
    }
}