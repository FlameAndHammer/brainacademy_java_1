package torba.Lab_3_4.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApp extends JFrame{

    public MyApp(String name) {

        JTextField userName = new JTextField();
        JTextField compName = new JTextField();

        JButton getUserName = new JButton("Get user name");
        getUserName.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        userName.setText(System.getProperty("user.name"));
                    }
                }
        );
        JButton getCompName = new JButton("Get comp name");
        getCompName.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        compName.setText(System.getenv().get("COMPUTERNAME"));
                    }
                }
        );

        JPanel panel = new JPanel();
        //GridLayout gl = new GridLayout(2, 2, 10, 50);
        panel.setLayout(new GridLayout(2, 2, 10, 20));
        panel.add(userName);
        panel.add(getUserName);
        panel.add(compName);
        panel.add(getCompName);

        setContentPane(panel);

        setTitle(name);
        setSize(500, 100);
        setLocation(100, 100);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
