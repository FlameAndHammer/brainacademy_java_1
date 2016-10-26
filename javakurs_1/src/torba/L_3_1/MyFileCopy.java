package torba.L_3_1;

import java.io.*;

public class MyFileCopy {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File f1 = new File(args[0]);
        File f2 = new File(args[1]);

        if (!f2.exists()) {f2.createNewFile();}

        InputStreamReader in = new InputStreamReader( new FileInputStream(f1));
        OutputStreamWriter out = new OutputStreamWriter( new FileOutputStream(f2));

        int r;
        while ((r = in.read()) !=-1) {
            out.write(r);
        }

    }

}
