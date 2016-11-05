package torba.Lab_3_1;

import java.io.File;
import java.io.*;

public class Cat {

    public static void main(String[] args) throws java.io.FileNotFoundException, java.io.IOException {

        File f = new File("D:\\T.txt");

        BufferedReader bf = new BufferedReader(new InputStreamReader( new FileInputStream(f), "cp1251"));

        String s;
        while ((s = bf.readLine()) != null) {
            System.out.println(s);
        }


    }

}
