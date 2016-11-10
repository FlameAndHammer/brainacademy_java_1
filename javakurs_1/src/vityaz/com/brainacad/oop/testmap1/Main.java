package vityaz.com.brainacad.oop.testmap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 27.10.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("London", "Лондон");
        myTranslator.addNewWord("capital", "столица");
        myTranslator.addNewWord("is", "есть");
        myTranslator.addNewWord("Great", "Великий");
        myTranslator.addNewWord("Britain", "Британия");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        System.out.println(myTranslator.translate(str));
        
    }
}
