// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:01
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Antonymy.java

package desktopapplication1;

import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.sql.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Antonymy extends JFrame
{

    public Antonymy()
    {
        connectToDatabase();
        initComponents();
        showContent("1");
    }

    private void initComponents()
    {
        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jScrollPane2 = new JScrollPane();
        jTextArea2 = new JTextArea();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jCheckBox1 = new JCheckBox();
        setDefaultCloseOperation(2);
        setTitle("Antonymy");
        setBounds(new Rectangle(400, 100, 100, 100));
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setName("jPanel1");
        jScrollPane1.setHorizontalScrollBarPolicy(31);
        jScrollPane1.setName("jScrollPane1");
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new Font("Monospaced", 0, 24));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("2008\u5E746\u6708\nAMNESIA:");
        jTextArea1.setName("jTextArea1");
        jScrollPane1.setViewportView(jTextArea1);
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("hyperactivity");
        jRadioButton1.setName("jRadioButton1");
        jRadioButton1.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt)
            {
                jRadioButton1MouseClicked(evt);
            }

//            final Antonymy this$0;
//
//            
//            {
//                this$0 = Antonymy.this;
//                super();
//            }
        }
);
        jRadioButton1.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent evt)
            {
                jRadioButton1StateChanged(evt);
            }

//            final Antonymy this$0;
//
//            
//            {
//                this$0 = Antonymy.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("discipline");
        jRadioButton2.setName("jRadioButton2");
        jRadioButton2.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt)
            {
                jRadioButton2MouseClicked(evt);
            }

//            final Antonymy this$0;
//
//            
//            {
//                this$0 = Antonymy.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("suspicion");
        jRadioButton3.setName("jRadioButton3");
        jRadioButton3.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt)
            {
                jRadioButton3MouseClicked(evt);
            }

//            final Antonymy this$0;
//
//            
//            {
//                this$0 = Antonymy.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("retentiveness");
        jRadioButton4.setName("jRadioButton4");
        jRadioButton4.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt)
            {
                jRadioButton4MouseClicked(evt);
            }

//            final Antonymy this$0;
//
//            
//            {
//                this$0 = Antonymy.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("creativity");
        jRadioButton5.setName("jRadioButton5");
        jRadioButton5.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt)
            {
                jRadioButton5MouseClicked(evt);
            }

//            final Antonymy this$0;
//
//            
//            {
//                this$0 = Antonymy.this;
//                super();
//            }
        }
);
        jLabel2.setName("jLabel2");
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, -1, 329, 32767).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jRadioButton2).addComponent(jRadioButton1).addComponent(jRadioButton3).addComponent(jRadioButton4).addComponent(jRadioButton5)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, 32767).addComponent(jLabel2, -2, 130, -2).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jScrollPane1, -2, 165, -2).addGap(25, 25, 25).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jRadioButton1).addGap(7, 7, 7).addComponent(jRadioButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton5)).addComponent(jLabel2, -1, 131, 32767)).addContainerGap(20, 32767)));
        jButton1.setText("Return");
        jButton1.setName("jButton1");
        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }

