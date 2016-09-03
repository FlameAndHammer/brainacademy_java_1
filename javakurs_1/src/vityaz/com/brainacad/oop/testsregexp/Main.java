package vityaz.com.brainacad.oop.testsregexp;


import java.util.regex.*;

public class Main {
    private static boolean checkPersonWithRegExp(String string){
        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static void main(String[] args){
        String[] array = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String arrayElement:array) {
            System.out.println(Main.checkPersonWithRegExp(arrayElement));
        }
    }
}
