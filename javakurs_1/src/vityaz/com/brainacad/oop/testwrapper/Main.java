package vityaz.com.brainacad.oop.testwrapper;


public class Main {
    public static void main(String[] args){
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = Integer.valueOf(10);
        Integer x4 = Integer.parseInt("10");

        Integer [] arrOfIntLower = {x1, x2, x3, x4};
        Main.compareArray(arrOfIntLower);

        System.out.println();

        Integer y1 = 150;
        Integer y2 = new Integer(150);
        Integer y3 = Integer.valueOf(150);
        Integer y4 = Integer.parseInt("150");

        Integer [] arrOfIntHigher = {y1, y2, y3, y4};
        Main.compareArray(arrOfIntHigher);

    }

    public static void compareArray(Integer[] array){
        for (int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                System.out.println((i+1) + "==" + (j+1) + " result is " + (array[i] == array[j]));
                System.out.println((i+1) + ".equals(" + (j+1) + ")" + "result is " + array[i].equals(array[j]));
            }
            System.out.println();
        }
    }
}
