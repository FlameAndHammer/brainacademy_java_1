package udovenko.labwork31;

import java.io.*;
import java.util.Arrays;

/**
 * Created by gladi on 17.10.2016.
 */
public class MyFilesList {
    public static void main(String[] args) {
        File pathIn;
        if (args.length > 0 && new File(args[0]).exists()){
            pathIn = new File(args[0]);
            if (!pathIn.exists()){
                pathIn.mkdirs();
            }
        } else {
            pathIn = new File("javakurs_1/src/udovenko");
        }

//      It is not in the task. I wanted to organize the output to a file in the old school style.
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new BufferedOutputStream(new
                    FileOutputStream("javakurs_1/src/udovenko/list.txt")));
            for (String el: pathIn.list()){
                out.writeChars(el + '\n');

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
