// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:05
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   FillingBankWindow.java

package desktopapplication1;

import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.sql.*;
import java.util.Random;
import javax.swing.*;

public class FillingBankWindow extends JFrame
{

    public FillingBankWindow()
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
        setTitle("Analogy");
        setBounds(new Rectangle(400, 100, 100, 100));
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setName("jPanel1");
        jScrollPane1.setHorizontalScrollBarPolicy(31);
        jScrollPane1.setName("jScrollPane1");
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("2002\u5E7411\u6708\n1. Although she gives badly ____ titles to her musical compositions, they ____unusual combinations of materials including Gregorian chant, Asian scale patterns and rhythms,electronic sounds, and bird songs.");
        jTextArea1.setName("jTextArea1");
        jScrollPane1.setViewportView(jTextArea1);
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("exotic...belie");
        jRadioButton1.setName("jRadioButton1");
        jRadioButton1.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt)
            {
                jRadioButton1MouseClicked(evt);
            }

//            final FillingBankWindow this$0;
//
//            
//            {
//                this$0 = FillingBankWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("eccentric...deploy");
        jRadioButton2.setName("jRadioButton2");
        jRadioButton2.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt)
            {
                jRadioButton2MouseClicked(evt);
            }

//            final FillingBankWindow this$0;
//
//            
//            {
//                this$0 = FillingBankWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("traditional...exclude");
        jRadioButton3.setName("jRadioButton3");
        jRadioButton3.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt)
            {
                jRadioButton3MouseClicked(evt);
            }

//            final FillingBankWindow this$0;
//
//            
//            {
//                this$0 = FillingBankWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("imaginative...disguise");
        jRadioButton4.setName("jRadioButton4");
        jRadioButton4.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt)
            {
                jRadioButton4MouseClicked(evt);
            }

//            final FillingBankWindow this$0;
//
//            
//            {
//                this$0 = FillingBankWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("conventional...incorporate");
        jRadioButton5.setName("jRadioButton5");
        jRadioButton5.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt)
            {
                jRadioButton5MouseClicked(evt);
            }

//            final FillingBankWindow this$0;
//
//            
//            {
//                this$0 = FillingBankWindow.this;
//                super();
//            }
        }
);
        jLabel2.setName("jLabel2");
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jRadioButton2).addComponent(jRadioButton1).addComponent(jRadioButton3).addComponent(jRadioButton4).addComponent(jRadioButton5)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, 32767).addComponent(jLabel2, -2, 130, -2).addContainerGap()).addComponent(jScrollPane1, -1, 397, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jScrollPane1, -2, 165, -2).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jRadioButton1).addGap(7, 7, 7).addComponent(jRadioButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton5)).addComponent(jLabel2, -1, 131, 32767)).addContainerGap(20, 32767)));
        jButton1.setText("Return");
        jButton1.setName("jButton1");
        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }

//            final FillingBankWindow this$0;
//
//            
//            {
//                this$0 = FillingBankWindow.this;
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
        jTextArea2.setText("\u2160.\u76EE\u7684 Objective\n\n\u6C89\u7740\u51B7\u9759\uFF0C\u80F8\u6709\u6210\u7AF9\u5730\u6D88\u706DGRE\u8BED\u6587\u90E8\u5206\u7684\u7B2C\u4E00\u53EA\u62E6\u8DEF\u864E\uFF0C\u4EE5\u6781\u5FEB\u7684\u901F\u5EA6\u548C\u6781\u9AD8\u7684\u51C6\u786E\u7387\u4E3A\u540E\u9762\u51E0\u9879\u5185\u5BB9\u6253\u4E0B\u53D6\u80DC\u4E0E\u5FC5\u80DC\u7684\u57FA\u7840\uFF0C\u5E76\u8282\u7701\u51FA\u76F8\u5F53\u591A\u7684\u65F6\u95F4\uFF0C\u4E89\u53D6\u6BCF\u9898\u90FD\u4E0D\u5931\u8BEF\u6216\u81F3\u591A\u53EA\u5931\u8BEF\u4E00\u9053\u9898\u3002\n\n\n ");
        jTextArea2.setEnabled(false);
        jTextArea2.setName("jTextArea2");
        jScrollPane2.setViewportView(jTextArea2);
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(93, 93, 93).addComponent(jLabel1, -2, 73, -2).addContainerGap(97, 32767)).addComponent(jScrollPane2, -1, 263, 32767));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, -2, 28, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane2, -1, 334, 32767)));
        jButton2.setText("Next");
        jButton2.setName("jButton2");
        jButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }

//            final FillingBankWindow this$0;
//
//            
//            {
//                this$0 = FillingBankWindow.this;
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

//            final FillingBankWindow this$0;
//
//            
//            {
//                this$0 = FillingBankWindow.this;
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

//            final FillingBankWindow this$0;
//
//            
//            {
//                this$0 = FillingBankWindow.this;
//                super();
//            }
        }
);
        jCheckBox1.setText("Auto next");
        jCheckBox1.setName("jCheckBox1");
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, 32767).addComponent(jCheckBox1)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jButton3).addGap(109, 109, 109).addComponent(jButton4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, 32767).addComponent(jButton2)).addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, -2, -1, -2)).addGap(10, 10, 10).addComponent(jPanel2, -2, -1, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(jPanel2, -1, -1, 32767).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1, -2, 30, -2).addComponent(jCheckBox1)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jPanel1, -2, -1, -2))).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton2).addComponent(jButton3).addComponent(jButton4)).addContainerGap(20, 32767)));
        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt)
    {
        dispose();
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
            for(ResultSet rs = sta.executeQuery("select * from filling_blank"); rs.next();)
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
            con = DriverManager.getConnection(url, "root", "");
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
            ResultSet rs = sta.executeQuery((new StringBuilder()).append("select * from filling_blank where id=").append(id).toString());
            if(!rs.next())
                JOptionPane.showMessageDialog(new JFrame(), "It's the last one!", "Error", 1);
            String antonymy = rs.getString("options");
            String question = rs.getString("question");
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
            answer = rs.getString("answer").charAt(0);
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
                (new FillingBankWindow()).setVisible(true);
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