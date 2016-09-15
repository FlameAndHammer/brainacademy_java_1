package udovenko.labwork29;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by gladi on 04.09.2016.
 */
public class TestString {
    //lab Work 2-9-1
    private static String reversString(String s) throws IndexOutOfBoundsException{
        int length = s.length();
        int index = length - 1;
        char[] chars = new char[length];
        for (int i = 0; i < length; i++){
            s.getChars(index, index + 1, chars, i);
            index--;
        }
        return new String(chars);
    }

    //Lab Work 2-9-3
    private static char[] uniqueString(String s){
        s = s.toLowerCase();

        //Create grid for unique char
        int lenString = s.length();
        boolean[] grid = new boolean[lenString];
        Arrays.fill(grid, true);
        for (int i = 0; i < lenString; i++){
            if(grid[i]){
                char baseChar = s.charAt(i);
                if (!(Character.isAlphabetic(baseChar) || Character.isDigit(baseChar))){
                    grid[i] = false;
                }
                int pointer = i + 1;
                while (pointer < lenString){
                    if (baseChar == s.charAt(pointer)){
                        grid[pointer] = false;
                    }
                    pointer++;
                }
            }
        }

        //Count uniques chars;
        int countUniq = 0;
        for (boolean element: grid){
            if (element)
                countUniq++;
        }

        //Create array of unique chars
        char[] uniqueChars = new char[countUniq];
        int index = 0;
        for (int i = 0; i < lenString; i++){
            if (grid[i]){
                s.getChars(i, i+1, uniqueChars, index);
                index++;
            }
        }
        return uniqueChars;
    }

    //Lab Work 2-9-5
    private static boolean checkPersonWithRegExp(String userNameString){
        if (userNameString.matches("^\\p{Upper}\\p{Lower}+")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //Lab Work 2-9-1
        String myStr = "abracadabra";
        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        try {
            System.out.println(new String(myStr.substring(3, 8)));
        }catch (StringIndexOutOfBoundsException siobe) {
            System.out.println("Invalid indexes of substring");
        }
        System.out.println(reversString(myStr));

        //Lab Work 2-9-2
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        char[] chars1 = myStr1.toLowerCase().toCharArray();
        for (char element: chars1){
            if (myStr2.toLowerCase().indexOf(element) == -1){
                System.out.println(element);
            }
        }

        //Lab Work 2-9-3
        System.out.println(uniqueString("Using methods of class String"));

        //Lab Work 2-9-4
        String myStr3 = "This is String, split by StringTokenizer. Created by Student:Udovenko";
        StringTokenizer space = new StringTokenizer(myStr3, " ,.");
        while (space.hasMoreTokens()){
            System.out.println(space.nextToken());
        }

        //Lab Work 2-9-5
        String[] myStr4 = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat"," "};
        for (String element: myStr4){
            System.out.println(element + ": " + checkPersonWithRegExp(element));
        }
    }
}
