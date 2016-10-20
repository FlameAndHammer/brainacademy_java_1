package udovenko.practice.threads.task3;

/**
 * Created by Александр on 07.10.2016.
 * Исправить ошибки
 */
class BoxPrinter {
    private Object val;

    public BoxPrinter() {
    }

    public BoxPrinter(Object arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public Object getValue() {
        return val;
    }

    public static <T extends BoxPrinter> T returnGenericNewInstance(T someT) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        T result = (T) Class.forName(someT.getClass().getName()).newInstance();
        result.setVal("Test");
        return result;

    }

    public void setVal(Object val) {
        this.val = val;
    }
}

class Test {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();
        BoxPrinter value2 = new BoxPrinter("Hello world");
        System.out.println(value2);

        String intValue2 = (String) value2.getValue();
        try {
            System.out.println(BoxPrinter.returnGenericNewInstance(value1));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
