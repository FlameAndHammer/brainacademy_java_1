package kulkov.lesson_3_1.task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by User on 17.10.2016.
 * Practice with Byte streams
 */
public class MyFileCopy {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream(args[0]);         //Initialize input and output streams by the program arguments
             FileOutputStream out = new FileOutputStream(args[1])) {    //To avoid resource leak "try with resources" mechanism
            int temp;                                                   //Declare integer to store file bytes there
            while ((temp = in.read()) != -1) {                          //Initialize it with the next number and check for EOF before each iteration
                out.write(temp);                                        //Write each value to a specified file by output stream
            }
            String path = ".+/|.+\\\\";                                 //Create regular expression of the files path
            System.out.printf("File \"%s\" has been successfully copied to \"%s\"",
                    args[0].replaceFirst(path, ""),
                    args[1].replaceFirst(path, ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
