package _nikulin.labs.lesson_3_1.task1;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Александр on 17.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new String(args[0]));
        File file = null;
        if (args.length > 0){
            file = new File(args[0]);
        } else {
            file = new File("./javakurs_1/src/_nikulin/labs");
        }
        if (file.exists()) {
            System.out.println(Arrays.toString(file.list()));
        }
    }
}
