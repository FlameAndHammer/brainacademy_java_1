package _nikulin.labs.lesson_3_4_swing.task_1_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Александр on 02.11.2016.
 */
public class MyApplication extends JFrame {
    // lab 1-4-3
    private JComboBox list;
    private JButton button;
    private JPanel panel;

    public MyApplication(String title)  {
        // lab 1-4-1
        super(title);
        this.setSize(500, 300);
        this.setLocation(200, 200);
//        this.setVisible(true);

        // lab 1-4-2
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // lab 1-4-3
        createControlsRun();
        this.add(panel);

        // lab 1-4-4


        this.setVisible(true);
    }

    private void createControlsRun() {
        panel = new JPanel();

        JLabel label = new JLabel("Run a Program");
        panel.add(label);

        String[] programs = {"Calculator", "Notepad", "Paint"};
        list = new JComboBox(programs);
        panel.add(list);

        button = new JButton("Run");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Process process = null;
                String prog = (String)list.getSelectedItem();
                try {
                    switch (prog) {
                        case "Calculator":
                            process = Runtime.getRuntime().exec("C:\\Windows\\system32\\calc.exe");
                            break;
                        case "Notepad":
                            process = Runtime.getRuntime().exec("C:\\Windows\\system32\\notepad.exe");
                            break;
                        case "Paint":
                            process = Runtime.getRuntime().exec("C:\\Windows\\system32\\mspaint.exe");
                    }
                } catch (IOException ee) {
                    System.out.println("Program run error!");
                }
            }
        });
        panel.add(button);
    }
}
