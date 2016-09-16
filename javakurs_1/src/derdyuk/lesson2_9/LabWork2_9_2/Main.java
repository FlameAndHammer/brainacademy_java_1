package derdyuk.lesson2_9.LabWork2_9_2;

/**
 * Created by maossi on 11.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        char[] char1 = myStr1.toLowerCase().toCharArray();
        for (char element : char1) {
                if (myStr2.toLowerCase().indexOf(element) == -1) {
                    System.out.print(element);
                }
            }

        }
    }
