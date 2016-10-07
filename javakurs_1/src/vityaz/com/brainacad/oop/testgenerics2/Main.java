package vityaz.com.brainacad.oop.testgenerics2;



public class Main {
    public static void main(String[] args) {
        Integer []arrayInteger = new Integer[10];
        Double []arrayDouble = new Double[10];
        for(int i = 0; i < arrayInteger.length; i++){
            arrayInteger[i] = i;
        }
        for(int i = 0; i < arrayDouble.length; i++){
            arrayDouble[i] = (double)i;
        }
        for (Integer element:arrayInteger) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("quantity of elements more than " + arrayInteger[4] + " is " +
                MyTestMethod.calcNum(arrayInteger, arrayInteger[4]));

        System.out.println();
        System.out.println("sum of elements  more than " + arrayInteger[3] + " is " +
                MyTestMethod.calcSum(arrayInteger, arrayInteger[3]));

        System.out.println();
        for (Double element:arrayDouble) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("quantity of elements more than " + arrayDouble[2] + " is " +
                MyTestMethod.calcNum(arrayDouble, arrayDouble[2]));

        System.out.println();
        System.out.println("sum of elements  more than " + arrayDouble[2] + " is " +
                MyTestMethod.calcSum(arrayDouble, arrayDouble[2]));
    }
}
