package udovenko.labwork39proxy;

/**
 * Created by gladi on 28.02.2017.
 */
public class CalculateImpl implements Calculate {

    @Override
    public int multiplication(int x, int y) {
        return x * y;
    }

    @Override
    public float division(int x, int y) {
        return x / y;
    }

    public int sum (int x, int y){
        return x + y;
    }
}
