package tretiak.labworks.collection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Maksim on 26.10.2016.
 */
public class MyTranslator {
    private HashMap<String, String> dictionary = new HashMap<>();                 //It's our mini-dictionary
    private ArrayList<String> translateOfString = new ArrayList<>();
    public void addNewWord(String en, String ru){               //This method add word for our dictionary, it's use key
        dictionary.put(en, ru);                                 //(english word) and value(russian word)
    }
    public String translateToRussian(String en){
        return dictionary.get(en);
    }
    public StringBuilder translateStringToRussian(String en){
         String[] strings = en.split("\\W");
         StringBuilder str = new StringBuilder(en.length());
         for(int i = 0; i < strings.length; i++){
             strings[i] = translateToRussian(strings[i]);
             str.append(strings[i]+" ");
         }
         return str;
    }
}
