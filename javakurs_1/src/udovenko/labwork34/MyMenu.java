package udovenko.labwork34;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gladi on 04.11.2016.
 */
class MyMenu extends JMenuBar {
    public static MyMenu createMyMenu(Action action){
        MyMenu menuBar = new MyMenu();

        //Create menu for Lab Work 3-4-5 and disabled as default
        JMenu message = new JMenu("Message");
        JMenuItem question = new JMenuItem("Question");
        question.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "You are ready to undergo the test?", "Ready to test?",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            }
        });
        JMenuItem inputName = new JMenuItem("Input name");
        inputName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog(null, "Enter user name", "Input name", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        message.setEnabled(false);

        //Create menu for switch layout between lab works
        JMenu labs = new JMenu("Lab Works");
        JMenuItem lab13 = new JMenuItem(action);
        lab13.setText("Lab Works 1 - 3");
        JMenuItem lab45 = new JMenuItem(action);
        lab45.setText("Lab Works 4 - 5");

        //Add items to menu
        message.add(question);
        message.add(inputName);
        labs.add(lab13);
        labs.add(lab45);

        //Add menu to MenuBar
        menuBar.add(message);
        menuBar.add(labs);

        return menuBar;
    }
}