//            final Antonymy this$0;
//
//            
//            {
//                this$0 = Antonymy.this;
//                super();
//            }
        }
);
        jPanel2.setName("jPanel2");
        jLabel1.setFont(new Font("Tw Cen MT Condensed Extra Bold", 1, 18));
        jLabel1.setHorizontalAlignment(0);
        jLabel1.setText("Tips");
        jLabel1.setName("jLabel1");
        jScrollPane2.setHorizontalScrollBarPolicy(31);
        jScrollPane2.setName("jScrollPane2");
        jTextArea2.setBackground(new Color(204, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setFont(new Font("Monospaced", 0, 14));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("\u4E00 \u8BA4\u4E0D\u5230\u9898\u5E72\n \u628A\u51E0\u4E2A\u9009\u9879\u6C42\u53CD\uFF0C \u8DDF\u7740\u4F60\u7684\u611F\u89C9\u9009\uFF1B\u6982\u7387\u4F1A\u5927\u4E00\u4E9B\u3002\u6BD4\u5982a\u9009\u9879\u662F\u2018\u540E\u6094\u2019\uFF0C\u4F60\u5C31\u60F3\u2018\u4E0D\u540E\u6094\u2019\uFF0C\u7136\u540E\u548C\u9898\u5E72\u6BD4\u8F83\u3002 \u56E0\u4E3A\u5982\u679C\u4F60\u4EE5\u524D\u80CC\u8FC7\u7684\u8BDD\uFF0C\u8FD9\u4E9B\u6240\u8C13\u8BA4\u4E0D\u5230\u7684\u5355\u8BCD\u5927\u591A\u4F1A\u6709\u4E00\u70B9\u4E9B\u5FAE\u7684\u5370\u8C61\uFF0C\u53EA\u4E0D\u8FC7\u4E34\u65F6\u8BB0\u4E0D\u8D77\u6765\u7F62\u4E86\u3002 \u628A\u9009\u9879\u53D6\u975E\uFF0C\u6709\u53EF\u80FD\u5524\u9192\u4E9B\u8BB8\u5BF9\u8FD9\u4E2A\u5355\u8BCD\u7684\u6B8B\u7559\u8BB0\u5FC6\uFF0C\u8FD9\u6837\u9009\u7684\u6982\u7387\u6BD4\u5168\u8499\u603B\u4F1A\u5927\u4E9B\u7684\u3002 \u6709\u4EBA\u8BF4\u6839\u636E\u611F\u60C5\u8272\u5F69\u9009\uFF0C\u4E5F\u662F\u8FD9\u4E2A\u9053\u7406\uFF0D\uFF0D\u80CC\u8FC7\u7684\u5355\u8BCD\uFF0C\u8BCD\u4E49\u5FD8\u8BB0\u4E86\uFF0C\u591A\u5C11\u4E5F\u4F1A\u6709\u70B9\u8912\u8D2C\u7684\u611F\u60C5\u5370\u8C61\u6B8B\u7559\u7684\u3002\n ");
        jTextArea2.setEnabled(false);
        jTextArea2.setName("jTextArea2");
        jScrollPane2.setViewportView(jTextArea2);
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(93, 93, 93).addComponent(jLabel1, -2, 73, -2).addContainerGap(97, 32767)).addComponent(jScrollPane2, -1, 263, 32767));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, -2, 28, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane2, -1, 341, 32767)));
        jButton2.setText("Next");
        jButton2.setName("jButton2");
        jButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }

//            final Antonymy this$0;
//
//            
//            {
//                this$0 = Antonymy.this;
//                super();
//            }
        }
);
        jButton3.setText("Last");
        jButton3.setName("jButton3");
        jButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }

//            final Antonymy this$0;
//
//            
//            {
//                this$0 = Antonymy.this;
//                super();
//            }
        }
);
        jButton4.setText("Random");
        jButton4.setName("jButton4");
        jButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }

