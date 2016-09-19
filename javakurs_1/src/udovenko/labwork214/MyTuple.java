package udovenko.labwork214;

/**
 * Created by gladi on 14.09.2016.
 */
class MyTuple<A, B, C> {
    private A fieldA;
    private B fieldB;
    private C fieldC;

    public MyTuple(A fieldA, B fieldB, C fieldC) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
        this.fieldC = fieldC;
    }

    public A getFieldA() {
        return fieldA;
    }

    public B getFieldB() {
        return fieldB;
    }

    public C getFieldC() {
        return fieldC;
    }
}
