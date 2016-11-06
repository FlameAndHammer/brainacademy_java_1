package torba.Lab_3_4.task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApp extends JFrame {

    public MyApp(String name) {

        JLabel label = new JLabel("Result ");
        JTextField textField = new JTextField(30);
        textField.setSize(30, 10);

        JPanel panel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        panel.setLayout(gbl);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        c.weighty = 0;
        gbl.setConstraints(label, c);
        panel.add(label);

        GridBagConstraints c1 = new GridBagConstraints();
        c1.gridx = 1;
        c1.gridy = 0;
        c1.fill = GridBagConstraints.NONE;
        c1.weightx = 0;
        c1.weighty = 0;
        gbl.setConstraints(textField, c1);
        panel.add(textField);

        setContentPane(panel);

        MenuBar menu = new MenuBar();
        PopupMenu message = new PopupMenu("Message");
        MenuItem inputName = new MenuItem("Input name");
        inputName.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField.setText(JOptionPane.showInputDialog("Enter user name"));
                    }
                }
        );
        message.add(inputName);
        MenuItem question = new MenuItem("Question");
        question.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int i = JOptionPane.showConfirmDialog(panel, "Are you ready to undergo the test?");
                        switch (i) {
                            case 0: {textField.setText("Yes"); break;}
                            case 1: {textField.setText("No"); break;}
                            case 2: {textField.setText("Cancel"); break;}
                        }
                    }
                }
        );
        message.add(question);
        menu.add(message);
        setMenuBar(menu);

        setTitle(name);
        setSize(500, 300);
        setLocation(100, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
