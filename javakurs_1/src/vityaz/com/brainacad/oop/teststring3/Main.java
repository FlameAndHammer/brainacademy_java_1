package vityaz.com.brainacad.oop.teststring3;


public class Main {
    private static char[] uniqueChars(String string){
        StringBuilder tempString = new StringBuilder();
        int arrayCounter = 0;
        for(int i = 0; i < string.length(); i++){
            int counter = 0;
            for(int j = 0; j < string.length(); j++){
                if(string.charAt(i) == string.charAt(j)){
                    counter ++;
                    if(counter >= 2){
                        break;
                    }
                }
            }
            if(counter == 1 && string.charAt(i) != '\u0020'){
                arrayCounter ++;
                tempString.append(string.charAt(i));
            }
        }
        char[] result =  new char[arrayCounter];
        tempString.getChars(0, tempString.length(), result, 0);
        return result;
    }

    public static void main(String[] args){
        String string = "Using methods of class String";
        char[] array = Main.uniqueChars(string);
        for (char arrayElement:array) {
            System.out.print(arrayElement + " ");
        }
    }
}
