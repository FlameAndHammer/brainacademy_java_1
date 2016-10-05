package vityaz.com.brainacad.oop.testgenerics3;


import java.util.Arrays;

public class MyMixer <T>{
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] suffle(){
        T temp;
        int index;
        for (int i = 0; i < array.length; i++) {
            index = (int)Math.ceil(Math.random()*array.length-1);
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
