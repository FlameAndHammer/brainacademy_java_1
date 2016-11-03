package udovenko.labwork34;
import static javax.swing.SwingUtilities.invokeLater;

/**
 * Created by gladi on 02.11.2016.
 */
public class DemoGuiSwing {
    public static void main(String[] args) {
        invokeLater(new Runnable() {
            public void run() {
                MyApplication.createGUI("Yesssss!!!!!!!!!");
            }
        });
    }
}
