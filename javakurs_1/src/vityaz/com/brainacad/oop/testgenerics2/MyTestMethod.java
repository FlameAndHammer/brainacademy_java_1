package vityaz.com.brainacad.oop.testgenerics2;



public class MyTestMethod{



    static <T extends Number> int calcNum (T []array, T maxelem){
        int count = 0;
        for (T arrayElement:array) {
            if (arrayElement.doubleValue() > maxelem.doubleValue()) {
                count++;
            }
        }
        return count;
    }

    static <T extends Number> T calcSum (T []array, T maxelem){
        Double sum = 0.0;
        for (T arrayElement:array){
            if(arrayElement.doubleValue() > maxelem.doubleValue()){
                sum +=arrayElement.doubleValue();
            }
        }
        return (T) sum;
    }
}