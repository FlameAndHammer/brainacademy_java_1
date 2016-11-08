package udovenko.labwork34;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Vector;

/**
 * Created by gladi on 02.11.2016.
 */
class MyApplication extends JFrame {
    private Vector<JPanel> panels = new Vector<>();
    private MyMenu menuBar;
    private Action changed;

    private MyApplication(String title) throws HeadlessException {
        super(title);
        setLocation(250, 100);

        changed = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem jmi = (JMenuItem) e.getSource();
                switch (jmi.getText()) {
                    case "Lab Works 1 - 3":
                    default:
                        changePane(panels.get(0));
                        menuBar.getMenu(0).setEnabled(false);
                        break;
                    case "Lab Works 4 - 5":
                        changePane(panels.get(1));
                        menuBar.getMenu(0).setEnabled(true);
                }
            }
        };
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    };

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public static void createGUI(String title){
        MyApplication frame = new MyApplication(title);

        //Add ContentPanes
        frame.panels.add(ControlsRun.createControlsRun());
        frame.panels.add(new GetResult());
        frame.panels.get(0).setOpaque(true);
        frame.setContentPane(frame.panels.get(0));

        //Add MenuBar
        frame.menuBar = new MyMenu(frame.changed, frame.panels.get(1));
        frame.menuBar.setOpaque(true);
        frame.setJMenuBar(frame.menuBar);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    //Change ContentPane
    public void changePane(JPanel panel){
        panel.setOpaque(true);
        setContentPane(panel);
        pack();
        update(getGraphics());
    }
}
