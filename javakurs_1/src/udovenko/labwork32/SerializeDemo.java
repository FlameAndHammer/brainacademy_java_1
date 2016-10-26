package udovenko.labwork32;

import java.io.*;

/**
 * Created by gladi on 25.10.2016.
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Employee em = new Employee("Ivan", "Odesa", 123456, 1);
        File file = new File("javakurs_1/src/udovenko/labwork32/employee.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(em);
        }catch (FileNotFoundException fnf){
            fnf.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
