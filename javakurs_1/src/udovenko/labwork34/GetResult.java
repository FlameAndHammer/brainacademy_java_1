package udovenko.labwork34;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gladi on 08.11.2016.
 */
class GetResult extends JPanel {
    private JTextField result;

    public GetResult() {
        super(new BorderLayout());
        //LabWork 3-4-4
        createGetName();
        createGetComp();

        //LabWork 3-4-5
        createResult();
    }

    private void createGetName(){
        JPanel getName = new JPanel();
        JTextField fieldName = new JTextField(15);
        JButton buttonName = new JButton("Cet_User_Name");
        buttonName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldName.setText(System.getenv("USERNAME"));
            }
        });

        getName.add(fieldName);
        getName.add(buttonName);

        this.add(getName, BorderLayout.NORTH);
    }

    private void createGetComp(){
        JPanel getComp = new JPanel();
        JTextField fieldComp = new JTextField(15);
        JButton buttonComp = new JButton("Get_Comp_Name");
        buttonComp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldComp.setText(System.getenv("COMPUTERNAME"));
            }
        });

        getComp.add(fieldComp);
        getComp.add(buttonComp);

        this.add(getComp, BorderLayout.SOUTH);
    }

    private void createResult(){
        JPanel getResult = new JPanel();
        getResult.add(new JLabel("Result"));

        result = new JTextField(35);
        getResult.add(result);

        this.add(getResult, BorderLayout.CENTER);
    }

    public JTextField getResult() {
        return result;
    }
}
