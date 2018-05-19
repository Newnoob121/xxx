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
import MainApplication.*;

/**
 *
 * @author 20160596
 */
public class GenericList extends javax.swing.JPanel {

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;

    /**
     * Creates new form TrainerList
     */

    public GenericList(String panelTitle, String addDest) {
        setLayout(new BorderLayout());

        // title panel
        JLabel titleLabel = new JLabel(panelTitle);
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        titlePanel.add(titleLabel);

        // populate rows
        JPanel row = new JPanel();
        populateRows(row);

        // menu button 
        JButton menuButton = new JButton("Menu");
        ProjectUtility.bindNavigationActionListener(menuButton, this, "List");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        buttonPanel.add(menuButton);
        addSecondaryButton(buttonPanel, addDest);

        add(titlePanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
        add(row, BorderLayout.CENTER);
    }

    public void populateRows(JPanel row) {
        row.setLayout(new GridLayout(0, 4));
        for (int i = 0; i < 50; i++) {
            row.add(new JLabel("new label" + i));
        }
    }

    public void addSecondaryButton(JPanel buttonPanel, String addDest) {
        JButton addButton = new JButton("add");
        ProjectUtility.bindNavigationActionListener(addButton, this, addDest);
        buttonPanel.add(addButton);
    }

}
