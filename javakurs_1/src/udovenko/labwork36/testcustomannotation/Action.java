package udovenko.labwork36.testcustomannotation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.WRITE;

/**
 * Created by gladi on 09.11.2016.
 */
class Action {
    private static final File FILE = new File("javakurs_1/src/udovenko/labwork36/testcustomannotation/test.txt");
    @MyPermission(PermissionAction.USER_WRITE)
    public void write(User user, String str){
        try {
            PermissionAction param = this.getClass().getMethod("write", User.class, String.class).
                    getAnnotation(MyPermission.class).value();

            if (user != null && user.getPermissions().contains(param)){
                writeToFile(str);
            }else {
                System.out.println(user + " can't write to file");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    private void writeToFile(String string){
        try {
            FILE.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = Files.newBufferedWriter(FILE.toPath(), WRITE ,APPEND)){
            bw.write(string, 0, string.length());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @MyPermission(PermissionAction.USER_READ)
    public void read(User user){
        try {
            PermissionAction param = this.getClass().getMethod("read", User.class).
                    getAnnotation(MyPermission.class).value();

            if (user != null && user.getPermissions().contains(param)){
                System.out.println(readFromFile());
            }else {
                System.out.println(user + " can't read from file");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    private String readFromFile(){
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        try {
            FILE.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = Files.newBufferedReader(FILE.toPath())){
            while ((line = br.readLine()) != null){
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
