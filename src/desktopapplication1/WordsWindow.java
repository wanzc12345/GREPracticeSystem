// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:19
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   WordsWindow.java

package desktopapplication1;

import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.sql.*;
import javax.swing.*;

public class WordsWindow extends JFrame
{

    public WordsWindow()
    {
        setBounds(400, 50, 648, 616);
        connectToDatabase();
        initComponents();
        showContent("select * from words");
    }

    private void initComponents()
    {
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jPanel2 = new JPanel();
        jScrollPane2 = new JScrollPane();
        jTextArea2 = new JTextArea();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        jScrollPane3 = new JScrollPane();
        jTextArea3 = new JTextArea();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jTextField1 = new JTextField();
        jButton3 = new JButton();
        jButton4 = new JButton();
        setDefaultCloseOperation(2);
        setTitle("Words Browser");
        setResizable(false);
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent evt)
            {
                formWindowClosing(evt);
            }

//            final WordsWindow this$0;
//
//            
//            {
//                this$0 = WordsWindow.this;
//                super();
//            }
        }
);
        jPanel1.setName("jPanel1");
        jScrollPane1.setName("jScrollPane1");
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new Font("Monospaced", 1, 36));
        jTextArea1.setRows(5);
        jTextArea1.setText("rejuvenate\nv.\u8FD4\u8001\u8FD8\u7AE5");
        jTextArea1.setName("jTextArea1");
        jScrollPane1.setViewportView(jTextArea1);
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, -1, 628, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, -1, 269, 32767).addContainerGap()));
        jPanel2.setName("jPanel2");
        jScrollPane2.setName("jScrollPane2");
        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setFont(new Font("Monospaced", 0, 14));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("1.rescuccitate\n2.resurrect\n3.revive");
        jTextArea2.setDisabledTextColor(new Color(0, 0, 0));
        jTextArea2.setEnabled(false);
        jTextArea2.setName("jTextArea2");
        jScrollPane2.setViewportView(jTextArea2);
        jLabel1.setFont(new Font("Tahoma", 0, 14));
        jLabel1.setText("Analogy:");
        jLabel1.setName("jLabel1");
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, -1, 312, 32767).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jScrollPane2, -1, 302, 32767).addGap(10, 10, 10)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel1, -2, 25, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane2, -1, 189, 32767).addContainerGap()));
        jPanel3.setName("jPanel3");
        jScrollPane3.setEnabled(false);
        jScrollPane3.setName("jScrollPane3");
        jTextArea3.setColumns(20);
        jTextArea3.setEditable(false);
        jTextArea3.setFont(new Font("Monospaced", 0, 24));
        jTextArea3.setRows(5);
        jTextArea3.setText("1.dead down\n2.pass away");
        jTextArea3.setName("jTextArea3");
        jScrollPane3.setViewportView(jTextArea3);
        jLabel2.setFont(new Font("Tahoma", 0, 14));
        jLabel2.setText("Antonymy:");
        jLabel2.setName("jLabel2");
        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2, -1, 291, 32767).addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, -1, 291, 32767));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel2, -2, 26, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane3, -1, 187, 32767)));
        jButton1.setText("Next");
        jButton1.setName("jButton1");
        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }

//            final WordsWindow this$0;
//
//            
//            {
//                this$0 = WordsWindow.this;
//                super();
//            }
        }
);
        jButton2.setText("Last");
        jButton2.setName("jButton2");
        jButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }

//            final WordsWindow this$0;
//
//            
//            {
//                this$0 = WordsWindow.this;
//                super();
//            }
        }
);
        jTextField1.setText("Enter words");
        jTextField1.setName("jTextField1");
        jTextField1.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent evt)
            {
                jTextField1FocusLost(evt);
            }

//            final WordsWindow this$0;
//
//            
//            {
//                this$0 = WordsWindow.this;
//                super();
//            }
        }
);
        jButton3.setText("Return");
        jButton3.setName("jButton3");
        jButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }

//            final WordsWindow this$0;
//
//            
//            {
//                this$0 = WordsWindow.this;
//                super();
//            }
        }
);
        jButton4.setText("Search");
        jButton4.setName("jButton4");
        jButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }

