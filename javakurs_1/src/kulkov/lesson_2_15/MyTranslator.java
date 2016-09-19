package kulkov.lesson_2_15;

import java.util.HashMap;

/**
 * Created by User on 19.09.2016.
 * Practice with HashMap
 */
public class MyTranslator {
    private HashMap<String,String> dictionary = new HashMap<String,String>();   //Initialize hash map

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);                                                 //Put the word and its translation to the hash map
    }

    public StringBuilder translate(String en) {                                 //Return translation of a line
        String[] words = en.split("\\W");                                       //Split the line into array of words
        StringBuilder sb = new StringBuilder(en.length());                      //Initialize StringBuilder with the initial length of original line
        for (String word : words) {                                             //For each word in array find its translation in the dictionary hash map
            sb.append(dictionary.get(word)).append(" ");                        //And add the translation to string builder
        }
        return sb;
    }
}
