package kulkov.practice.threads.task3;

/**
 * Created by Александр on 07.10.2016.
 * Исправить ошибки
 */
class BoxPrinter<T> {
    private T val;

    private BoxPrinter() {

    }

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }

    public void setValue(T val) {
        this.val = val;
    }

    public static <T extends BoxPrinter> T returnGenericNewInstance(T someT)
    throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        T obj = (T) Class.forName(someT.getClass().getName()).newInstance();
        obj.setValue(1);
        return obj;
    }
}

class Test {
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<>(10);
        System.out.println(value1);
        Integer intValue1 = value1.getValue();

        BoxPrinter<String> value2 = new BoxPrinter<>("Hello world");
        System.out.println(value2);
        String strValue2 = value2.getValue();

        try {
            System.out.println(BoxPrinter.returnGenericNewInstance(value1));
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
