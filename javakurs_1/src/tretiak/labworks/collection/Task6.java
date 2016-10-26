package tretiak.labworks.collection;

/**
 * Created by Maksim on 26.10.2016.
 */
public class Task6 {
    public static void main(String[] args){
        MyTranslator translator = new MyTranslator();
        translator.addNewWord("cat", "кот");
        translator.addNewWord("caught", "словил");
        translator.addNewWord("mouse", "мышь");
        System.out.println(translator.translateToRussian("cat"));
        System.out.println(translator.translateStringToRussian("cat caught mouse"));
    }
}
