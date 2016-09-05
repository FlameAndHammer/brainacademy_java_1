package tretiak.labworks.work3;


public class Main {
    private static Double compute(Short s, Integer i){
        Double sum = s.doubleValue() + i.doubleValue();
        return sum;
    }
    public static void main(String[] arg){
        assert compute(new Short((short) 5), new Integer(100)).equals(105) :
                "Incorrect input";
        System.out.println(compute(new Short((short) 5), new Integer(100)));
    }
}
