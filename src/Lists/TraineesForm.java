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
public class TraineesForm extends GenericList {

    public TraineesForm(Connection c) {
        super("Course Form", "TRAINERS");
        try{
        Statement s=null;
        s=c.createStatement();
        String sql= "INSERT INTO Trainees VALUES (111,'Hisham','hisham@yahoo.com',0788885536,'Bechlor');";
        s.executeUpdate(sql);
         sql= "INSERT INTO Trainees VALUES (111,'ibrahim','sdfwsad@yahoo.com',0789435536,'Bechlor');";
        s.executeUpdate(sql);
        }
        catch(Exception e){
       }
        // INSERT INTO TRAINEE VALUES(213, ahamad, 34343434);
        // INSERT INTO RELATION ;
    }

    public void populateRows(JPanel panel) {

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        
        String[] fieldsNames = new String[]{"name", "phone number", "email", "education level"};
        JTextField[] textFields = new JTextField[fieldsNames.length];
        
        for(int i = 0; i < fieldsNames.length; i++) {
            JTextField field = new JTextField("", 20);
            JLabel label = new JLabel(fieldsNames[i]);
            textFields[i] = field;
            JPanel tempPanel = new JPanel();
            tempPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
            tempPanel.add(label);
            tempPanel.add(field);
            panel.add(tempPanel);
        }

    }
    public void addSecondaryButton(JPanel buttonPanel, String addDest){
        super.addSecondaryButton(buttonPanel, addDest);
        //bind action handler to button here ; 
        
    }
}
