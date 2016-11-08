package udovenko.labwork34;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gladi on 04.11.2016.
 */
class MyMenu extends JMenuBar {
    private Action action;
    private JPanel frame;
    public MyMenu (Action action, JPanel frame){
        this.action = action;
        this.frame = frame;

        //Create menu for Lab Work 3-4-5 and disabled as default
        createMessage();

        //Create menu for switch layout between lab works
        createLabs();
    }

    private void createMessage(){
        JMenu message = new JMenu("Message");

        message.add(createQuestion());
        message.add(createName());

        message.setEnabled(false);

        this.add(message);
    }

    private void createLabs(){
        JMenu labs = new JMenu("Lab Works");
        JMenuItem lab13 = new JMenuItem(action);
        lab13.setText("Lab Works 1 - 3");
        JMenuItem lab45 = new JMenuItem(action);
        lab45.setText("Lab Works 4 - 5");

        labs.add(lab13);
        labs.add(lab45);

        this.add(labs);
    }

    private JMenuItem createQuestion(){
        JMenuItem question = new JMenuItem("Question");
        question.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "You are ready to undergo the test?", "Ready to test?",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (confirm == JOptionPane.YES_OPTION){
                    ((GetResult)frame).getResult().setText("Ready to test");
                } else {
                    ((GetResult)frame).getResult().setText("Don't ready to test");
                }
            }
        });

        return question;
    }

    private JMenuItem createName(){
        JMenuItem inputName = new JMenuItem("Input name");
        inputName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(frame, "Enter user name", "Input name",
                       JOptionPane.INFORMATION_MESSAGE);
                if (input != null){
                    ((GetResult)frame).getResult().setText(input);
                }else {
                    ((GetResult)frame).getResult().setText("Haven't input name");
                }
            }
        });

        return inputName;
    }
}
