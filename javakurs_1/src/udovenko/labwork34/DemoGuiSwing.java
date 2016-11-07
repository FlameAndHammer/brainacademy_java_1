package udovenko.labwork34;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Vector;

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
