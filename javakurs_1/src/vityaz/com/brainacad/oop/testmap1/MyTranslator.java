package vityaz.com.brainacad.oop.testmap1;


import java.util.HashMap;


public class MyTranslator {
    HashMap<String, String> map = new HashMap<>();

    public void addNewWord(String en, String ru){
        map.put(en, ru);
    }

    public String translate(String en){
        return map.get(en);
    }
}
