package udovenko.labwork32;

import java.io.*;

/**
 * Created by gladi on 25.10.2016.
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        File file = new File("javakurs_1/src/udovenko/labwork32/employee.ser");
        Employee emp = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            emp = (Employee)ois.readObject();
        }catch (FileNotFoundException fnf){
            fnf.printStackTrace();
        }catch (ClassNotFoundException cnf){
            cnf.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(emp);
    }
}
