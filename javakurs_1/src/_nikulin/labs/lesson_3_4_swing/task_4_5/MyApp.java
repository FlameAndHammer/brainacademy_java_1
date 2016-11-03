package _nikulin.labs.lesson_3_4_swing.task_4_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Александр on 02.11.2016.
 */
public class MyApp extends JFrame {
    private JTextField fieldResult;
    public MyApp(String title) {
        super(title);
        this.setSize(400, 180);
        this.setLocation(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // lab 1-4-4
        createPanel();
        // lab 1-4-5
        createMenu();

        this.setVisible(true);
    }

    private void createPanel() {
        // lab 1-4-4
        createLeftPanel();
        createRightPanel();
        // lab 1-4-5
        createCenterControls();
    }

    private void createLeftPanel() {
        JPanel panelLeft = new JPanel();

        final JTextField field_1 = new JTextField(15);
        panelLeft.add(field_1);

        JButton button_1 = new JButton("Get_User_Name");
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field_1.setText(System.getenv("USERNAME"));
            }
        });
        panelLeft.add(button_1);

        this.add(panelLeft,BorderLayout.NORTH);
    }

    private void createRightPanel() {
        JPanel panelRight = new JPanel();

        final JTextField field_2 = new JTextField(15);
        panelRight.add(field_2);

        JButton button_2 = new JButton("Get_Comp_Name");
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field_2.setText(System.getenv("COMPUTERNAME"));
            }
        });
        panelRight.add(button_2);

        this.add(panelRight,BorderLayout.SOUTH);
    }

    private void createCenterControls() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Result", JLabel.RIGHT));

        fieldResult = new JTextField(30);
        panel.add(fieldResult);

        this.add(panel, BorderLayout.CENTER);
    }

    private void createMenu() {
        JMenuBar barMenu;
        JMenu message;
        final JMenuItem question, input;

        barMenu = new JMenuBar();
        this.setJMenuBar(barMenu);
        message = new JMenu("Message");

        question = new JMenuItem("Question");
        question.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(null, "You are ready to undergo the test",
                        "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    fieldResult.setText("The student can take the test");
                } else {
                    fieldResult.setText("The student is not ready to take the test");
                }
            }
        });
        message.add(question);

        input = new JMenuItem("Input name");
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mes = JOptionPane.showInputDialog(null, "Enter your name", "Input",
                        JOptionPane.OK_CANCEL_OPTION);
                if (mes != null) {
                    fieldResult.setText(mes);
                } else {
                    fieldResult.setText("Refusal of input");
                }
            }
        });
        message.add(input);

        barMenu.add(message);
    }
}
