package vityaz.com.brainacad.oop.teststring1;


public class Main {
    public static void main(String[]args){
        String myStr = "abracadabra";
        System.out.println("index of first \"ra\" is " + myStr.indexOf("ra"));
        System.out.println("index of last \"ra\" is " + myStr.lastIndexOf("ra"));
        System.out.println("substring from 3 to 7 index is " + myStr.substring(3, 7));
        System.out.println(Main.reverseString(myStr));
    }

    private static String reverseString(String string){
        StringBuilder tempString = new StringBuilder();
        for( int i = string.length() - 1; i >= 0; i--){
            tempString.append(string.charAt(i));
        }
        return new String (tempString);
    }
}
