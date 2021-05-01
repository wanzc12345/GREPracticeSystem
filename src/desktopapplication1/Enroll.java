// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:04
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Enroll.java

package desktopapplication1;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.sql.*;
import javax.swing.*;

public class Enroll extends JFrame
{

    public Enroll()
    {
        connectToDatabase();
        initComponents();
        setLocationRelativeTo(getOwner());
    }

    private void initComponents()
    {
        jPanel1 = new JPanel();
        jTextField1 = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jLabel3 = new JLabel();
        jButton2 = new JButton();
        jPasswordField1 = new JPasswordField();
        jPasswordField2 = new JPasswordField();
        jLabel4 = new JLabel();
        setDefaultCloseOperation(2);
        jPanel1.setName("jPanel1");
        jTextField1.setName("jTextField1");
        jLabel1.setText("User ID:");
        jLabel1.setName("jLabel1");
        jLabel2.setText("Password:");
        jLabel2.setName("jLabel2");
        jButton1.setText("OK");
        jButton1.setName("jButton1");
        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }

//            final Enroll this$0;
//
//            
//            {
//                this$0 = Enroll.this;
//                super();
//            }
        }
);
        jLabel3.setText("Confirm:");
        jLabel3.setName("jLabel3");
        jButton2.setText("Cancel");
        jButton2.setName("jButton2");
        jButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }

//            final Enroll this$0;
//
//            
//            {
//                this$0 = Enroll.this;
//                super();
//            }
        }
);
        jPasswordField1.setName("jPasswordField1");
        jPasswordField2.setName("jPasswordField2");
        jLabel4.setText("Attention:Illegal character is forbidden and length should between 6 and 16.");
        jLabel4.setName("jLabel4");
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(47, 47, 47).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jButton1, -2, 65, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, 32767).addComponent(jButton2)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2).addComponent(jLabel1)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTextField1, -1, 208, 32767).addComponent(jPasswordField1, -1, 208, 32767).addComponent(jPasswordField2, -1, 208, 32767)))).addGap(64, 64, 64)))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel4).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(31, 31, 31).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jTextField1, -2, -1, -2).addComponent(jLabel1)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel4).addGap(15, 15, 15).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel2).addComponent(jPasswordField1, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, 32767).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(jPasswordField2, -2, -1, -2)).addGap(34, 34, 34).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1).addComponent(jButton2)).addContainerGap()));
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -1, -1, 32767).addContainerGap()));
        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt)
    {
        if(password_equal())
            try
            {
                sta.executeUpdate((new StringBuilder()).append("insert into student(name,password,id) values('").append(jTextField1.getText()).append("','").append(String.valueOf(jPasswordField1.getPassword())).append("',12346)").toString());
                JOptionPane.showMessageDialog(this, "Register success!");
                dispose();
            }
            catch(Exception e)
            {
                System.out.print((new StringBuilder()).append("insert wrong!").append(e).toString());
            }
        else
            JOptionPane.showMessageDialog(this, "Wrong input!");
    }

    private void jButton2ActionPerformed(ActionEvent evt)
    {
        dispose();
    }

    private void connectToDatabase()
    {
        try
        {
            url = "jdbc:mysql://localhost:3306/gre";
            con = DriverManager.getConnection(url, "root", "wanzc");
            sta = con.createStatement();
        }
        catch(Exception e)
        {
            System.out.println("Connection wrong!");
        }
    }

    private boolean password_equal()
    {
        if(jPasswordField1.getPassword().length >= 6 && jPasswordField1.getPassword().length <= 16 && isIllegal(jPasswordField1.getPassword()))
            return String.valueOf(jPasswordField1.getPassword()).equals(String.valueOf(jPasswordField2.getPassword()));
        else
            return false;
    }

    private boolean isIllegal(char s[])
    {
        String string = String.valueOf(s);
        int i;
        for(i = 0; i < string.length() && (string.charAt(i) > '`' && string.charAt(i) < '{' || string.charAt(i) > '/' && string.charAt(i) < ':'); i++);
        return i == string.length();
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                (new Enroll()).setVisible(true);
            }

        }
);
    }

    private String url;
    private Connection con;
    private Statement sta;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPasswordField jPasswordField1;
    private JPasswordField jPasswordField2;
    private JTextField jTextField1;


}