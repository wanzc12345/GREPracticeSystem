// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:00
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   AnalyticalWritingWindow.java

package desktopapplication1;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.Random;
import javax.swing.*;

public class AnalyticalWritingWindow extends JFrame
{

    public AnalyticalWritingWindow()
    {
        connectToDatabase();
        initComponents();
        showContent("1");
    }

    private void initComponents()
    {
        jButton1 = new JButton();
        jTabbedPane1 = new JTabbedPane();
        jPanel1 = new JPanel();
        jScrollPane2 = new JScrollPane();
        jTextArea2 = new JTextArea();
        jPanel2 = new JPanel();
        jScrollPane3 = new JScrollPane();
        jTextArea3 = new JTextArea();
        jPanel3 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        setDefaultCloseOperation(2);
        addWindowListener(new WindowAdapter() {

            public void windowOpened(WindowEvent evt)
            {
                formWindowOpened(evt);
            }

//            final AnalyticalWritingWindow this$0;
//
//            
//            {
//                this$0 = AnalyticalWritingWindow.this;
//                super();
//            }
        }
);
        jButton1.setText("return");
        jButton1.setName("jButton1");
        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }

//            final AnalyticalWritingWindow this$0;
//
//            
//            {
//                this$0 = AnalyticalWritingWindow.this;
//                super();
//            }
        }
);
        jTabbedPane1.setName("jTabbedPane1");
        jPanel1.setName("jPanel1");
        jScrollPane2.setHorizontalScrollBarPolicy(31);
        jScrollPane2.setName("jScrollPane2");
        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setName("jTextArea2");
        jScrollPane2.setViewportView(jTextArea2);
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane2, -1, 505, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane2, -1, 155, 32767));
        jTabbedPane1.addTab("Issue", jPanel1);
        jPanel2.setName("jPanel2");
        jScrollPane3.setHorizontalScrollBarPolicy(31);
        jScrollPane3.setName("jScrollPane3");
        jTextArea3.setColumns(20);
        jTextArea3.setEditable(false);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setName("jTextArea3");
        jScrollPane3.setViewportView(jTextArea3);
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane3, -1, 505, 32767));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane3, -1, 155, 32767));
        jTabbedPane1.addTab("Argument", jPanel2);
        jPanel3.setName("jPanel3");
        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 2, 32767));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 229, 32767));
        jScrollPane1.setName("jScrollPane1");
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1");
        jScrollPane1.setViewportView(jTextArea1);
        jButton2.setText("next");
        jButton2.setName("jButton2");
        jButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }

//            final AnalyticalWritingWindow this$0;
//
//            
//            {
//                this$0 = AnalyticalWritingWindow.this;
//                super();
//            }
        }
);
        jButton3.setText("last");
        jButton3.setName("jButton3");
        jButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
//
//            final AnalyticalWritingWindow this$0;
//
//            
//            {
//                this$0 = AnalyticalWritingWindow.this;
//                super();
//            }
        }
);
        jButton4.setText("perfect essay");
        jButton4.setName("jButton4");
        jButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }

//            final AnalyticalWritingWindow this$0;
//
//            
//            {
//                this$0 = AnalyticalWritingWindow.this;
//                super();
//            }
        }
);
        jButton5.setText("random");
        jButton5.setName("jButton5");
        jButton5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }

//            final AnalyticalWritingWindow this$0;
//
//            
//            {
//                this$0 = AnalyticalWritingWindow.this;
//                super();
//            }
        }
);
        jButton6.setText("save");
        jButton6.setName("jButton6");
        jButton6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton6ActionPerformed(evt);
            }

