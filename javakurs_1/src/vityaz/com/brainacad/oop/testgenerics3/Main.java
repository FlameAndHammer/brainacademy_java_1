package vityaz.com.brainacad.oop.testgenerics3;


public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9};
        String[] stringArray = {"one", "two", "three", "four", "five", "six"};
        MyMixer <Integer> myMixer1 = new MyMixer<>(intArray);
        MyMixer <String> myMixer2 = new MyMixer<>(stringArray);
        System.out.println(myMixer1);
        System.out.println(myMixer2);
        myMixer1.suffle();
        myMixer2.suffle();
        System.out.println(myMixer1);
        System.out.println(myMixer2);
    }

}