//            final WordsWindow this$0;
//
//            
//            {
//                this$0 = WordsWindow.this;
//                super();
//            }
        }
);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, -1, -1, 32767).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jPanel2, -2, -1, -2).addGap(25, 25, 25).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jButton2, -2, 130, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jButton1, -2, 126, -2)).addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, -2, -1, -2))).addGroup(layout.createSequentialGroup().addComponent(jButton3).addGap(125, 125, 125).addComponent(jTextField1, -2, 236, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton4))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jButton3, -2, 23, -2).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jTextField1, -2, -1, -2).addComponent(jButton4))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel1, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jPanel3, -1, -1, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton1, -2, 33, -2).addComponent(jButton2, -2, 32, -2))).addGroup(layout.createSequentialGroup().addComponent(jPanel2, -1, -1, 32767).addGap(32, 32, 32))).addContainerGap()));
        pack();
    }

    private void formWindowClosing(WindowEvent windowevent)
    {
    }

    private void jButton3ActionPerformed(ActionEvent evt)
    {
        dispose();
        try
        {
            con.close();
        }
        catch(Exception e) { }
    }

    private void jTextField1FocusLost(FocusEvent evt)
    {
        showContent((new StringBuilder()).append("select * from words where word='").append(jTextField1.getText()).append("'").toString());
    }

    private void jButton4ActionPerformed(ActionEvent actionevent)
    {
    }

    private void jButton1ActionPerformed(ActionEvent evt)
    {
        showNextContent(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf("\n")));
    }

    private void jButton2ActionPerformed(ActionEvent evt)
    {
        showPreviousContent(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf("\n")));
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

    private void showContent(String query)
    {
        try
        {
            ResultSet rs = sta.executeQuery(query);
            if(!rs.next())
                JOptionPane.showMessageDialog(new JFrame(), "Not find!", "Error", 1);
            jTextArea1.setText((new StringBuilder()).append(rs.getString("word")).append("\n").append(rs.getString("meaning")).toString());
            String temp = rs.getString("analogy");
            for(int i = 1; i < temp.length(); i++)
                if(temp.charAt(i) <= '9' && temp.charAt(i) >= '0')
                {
                    temp = (new StringBuilder()).append(temp.substring(0, i)).append("\n").append(temp.substring(i)).toString();
                    i++;
                }

            jTextArea3.setText(rs.getString("antonymy"));
            jTextArea2.setText(temp);
        }
        catch(Exception e)
        {
            System.out.println("query wrong!");
        }
    }

    private void showNextContent(String current)
    {
        try
        {
            ResultSet rs = sta.executeQuery("select * from words");
            String temp;
            do
            {
                do
                    if(!rs.next())
                        break;
                while(!rs.getString("word").equals(current));
                if(!rs.next())
                    break;
                jTextArea1.setText((new StringBuilder()).append(rs.getString("word")).append("\n").append(rs.getString("meaning")).toString());
                temp = rs.getString("analogy");
                for(int i = 1; i < temp.length(); i++)
                    if(temp.charAt(i) <= '9' && temp.charAt(i) >= '0')
                    {
                        temp = (new StringBuilder()).append(temp.substring(0, i)).append("\n").append(temp.substring(i)).toString();
                        i++;
                    }

                jTextArea3.setText(rs.getString("antonymy"));
                jTextArea2.setText(temp);
            } while(true);
            rs.first();
            jTextArea1.setText((new StringBuilder()).append(rs.getString("word")).append("\n").append(rs.getString("meaning")).toString());
            temp = rs.getString("analogy");
            for(int i = 1; i < temp.length(); i++)
                if(temp.charAt(i) <= '9' && temp.charAt(i) >= '0')
                {
                    temp = (new StringBuilder()).append(temp.substring(0, i)).append("\n").append(temp.substring(i)).toString();
                    i++;
                }

            jTextArea3.setText(rs.getString("antonymy"));
            jTextArea2.setText(temp);
        }
        catch(Exception e)
        {
            System.out.println("query wrong!");
        }
    }

    private void showPreviousContent(String current)
    {
        try
        {
            ResultSet rs = sta.executeQuery("select * from words");
            do
                if(!rs.next())
                    break;
            while(!rs.getString("word").equals(current));
            if(rs.previous())
            {
                jTextArea1.setText((new StringBuilder()).append(rs.getString("word")).append("\n").append(rs.getString("meaning")).toString());
                String temp = rs.getString("analogy");
                for(int i = 1; i < temp.length(); i++)
                    if(temp.charAt(i) <= '9' && temp.charAt(i) >= '0')
                    {
                        temp = (new StringBuilder()).append(temp.substring(0, i)).append("\n").append(temp.substring(i)).toString();
                        i++;
                    }

                jTextArea3.setText(rs.getString("antonymy"));
                jTextArea2.setText(temp);
            } else
            {
                System.out.println("!!!!!!!!");
                rs.last();
                jTextArea1.setText((new StringBuilder()).append(rs.getString("word")).append("\n").append(rs.getString("meaning")).toString());
                String temp = rs.getString("analogy");
                for(int i = 1; i < temp.length(); i++)
                    if(temp.charAt(i) <= '9' && temp.charAt(i) >= '0')
                    {
                        temp = (new StringBuilder()).append(temp.substring(0, i)).append("\n").append(temp.substring(i)).toString();
                        i++;
                    }

                jTextArea3.setText(rs.getString("antonymy"));
                jTextArea2.setText(temp);
            }
        }
        catch(Exception e)
        {
            System.out.println("query wrong!");
        }
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                (new WordsWindow()).setVisible(true);
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
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;
    private JTextArea jTextArea3;
    private JTextField jTextField1;






}