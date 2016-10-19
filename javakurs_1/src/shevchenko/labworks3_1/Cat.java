package shevchenko.labworks3_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *Write a class called Cat whose main(String[] args) method reads all the text from the file mentioned
 * on the command-line (args[0]) line-by-line and prints it to standard out.
 */
public class Cat {
    public static void main(String[] argv) {
        try(FileInputStream input = new FileInputStream(argv[0])){
            int data = input.read();
            while (data != -1){
                System.out.print((char)data);
                data = input.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
