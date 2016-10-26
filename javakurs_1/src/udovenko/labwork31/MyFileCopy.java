package udovenko.labwork31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by gladi on 20.10.2016.
 */
public class MyFileCopy {
    public static void main(String[] args) {
        File fileIn;
        File fileOut;
        if (args.length > 1){
            fileIn = new File(args[0]);
            fileOut = new File(args[1]);
            if (!fileIn.exists() || !args[0].contains(".")){
                System.out.println("Input file not found");
                return;
            }
        }else {
            System.out.println("Input must have names of files");
            return;
        }

        try (FileInputStream in = new FileInputStream(fileIn); FileOutputStream out = new FileOutputStream(fileOut)){
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
