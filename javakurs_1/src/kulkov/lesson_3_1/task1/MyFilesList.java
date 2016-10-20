package kulkov.lesson_3_1.task1;

import java.io.*;
import java.util.Arrays;

/**
 * Created by User on 17.10.2016.
 * Practice with File class
 */
public class MyFilesList {
    public static void main(String[] args) {
        File file;                      //Declare File instance
        if (args.length == 0) {         //If there is no argument
            file = new File(".");       //Initialize the file by contents of the root folder
        } else {
            file = new File(args[0]);   //Else initialize it with contents of a specified location
        }
        System.out.println(Arrays.toString(file.list()));       //Print the file to the console as a list
    }
}
