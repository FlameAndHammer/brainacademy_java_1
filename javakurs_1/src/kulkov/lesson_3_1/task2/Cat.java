package kulkov.lesson_3_1.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by User on 17.10.2016.
 * Practice with Character streams
 */
class Cat {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(     //Wrap the FileReader with BufferedReader to get file content line-by-line
                new FileReader("./javakurs_1/src/kulkov/lesson_3_1/some.txt"))) {
            String temp;                                //Declare string variable
            while ((temp = in.readLine()) != null) {    //Initialize it in the loop and check it for content before each iteration
                System.out.println(temp);               //Print each line to the console
            }
        } catch (IOException e) {
            e.printStackTrace();                        //In case of some error throw an input/output exception
        }
    }
}
