package shevchenko.labworks3_1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Write a class called MyFileCopy whose main(String[] args)
 * method copies one file (could be binary!) to another (args[0] to args[1]).
 */
public class MyFileCopy {
    public  static void main(String[] argv) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream(argv[0]);
            out = new FileOutputStream(argv[1]);
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        }
        finally {
            if(in != null)
                in.close();
            if(out != null)
                out.close();
        }
    }
}