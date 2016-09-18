package torba.Lab_2_14;

public class MyMixer<T> {

    private T[] arr;

    public MyMixer(T[] arr) {
        this.arr = arr;
    }

    public T[] shuffle() {

        T buf;

        for (int i = 0; i < arr.length; i++) {
            int j = (int)(Math.random() * arr.length);
            buf = arr[j];
            arr[j] = arr[i];
            arr[i] = buf;
        }
        return arr;
    }



}
