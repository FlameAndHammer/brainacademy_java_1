package derdyuk.lesson2_8.Telephone;

/**
 * Created by maossi on 24.08.2016.
 */
public class Main {
    public static void main(String[]args) {
        Telephon[] arreyOfTelephon = { new LG(), new Sumsung()};
        for (Telephon arreyElement : arreyOfTelephon) {
            arreyElement.Battery();
            arreyElement.Diagonal();
            arreyElement.Camera();


        }
    }
}