package torba.Lab_3_4.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class MyApplication extends JFrame{

    public MyApplication(String name) {

        JLabel label = new JLabel("Run a program");
        JComboBox combobox = new JComboBox<String>();
        combobox.addItem("Calculator");
        combobox.addItem("Notepad");
        JButton button = new JButton("run");
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Runtime.getRuntime().exec(((String) combobox.getSelectedItem()).replaceAll("Calculator","Calc"));
                        }
                        catch (IOException exc) {
                            System.out.println("Ну не шмогла я, не шмогла ..");
                        }
                    }
                }
        );

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(label);
        panel.add(combobox);
        panel.add(button);

        setContentPane(panel);

        setTitle(name);
        setSize(300, 100);
        setLocation(100, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
