package udovenko.labwork34;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gladi on 02.11.2016.
 */
class MyApplication extends JFrame {
    private MyApplication(String title) throws HeadlessException {
        super(title);
        setLocation(100,100);
        //setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void createGUI(String title){
        JFrame frame = new MyApplication(title);
        JComponent pane = ControlsRun.createControlsRun();
        pane.setOpaque(true);
        frame.setContentPane(pane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
