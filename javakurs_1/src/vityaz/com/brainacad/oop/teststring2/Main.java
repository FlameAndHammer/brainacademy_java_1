package vityaz.com.brainacad.oop.teststring2;


public class Main {
    public static void main(String[] args){
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        String tempMyStr1 = myStr1.toLowerCase();
        String tempMyStr2 = myStr2.toLowerCase();

        for(int i = 0; i < tempMyStr1.length(); i++){
            int counter = 0;
            for (int j = 0; j < tempMyStr2.length(); j++){
                if(tempMyStr1.charAt(i) == tempMyStr2.charAt(j)) {
                    counter++;
                    break;
                }
            }
            if(counter == 0){
                System.out.print(myStr1.charAt(i) + " ");
            }
        }
    }
}
