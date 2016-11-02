package udovenko.labwork34;

import javax.swing.*;
import java.awt.*;

/**
 * Created by gladi on 02.11.2016.
 */
class MyApplication extends JFrame {
    public MyApplication(String title) throws HeadlessException {
        super(title);
        setSize(300, 200);
        setLocation(100,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
