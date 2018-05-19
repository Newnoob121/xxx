/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Lists.GenericList;

/**
 *
 * @author 20160596
 */
public class TrainingProgramsForm extends GenericList {
    String selectedCourse; 
    String[] courses = new String[] {"String1", "String2", "String3", "String4"};
    public TrainingProgramsForm(Connection c) {
        super("Course Form", "TRAINERS");
//        try{
//        Statement s=null;
//        s=c.createStatement();
//        String sql= "INSERT INTO Train_prog2 VALUES (33,'SA+TU','12-2','5/19/2018','6/18/2020','1','newcourse');";
//        s.executeUpdate(sql);
//         sql= "INSERT INTO Train_prog2 VALUES (35,'SA+TU','14-2','5/19/2019','6/19/2020','3','Engiering');";
//        s.executeUpdate(sql);
//        
//        
//         s.close();
//         c.commit();
//        
//        }
//        catch(Exception e){
//       }
        int traineeId = 12 ; 
         try{
        Statement s=null;
        s=c.createStatement();
        String sql= "SELECT Program_ID from ENROLL where Trainee_ID = 12;";
        s.executeUpdate(sql);
         sql= String.format("SELECT COURSE_NAME FROM TRAIN_PROG2 WHERE PROG_ID =%d",trainning_programm_id);
        s.executeUpdate(sql);
        
        
         s.close();
         c.commit();
        
        }
        catch(Exception e){
       }
    }
        

        
       
//         SELECT Program_ID from ENROLL where Trainee_ID = 12;
    resultSet = //         select trainig_program_id from ENROLL where trainee_id = traineeId 
    ArrayList<int> trainingProgramsIDS = new ArrayList<int>;
    ArrayList<String> trainingProgramsTITLES  = new ArrayList<String>;
       
    while(resultSet.next()){
        int programId = resultSet.getInt(trainning_programm_id);
        trainnigProgrammsIDS.add(prgoramId);
        resultSet2 = // execute SELECT TRAINING_PROGRAM_COURSE_NAME from trainign PRogramms where id = id
                //SELECT COURSE_NAME FROM TRAIN_PROG2 WHERE PROG_ID =33;
        while(resultSet2.next()){
            program_title = resultSet2.getString('programName');
        }      
        trainingProgrammsTitles.add(programm_title);
    }



    }
        
        
    

    public void populateRows(JPanel panel) {

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        // add String fields 
        String[] fieldsNames = new String[]{"name", "Day", "Time", "Start Date", "Finish Date"};
        JTextField[] textFields = new JTextField[fieldsNames.length];

        for (int i = 0; i < fieldsNames.length; i++) {
            JTextField field = new JTextField("", 20);
            JLabel label = new JLabel(fieldsNames[i]);
            textFields[i] = field;
            JPanel tempPanel = new JPanel();
            tempPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
            tempPanel.add(label);
            tempPanel.add(field);
            panel.add(tempPanel);
        }

        // add selection fields 
        JButton addCoursesButton = new JButton("add Courses to Training Program.");
        addCoursesButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                JList list = new JList(courses);
                list.setSelectionMode(
                    ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                int result = JOptionPane.showConfirmDialog(null, new JScrollPane(list));
//                JOptionPane.showMessageDialog(null, "Fsdfsd", "fdsfsXXXXXXXXXXXd");
           }
        });
        panel.add(addCoursesButton);
//        
//        coursesList
//        JList list = new JList(lines.toArray());
//        list.setSelectionMode(
//                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//        int[] select = {19, 20, 22};
//        list.setSelectedIndices(select);
//        JOptionPane.showMessageDialog(null, new JScrollPane(list));
        
    }

    public void addSecondaryButton(JPanel buttonPanel, String addDest) {
        super.addSecondaryButton(buttonPanel, addDest);
        //bind action handler to button here ; 

    }
}