//            final AnalyticalWritingWindow this$0;
//
//            
//            {
//                this$0 = AnalyticalWritingWindow.this;
//                super();
//            }
        }
);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, -1, 510, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(jButton4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, 32767).addComponent(jButton6, -2, 68, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton3, -2, 70, -2).addGap(5, 5, 5).addComponent(jButton2, -2, 69, -2)).addComponent(jScrollPane1, -2, 502, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel3, -1, -1, 32767)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(jButton1, -2, 74, -2).addGap(151, 151, 151).addComponent(jButton5))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jButton1).addComponent(jButton5)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jTabbedPane1, -1, 183, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3, -1, -1, 32767).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jScrollPane1, -2, 181, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton4, -2, 29, -2).addComponent(jButton6, -2, 29, -2).addComponent(jButton3, -2, 31, -2).addComponent(jButton2, -2, 29, -2)))).addContainerGap()));
        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt)
    {
        dispose();
    }

    private void formWindowOpened(WindowEvent evt)
    {
        setLocationRelativeTo(getOwner());
    }

    private void jButton4ActionPerformed(ActionEvent evt)
    {
        try
        {
            String id = jTextArea2.getText().substring(0, jTextArea2.getText().indexOf("\n"));
            ResultSet rs = sta.executeQuery((new StringBuilder()).append("select issues_example from analytical_writing where id=").append(id).toString());
            rs.next();
            jTextArea1.setText(rs.getString("issues_example"));
        }
        catch(Exception e)
        {
            System.out.printf("what you want from me?", new Object[0]);
        }
    }

    private void jButton6ActionPerformed(ActionEvent evt)
    {
        FileDialog filedialog = new FileDialog(this, "saving", 1);
        filedialog.setVisible(true);
        String address = filedialog.getDirectory();
        String name = filedialog.getFile();
        System.out.printf(name, new Object[0]);
        if(name != null)
        {
            File file = new File(address, name);
            try
            {
                FileWriter fw = new FileWriter(file);
                fw.write(jTextArea1.getText());
                fw.close();
            }
            catch(Exception e)
            {
                System.out.printf("write wrong!", new Object[0]);
            }
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt)
    {
        try
        {
            String id = jTextArea2.getText().substring(0, jTextArea2.getText().indexOf("\n")).trim();
            ResultSet rs = sta.executeQuery("select * from analytical_writing");
            do
                if(!rs.next())
                    break;
            while(!rs.getString("id").equals(id));
            if(rs.next())
            {
                jTextArea2.setText(rs.getString("issues"));
                jTextArea3.setText(rs.getString("arguments"));
            } else
            {
                rs.first();
                jTextArea2.setText(rs.getString("issues"));
                jTextArea3.setText(rs.getString("arguments"));
            }
        }
        catch(Exception e) { }
    }

    private void jButton3ActionPerformed(ActionEvent evt)
    {
        try
        {
            String id = jTextArea2.getText().substring(0, jTextArea2.getText().indexOf("\n")).trim();
            ResultSet rs = sta.executeQuery("select * from analytical_writing");
            do
                if(!rs.next())
                    break;
            while(!rs.getString("id").equals(id));
            if(rs.previous())
            {
                jTextArea2.setText(rs.getString("issues"));
                jTextArea3.setText(rs.getString("arguments"));
            } else
            {
                rs.last();
                jTextArea2.setText(rs.getString("issues"));
                jTextArea3.setText(rs.getString("arguments"));
            }
        }
        catch(Exception e) { }
    }

    private void jButton5ActionPerformed(ActionEvent evt)
    {
        Random rand = new Random(System.currentTimeMillis());
        int count = 0;
        try
        {
            for(ResultSet rs = sta.executeQuery("select * from analytical_writing"); rs.next();)
                count++;

        }
        catch(Exception e) { }
        showContent(String.valueOf(rand.nextInt(count) + 1));
    }

    private void showContent(String id)
    {
        try
        {
            ResultSet rs = sta.executeQuery((new StringBuilder()).append("select * from analytical_writing where id=").append(id).toString());
            if(!rs.next())
                JOptionPane.showMessageDialog(new JFrame(), "There's no records!", "Error", 1);
            jTextArea2.setText(rs.getString("issues"));
            jTextArea3.setText(rs.getString("arguments"));
        }
        catch(Exception e)
        {
            System.out.printf("query wrong!", new Object[0]);
        }
    }

    private void connectToDatabase()
    {
        try
        {
            url = "jdbc:mysql://localhost:3306/gre";
            con = DriverManager.getConnection(url, "root", "wanzc");
            sta = con.createStatement(1005, 1008);
        }
        catch(Exception e)
        {
            System.out.println("Connection wrong!");
        }
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                (new AnalyticalWritingWindow()).setVisible(true);
            }

        }
);
    }

    private String url;
    private Connection con;
    private Statement sta;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTabbedPane jTabbedPane1;
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;
    private JTextArea jTextArea3;







}