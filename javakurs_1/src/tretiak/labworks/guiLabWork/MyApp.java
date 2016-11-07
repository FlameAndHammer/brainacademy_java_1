package tretiak.labworks.guiLabWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maksim on 06.11.2016.
 */
public class MyApp extends JFrame{
    private JPanel panel1;
    private JPanel panel2;
    private JMenu message;
    private JMenuBar menuBar;
    private JMenuItem question, inputName;
    private JTextField result;
    private JPanel panel;

    public MyApp(String s, int sX, int sY, int lX, int lY){
        super(s);
        this.setSize(sX, sY);
        this.setLocation(lX, lY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createFirstPanel();
        createSecondPanel();
        createControlCenter();
        this.setVisible(true);
    }
    private void createFirstPanel(){
        panel1 = new JPanel();
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Get_User_Name");

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textField.setText(System.getenv("USERNAME"));
            }
        });
        panel1.add(button);
        panel1.add(textField);
        this.add(panel1, BorderLayout.NORTH);
    }

    private void createSecondPanel(){
        panel2 = new JPanel();
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Get_Comp_Name");

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textField.setText(System.getenv("COMPUTERNAME"));
            }
        });
        panel2.add(button);
        panel2.add(textField);
        this.add(panel2, BorderLayout.SOUTH);
    }

    private void createControlCenter(){
        panel = new JPanel();
        panel.add(new JLabel("Result", JLabel.RIGHT));
        result = new JTextField(30);
        panel.add(result);
        menuBar = new JMenuBar();
        message = new JMenu("Message");
        question = new JMenuItem("Question");
        inputName = new JMenuItem("Input name");

        this.add(panel, BorderLayout.CENTER);
        this.setJMenuBar(menuBar);

        inputName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = JOptionPane.showInputDialog(null, "Enter your name", "Input name",
                        JOptionPane.OK_CANCEL_OPTION);
                if(message != null){
                    result.setText(message);
                }else{
                    result.setText("Input error");
                }
            }
        });

        question.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer = JOptionPane.showConfirmDialog(null, "You are ready to undergo the test", "Question",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(answer == JOptionPane.YES_OPTION){
                    result.setText("Student ready to the test");
                }else{
                    result.setText("Student not ready to the test");
                }
            }
        });

        message.add(question);
        message.add(inputName);

        menuBar.add(message);
    }
}
