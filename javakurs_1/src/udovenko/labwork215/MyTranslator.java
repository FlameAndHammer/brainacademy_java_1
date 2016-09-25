package udovenko.labwork215;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gladi on 20.09.2016.
 */
class MyTranslator {
    private Map<String, String> dictionary = new HashMap<String, String>();

    public void addNewWorld(String en, String ru){
        dictionary.put(en, ru);
    }

    public String Translate(String en){
        String[] arrString = en.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String el: arrString){
            sb.append(dictionary.get(el) + " ");
        }
        return sb.toString();
    }
}
