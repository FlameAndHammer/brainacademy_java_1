package shevchenko.homework_jdbc;

import com.sun.org.apache.xpath.internal.SourceTree;
import torba.Tasks_05_09_16.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * Created by ПК on 05.11.2016.
 */
class UserGI extends JFrame {
    private static UserGI instUserGI = new UserGI();
    protected static UserGI getInstUserGI(){return instUserGI;}
    protected JFrame jfrmUserGI;

    private UserGI(){
        this.jfrmUserGI = new JFrame();
        this.jfrmUserGI.setSize(400,200);
        this.jfrmUserGI.setLocation(100,200);
        this.jfrmUserGI.setVisible(true);
        this.jfrmUserGI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    protected void mainMenu(){
        JPanel mainMenuJPanel = new JPanel();
        mainMenuJPanel.setLayout(new GridLayout(5,1));
        Button showListAllStudents = new Button("Show list of All Students");
        Button showListAllLectures = new Button("Show list of All Lectures");
        Button showPresentOfStudentByName = new Button("Search present by name");
        Button showPresentOfSudentByLastName = new Button("Search present by lastName");
        Button checkPresent = new Button("Check present on lecture");
        mainMenuJPanel.add(showListAllStudents);
        mainMenuJPanel.add(showListAllLectures);
        mainMenuJPanel.add(showPresentOfStudentByName);
        mainMenuJPanel.add(showPresentOfSudentByLastName);
        mainMenuJPanel.add(checkPresent);
        jfrmUserGI.add(mainMenuJPanel);
        showListAllStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuJPanel.setVisible(false);
                String[] columnNames = {"ID", "LastName of Student", "FirstName Of Student"} ;
                menuShowList(columnNames,Show.getInstance().getArrAllStudentsString());
            }
        });
        showListAllLectures.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuJPanel.setVisible(false);
                String[] columnNames = {"LastName of Professor","Lecture"};
                menuShowList(columnNames,Show.getInstance().getArrAllLecturesString());
            }
        });
        showPresentOfStudentByName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuJPanel.setVisible(false);
                searchPresentByName();
            }
        });
        showPresentOfSudentByLastName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuJPanel.setVisible(false);
                searchPresentByLastName();
            }
        });
        checkPresent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuJPanel.setVisible(false);
                addLecture();
            }
        });
    }

    protected void menuShowList(String[] columsNames,String[][] list){
        JPanel menuShowListJPanel = new JPanel();
        menuShowListJPanel.setLayout(new BorderLayout());
        Button backMainMenu = new Button("Return to main menu");
        JTable tableAllStudents = new JTable(list,columsNames);
        JScrollPane scroll = new JScrollPane(tableAllStudents);
        scroll.createVerticalScrollBar();
        scroll.setPreferredSize(new Dimension(400,150));
        menuShowListJPanel.add(scroll,BorderLayout.NORTH);
        menuShowListJPanel.add(backMainMenu,BorderLayout.SOUTH);
        jfrmUserGI.add(menuShowListJPanel);
        backMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuShowListJPanel.setVisible(false);
                mainMenu();
            }
        });
    }

    protected void searchPresentByName(){
        JPanel searchByNameJPanel = new JPanel();
        searchByNameJPanel.setLayout(new GridLayout(4,1));
        JLabel label = new JLabel("Please enter FirstName of Student");
        Button backMainMenu = new Button("Return to main menu");
        JTextField nameInput = new JTextField("",5);
        Button search = new Button("Search");
        searchByNameJPanel.add(label);
        searchByNameJPanel.add(nameInput);
        searchByNameJPanel.add(search);
        searchByNameJPanel.add(backMainMenu);
        jfrmUserGI.add(searchByNameJPanel);
        backMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchByNameJPanel.setVisible(false);
                mainMenu();
            }
        });
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] arr = Search.getInstSearch().searchPresentOfStudentByFirstName(nameInput.getText());
                if (arr.length == 0) {
                    JFrame frame = new JFrame();
                    frame.setSize(100, 50);
                    frame.setVisible(true);
                    JOptionPane.showMessageDialog(frame, "Student with this name doesn`t found");
                }
                else{
                    searchByNameJPanel.setVisible(false);
                    String[] columNames = {"LastNameStudent","FirstNameStudent","Lecture","Date"};
                    menuShowList(columNames,arr);
                }
            }
        });
    }

    protected void searchPresentByLastName(){
        JPanel searchByLastNameJPanel = new JPanel();
        searchByLastNameJPanel.setLayout(new GridLayout(4,1));
        JLabel label = new JLabel("Please enter LastName of Student");
        Button backMainMenu = new Button("Return to main menu");
        JTextField nameInput = new JTextField("",5);
        Button search = new Button("Search");
        searchByLastNameJPanel.add(label);
        searchByLastNameJPanel.add(nameInput);
        searchByLastNameJPanel.add(search);
        searchByLastNameJPanel.add(backMainMenu);
        jfrmUserGI.add(searchByLastNameJPanel);
        backMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchByLastNameJPanel.setVisible(false);
                mainMenu();
            }
        });
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] arr = Search.getInstSearch().searchPresentOfStudentByLastName(nameInput.getText());
                if (arr.length == 0) {
                    JFrame frame = new JFrame();
                    frame.setSize(100, 50);
                    frame.setVisible(true);
                    JOptionPane.showMessageDialog(frame, "Student with this Lastname doesn`t found");
                }
                else{
                    searchByLastNameJPanel.setVisible(false);
                    String[] columNames = {"LastNameStudent","FirstNameStudent","Lecture","Date"};
                    menuShowList(columNames,arr);
                }
            }
        });
    }

    protected void addLecture(){
        JPanel newLectureJPanel = new JPanel();
        newLectureJPanel.setLayout(new GridLayout(5,1));
        JLabel enterDate = new JLabel("Please enter date in 'ddMMyyyy' like '29012016");
        JTextField dateInput = new JTextField("",5);
        JComboBox comboLectures = new JComboBox(Show.getInstance().getListLectures());
        JButton create = new JButton("Add");
        JButton backTomainmenu = new JButton("Return to main menu");
        newLectureJPanel.add(enterDate);
        newLectureJPanel.add(dateInput);
        newLectureJPanel.add(comboLectures);
        newLectureJPanel.add(create);
        newLectureJPanel.add(backTomainmenu);
        jfrmUserGI.add(newLectureJPanel);
        backTomainmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newLectureJPanel.setVisible(false);
                mainMenu();
            }
        });
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!Register.isExistLecture(comboLectures.getSelectedItem().toString(),dateInput.getText().toString())) {
                    newLectureJPanel.setVisible(false);
                    checkPresent(comboLectures.getSelectedItem().toString(), dateInput.getText().toString());
                }
                else{
                    JFrame frame = new JFrame();
                    frame.setSize(100, 50);
                    frame.setVisible(true);
                    JOptionPane.showMessageDialog(frame, "This lecture on this date is already exist");
                    addLecture();
                }
            }
        });
    }

    protected void checkPresent(String lecture,String date){
        JPanel checkJPanel = new JPanel();
        String[][] arrAllStud = Show.getInstance().getArrAllStudentsString();
        int size = arrAllStud.length;
        JCheckBox[] arrCheckBox = new JCheckBox[size];
        checkJPanel.setLayout(new GridLayout(size+2,2));
        for(int i = 0; i < size; i++){
            JLabel label = new JLabel(arrAllStud[i][1]+ " " + arrAllStud[i][2]);
            checkJPanel.add(label);
            arrCheckBox[i] = new JCheckBox();
            checkJPanel.add(arrCheckBox[i]);
        }
        JButton ok = new JButton("Save");
        JButton cancel = new JButton("Cancel");
        checkJPanel.add(ok);
        checkJPanel.add(cancel);
        jfrmUserGI.add(checkJPanel);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkJPanel.setVisible(false);
                addLecture();
            }
        });
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> arrLastNamePresentStud = new ArrayList<String>();
                for(int j = 0; j < size; j++){
                    if(arrCheckBox[j].isSelected()){
                        arrLastNamePresentStud.add(arrAllStud[j][1]);
                    }
                }
                Register.createPresentInDB(lecture,date,arrLastNamePresentStud);
                checkJPanel.setVisible(false);
                addLecture();
            }
        });
    }






}