//            
        }
);
        jCheckBox1.setText("Auto next");
        jCheckBox1.setName("jCheckBox1");
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(jButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jCheckBox1)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jButton3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jButton4).addGap(76, 76, 76).addComponent(jButton2)).addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, -2, -1, -2)).addGap(10, 10, 10).addComponent(jPanel2, -2, -1, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(jPanel2, -1, -1, 32767).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1, -2, 30, -2).addComponent(jCheckBox1)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jPanel1, -2, -1, -2))).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton2).addComponent(jButton3).addComponent(jButton4)).addContainerGap(13, 32767)));
        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt)
    {
        dispose();
    }

    private void jRadioButton1StateChanged(ChangeEvent changeevent)
    {
    }

    private void jRadioButton1MouseClicked(MouseEvent evt)
    {
        if(answer == 'A')
        {
            jLabel2.setIcon(new ImageIcon("E:\\Program\\java\\DesktopApplication1\\src\\desktopapplication1\\resources\\\u7B11\u8138.png"));
            if(jCheckBox1.isSelected())
            {
                int id = Integer.parseInt(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf(".")).trim());
                id++;
                showContent(String.valueOf(id));
                jLabel2.setIcon(null);
                jRadioButton1.setSelected(false);
            }
        } else
        {
            jLabel2.setIcon(new ImageIcon("E:\\Program\\java\\DesktopApplication1\\src\\desktopapplication1\\resources\\\u54ED\u8138.png"));
        }
    }

    private void jRadioButton2MouseClicked(MouseEvent evt)
    {
        if(answer == 'B')
        {
            jLabel2.setIcon(new ImageIcon("E:\\Program\\java\\DesktopApplication1\\src\\desktopapplication1\\resources\\\u7B11\u8138.png"));
            if(jCheckBox1.isSelected())
            {
                int id = Integer.parseInt(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf(".")).trim());
                id++;
                showContent(String.valueOf(id));
                jLabel2.setIcon(null);
                jRadioButton2.setSelected(false);
            }
        } else
        {
            jLabel2.setIcon(new ImageIcon("E:\\Program\\java\\DesktopApplication1\\src\\desktopapplication1\\resources\\\u54ED\u8138.png"));
        }
    }

    private void jRadioButton3MouseClicked(MouseEvent evt)
    {
        if(answer == 'C')
        {
            jLabel2.setIcon(new ImageIcon("E:\\Program\\java\\DesktopApplication1\\src\\desktopapplication1\\resources\\\u7B11\u8138.png"));
            if(jCheckBox1.isSelected())
            {
                int id = Integer.parseInt(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf(".")).trim());
                id++;
                showContent(String.valueOf(id));
                jLabel2.setIcon(null);
                jRadioButton3.setSelected(false);
            }
        } else
        {
            jLabel2.setIcon(new ImageIcon("E:\\Program\\java\\DesktopApplication1\\src\\desktopapplication1\\resources\\\u54ED\u8138.png"));
        }
    }

    private void jRadioButton4MouseClicked(MouseEvent evt)
    {
        if(answer == 'D')
        {
            jLabel2.setIcon(new ImageIcon("E:\\Program\\java\\DesktopApplication1\\src\\desktopapplication1\\resources\\\u7B11\u8138.png"));
            if(jCheckBox1.isSelected())
            {
                int id = Integer.parseInt(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf(".")).trim());
                id++;
                showContent(String.valueOf(id));
                jLabel2.setIcon(null);
                jRadioButton4.setSelected(false);
            }
        } else
        {
            jLabel2.setIcon(new ImageIcon("E:\\Program\\java\\DesktopApplication1\\src\\desktopapplication1\\resources\\\u54ED\u8138.png"));
        }
    }

    private void jRadioButton5MouseClicked(MouseEvent evt)
    {
        if(answer == 'E')
        {
            jLabel2.setIcon(new ImageIcon("E:\\Program\\java\\DesktopApplication1\\src\\desktopapplication1\\resources\\\u7B11\u8138.png"));
            if(jCheckBox1.isSelected())
            {
                int id = Integer.parseInt(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf(".")).trim());
                id++;
                showContent(String.valueOf(id));
                jLabel2.setIcon(null);
                jRadioButton5.setSelected(false);
            }
        } else
        {
            jLabel2.setIcon(new ImageIcon("E:\\Program\\java\\DesktopApplication1\\src\\desktopapplication1\\resources\\\u54ED\u8138.png"));
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt)
    {
        int id = Integer.parseInt(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf(".")).trim());
        id++;
        jLabel2.setIcon(null);
        showContent(String.valueOf(id));
    }

    private void jButton3ActionPerformed(ActionEvent evt)
    {
        int id = Integer.parseInt(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf(".")).trim());
        id--;
        jLabel2.setIcon(null);
        showContent(String.valueOf(id));
    }

    private void jButton4ActionPerformed(ActionEvent evt)
    {
        Random rand = new Random(System.currentTimeMillis());
        int count = 0;
        try
        {
            for(ResultSet rs = sta.executeQuery("select * from verbal"); rs.next();)
                count++;

        }
        catch(Exception e) { }
        showContent(String.valueOf(rand.nextInt(count) + 1));
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

    private void showContent(String id)
    {
        try
        {
            ResultSet rs = sta.executeQuery((new StringBuilder()).append("select * from verbal where id=").append(id).toString());
            if(!rs.next())
                JOptionPane.showMessageDialog(new JFrame(), "It's the last one!", "Error", 1);
            String antonymy = rs.getString("antonymy");
            String question = antonymy.substring(0, antonymy.indexOf("\n"));
            antonymy = antonymy.substring(antonymy.indexOf("\n") + 1);
            String optionA = antonymy.substring(0, antonymy.indexOf("\n"));
            antonymy = antonymy.substring(antonymy.indexOf("\n") + 1);
            String optionB = antonymy.substring(0, antonymy.indexOf("\n"));
            antonymy = antonymy.substring(antonymy.indexOf("\n") + 1);
            String optionC = antonymy.substring(0, antonymy.indexOf("\n"));
            antonymy = antonymy.substring(antonymy.indexOf("\n") + 1);
            String optionD = antonymy.substring(0, antonymy.indexOf("\n"));
            antonymy = antonymy.substring(antonymy.indexOf("\n") + 1);
            String optionE = antonymy;
            jTextArea1.setText((new StringBuilder()).append(rs.getString("id")).append(".").append(question).append("(").append(rs.getString("year_month")).append(")").toString());
            jRadioButton1.setText(optionA);
            jRadioButton2.setText(optionB);
            jRadioButton3.setText(optionC);
            jRadioButton4.setText(optionD);
            jRadioButton5.setText(optionE);
            answer = rs.getString("antonymy_answer").charAt(0);
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
                (new Antonymy()).setVisible(true);
            }

        }
);
    }

    private char answer;
    private String url;
    private Connection con;
    private Statement sta;
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JCheckBox jCheckBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JRadioButton jRadioButton5;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;










}