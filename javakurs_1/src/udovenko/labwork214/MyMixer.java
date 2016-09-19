package udovenko.labwork214;

import java.util.Random;

/**
 * Created by gladi on 19.09.2016.
 */
class MyMixer <T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] shufle(){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            int r = rnd.nextInt(array.length);
            T temp = array[r];
            array[r] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public T[] getArray() {
        return array;
    }
}
