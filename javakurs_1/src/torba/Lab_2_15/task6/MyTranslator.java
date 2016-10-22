package torba.Lab_2_15.task6;

import java.util.HashMap;

public class MyTranslator {

    private HashMap<String, String> dictionary = new HashMap<>();

    public void addNewWord(String eng, String rus) {
        dictionary.put(eng, rus);
    }

    public String translate(String eng) {
        String result = "";
        String[] mas;
        mas = eng.split(" ");
        for (String engl : mas) {
            String rus = dictionary.get(engl);
            result = result + rus+" ";
        }
        return result;
    }

}
