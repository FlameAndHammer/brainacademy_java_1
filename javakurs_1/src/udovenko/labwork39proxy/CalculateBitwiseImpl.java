package udovenko.labwork39proxy;

/**
 * Created by gladi on 28.02.2017.
 */
public class CalculateBitwiseImpl implements CalculateBitwise {
    @Override
    public int andBitwise(int x, int y) {
        return x & y;
    }

    @Override
    public int orBitwise(int x, int y) {
        return x | y;
    }
}
