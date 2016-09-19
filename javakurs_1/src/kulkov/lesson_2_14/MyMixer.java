package kulkov.lesson_2_14;

import java.util.Random;

/**
 * Created by User on 16.09.2016.
 * Generic class
 */
class MyMixer<T> {
    //Shuffle the elements of array
    public T[] shuffle(T[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int r = random.nextInt(array.length - 1);
            if (!(array[i].equals(array[r]))) {
                T temp = array[r];
                array[r] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}
