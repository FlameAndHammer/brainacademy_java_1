package udovenko.labwork34;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by gladi on 03.11.2016.
 */
class ControlsRun extends JPanel implements ActionListener {
    JComboBox programs;

    private ControlsRun() {
        super(new FlowLayout(FlowLayout.CENTER));
    }

    public static ControlsRun createControlsRun(){
        ControlsRun cr = new ControlsRun();

        //Create and add Jlabel
        cr.add(new JLabel("Run a Program"));

        //Create the combo box, select the item at index 0.
        cr.programs = new JComboBox(new String[]{"Calculator", "Notepad", "SnippingTool", "Paint"});
        cr.programs.setSelectedIndex(0);

        //Create the button
        JButton run = new JButton("Run");
        run.setMnemonic(KeyEvent.VK_R);
        run.addActionListener(cr);

        //Add Components to this container
        cr.add(cr.programs);
        cr.add(run);

        return cr;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ConcurrentMap<String, String> paths = new ConcurrentHashMap<>();
        paths.put("Calculator", "C:\\WINDOWS\\system32\\calc.exe");
        paths.put("Notepad", "C:\\Windows\\notepad.exe");
        paths.put("SnippingTool", "C:\\Windows\\System32\\SnippingTool.exe");
        paths.put("Paint", "C:\\Windows\\System32\\mspaint.exe");
        try {
            Runtime.getRuntime().exec(paths.get((String) programs.getSelectedItem()));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
