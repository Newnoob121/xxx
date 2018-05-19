/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApplication;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author 20160596
 */
public class ProjectUtility {
    public void getTraineePrograms(int traineeId){
       
    }
    public static Connection sqlconn() {
        Connection c = null;
        try {

            c = DriverManager.getConnection("jdbc:sqlite:C:/Users/20160368/project/JavaApplication1/data.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
//        stmt = c.createStatement();
//      ResultSet rs = stmt.executeQuery( "SELECT * FROM Courses;" );
//      

        } catch (Exception e) {

        }
        return c;
    }

    public static void bindNavigationActionListener(JButton button, JPanel parentPanelPointer, String dist) {

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JPanel parentPanel = parentPanelPointer;
                parentPanel.setVisible(false);
//                JOptionPane.showMessageDialog(null, dist, "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
                JFrame x = (JFrame) SwingUtilities.getWindowAncestor(parentPanel);
                CardLayout cl = (CardLayout) x.getContentPane().getLayout();
                cl.show(x.getContentPane(), dist);
            }
        });
    }
}
