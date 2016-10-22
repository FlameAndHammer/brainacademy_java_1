package torba.Lab_2_15.task6;

public class Main {

    public static void main(String[] args) {

        MyTranslator mt = new MyTranslator();
        mt.addNewWord("cat", "кот");
        mt.addNewWord("caught", "поймал");
        mt.addNewWord("mouse", "мышь");
        System.out.println(mt.translate("cat caught mouse"));
    }


}
