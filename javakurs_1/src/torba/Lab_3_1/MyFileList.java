package torba.Lab_3_1;

import java.io.File;

public class MyFileList {

    public static void main(String[] args) {

        if (args.length == 0) {
            File f = new File(".");
            System.out.println(f.getAbsolutePath());
            String[] names = f.list();
            for (String el : names) {
                System.out.println(el);
            }
        }
        else {
            File f = new File(args[0]);
            System.out.println(f.getAbsolutePath());
            String[] names = f.list();
            for (String el : names) {
                System.out.println(el);
            }
        }
    }

}
