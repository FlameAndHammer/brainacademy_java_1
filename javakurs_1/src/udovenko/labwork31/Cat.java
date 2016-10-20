package udovenko.labwork31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by gladi on 17.10.2016.
 */
public class Cat {
    public static void main(String[] args) {
        File fileInput;
        if (args.length != 0){
            fileInput = new File(args[0]);
            if (!fileInput.exists() || !args[0].contains(".")){
                System.out.println("File not found");
                return;
            }
        }else {
            System.out.println("Input must have name of file");
            return;
        }

        try(BufferedReader br = new BufferedReader(new FileReader(fileInput))){
            while (br.read() != -1){
                System.out.println(br.readLine());
            }
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
