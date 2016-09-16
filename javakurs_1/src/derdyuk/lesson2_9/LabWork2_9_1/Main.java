package derdyuk.lesson2_9.LabWork2_9_1;

/**
 * Created by maossi on 05.09.2016.
 */
public class Main {
    private static void reverseString(String myStr) {
        StringBuffer sb = new StringBuffer(myStr);
        sb.reverse();
        System.out.println(sb);

    }
    public static void main(String[]arg) {

        String myStr = "abracadabra";

        System.out.println("Index of ra is: "+ myStr.indexOf("ra"));
        System.out.println("Last index of ra is: "+ myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3,7));
        reverseString(myStr);







    }




}