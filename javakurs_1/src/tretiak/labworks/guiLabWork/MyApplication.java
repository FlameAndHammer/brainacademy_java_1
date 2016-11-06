package tretiak.labworks.guiLabWork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Maksim on 02.11.2016.
 */
public class MyApplication extends JFrame{
    private JComboBox jcb;
    private JPanel jpn;
    private JButton button;

    public MyApplication(String s, int sX, int sY, int lX, int lY){
        super(s);
        this.setSize(sX, sY);
        this.setLocation(lX, lY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createRun();
        this.add(jpn);
        this.setVisible(true);
    }

    private void createRun(){
        jpn = new JPanel();

        String[] str = {"Calculator", "Notepad"};
        jcb = new JComboBox(str);

        jpn.add(new JLabel("Run a program"));
        jpn.add(jcb);

        button = new JButton("Run");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Process p = null;
                String choice = (String)jcb.getSelectedItem();
                try {
                    switch (choice) {
                        case "Calculator":
                            p = Runtime.getRuntime().exec("C:\\Windows\\system32\\calc.exe");
                            break;
                        case "Notepad":
                            p = Runtime.getRuntime().exec("C:\\Windows\\system32\\notepad.exe");
                            break;
                    }
                }catch (IOException ex){
                    System.out.println("Can't run a program");
                }
            }
        });
        jpn.add(button);

    }
}
