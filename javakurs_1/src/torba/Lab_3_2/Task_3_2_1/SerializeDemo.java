package torba.Lab_3_2.Task_3_2_1;

import java.io.*;

public class SerializeDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Employee emp1 = new Employee("Alex", "Odessa", 12345678, 1);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Employee.ser"));
        try {
            oos.writeObject(emp1);
        }
        finally {
            oos.close();
        }

        Employee emp2;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Employee.ser"));
        try {
            emp2 = (Employee) ois.readObject();
            System.out.println(emp2.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }


    }

}
