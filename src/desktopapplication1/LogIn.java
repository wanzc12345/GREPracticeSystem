// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:06
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   LogIn.java

package desktopapplication1;

import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.sql.*;
import javax.swing.*;

// Referenced classes of package desktopapplication1:
//            MainFrame, Enroll

public class LogIn extends JFrame
{

    public LogIn()
    {
        initComponents();
    }

    private void initComponents()
    {
        connectToDatabase();
        jPanel2 = new JPanel();
        jComboBox2 = new JTextField();
        jComboBox3 = new JComboBox();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jComboBox1 = new JComboBox();
        jLabel2 = new JLabel();
        jButton3 = new JButton();
        jLabel3 = new JButton();
        jLabel4 = new JButton();
        jPasswordField = new JPasswordField();
        setDefaultCloseOperation(3);
        setTitle("Log In");
        setName("Log In");
        jPanel2.setName("jPanel2");
        jComboBox2.setText("Jensen");
        jComboBox2.setName("jComboBox2");
        jComboBox3.setModel(new DefaultComboBoxModel(new String[] {
            "password", "Item 2", "Item 3", "Item 4"
        }));
        jComboBox3.setName("jComboBox3");
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jComboBox2, 0, 159, 32767).addComponent(jPasswordField, 0, 159, 32767));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jComboBox2, -2, 29, -2).addGap(18, 18, 18).addComponent(jPasswordField, -1, 30, 32767).addContainerGap()));
        jPasswordField.setText("wanzc");
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/desktopapplication1/resources/GRElogo.png")));
        jLabel1.setText(null);
        jLabel1.setName("jLabel1");
        jPanel1.setBackground(new Color(255, 153, 255));
        jPanel1.setName("jPanel1");
        jButton1.setText("Start");
        jButton1.setName("jButton1");
        jComboBox1.setModel(new DefaultComboBoxModel(new String[] {
            "Student", "Administrator"
        }));
        jComboBox1.setName("jComboBox1");
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jButton1, -2, 80, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, 32767).addComponent(jComboBox1, -2, 90, -2).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1).addComponent(jComboBox1, -2, -1, -2)).addContainerGap(-1, 32767)));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/desktopapplication1/resources/jay.png")));
        jLabel2.setText(null);
        jLabel2.setName("jLabel2");
        jButton3.setText("Reg");
        jButton3.setName("jButton3");
        jLabel3.setText("Reg");
        jLabel3.setName("jLabel3");
        jLabel3.setOpaque(false);
        jLabel4.setText("Find");
        jLabel4.setName("jLabel4");
        jLabel4.setOpaque(false);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, 0, 0, 32767).addGroup(layout.createSequentialGroup().addComponent(jLabel2, -2, 105, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel2, -2, -1, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton3, -2, 0, -2)).addComponent(jLabel3, -1, 38, 32767)).addContainerGap()).addComponent(jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, -1, 79, 32767).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(11, 11, 11).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, -2, -1, -2).addComponent(jLabel2, -2, 99, -2))).addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addComponent(jLabel3, -2, 27, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4, -2, 27, -2).addComponent(jButton3, -2, 34, -2)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel1, -2, -1, -2)));
        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                try
                {
                    String userType = jComboBox1.getSelectedItem().toString().toLowerCase();
                    String queryName = jComboBox2.getText().toString().toLowerCase();
                    char queryPassword[] = jPasswordField.getPassword();
                    ResultSet rs = sta.executeQuery((new StringBuilder()).append("select password from ").append(userType).append(" where name=\"").append(queryName).append("\"").toString());
                    if(!rs.next())
                        JOptionPane.showMessageDialog(new JFrame(), (new StringBuilder()).append("Your're not ").append(userType).append("!").toString(), "Error", 1);
                    rs.previous();
                    do
                    {
                        if(!rs.next())
                            break;
                        String Password = rs.getString("password");
                        int i;
                        for(i = 0; i < Password.length() && queryPassword[i] == Password.charAt(i); i++);
                        if(i != Password.length())
                            break;
                        con.close();
                        dispose();
                        (new MainFrame(queryName, userType)).setVisible(true);
                    } while(true);
                    JOptionPane.showMessageDialog(new JFrame(), "Different password!", "Error", 1);
                }
                catch(Exception e)
                {
                    System.out.println("query wrong!");
                }
                jLabel2.setIcon(new ImageIcon(getClass().getResource("/desktopapplication1/resources/micki.png")));
                return;
            }

//            final LogIn this$0;
//
//            
//            {
//                this$0 = LogIn.this;
//                super();
//            }
        }
);
        jLabel3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                (new Enroll()).setVisible(true);
            }

//            final LogIn this$0;
//
//            
//            {
//                this$0 = LogIn.this;
//                super();
//            }
        }
);
        setTitle("Log In");
        setResizable(false);
        setLocation(500, 200);
        pack();
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
            System.out.println((new StringBuilder()).append("Connection wrong!").append(e).toString());
        }
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                try
                {
                    UIManager.setLookAndFeel(new NimRODLookAndFeel());
                }
                catch(Exception e) { }
                (new LogIn()).setVisible(true);
            }
        }
    );
    }

    private JPasswordField jPasswordField;
    private String url;
    private Connection con;
    private Statement sta;
    private JButton jButton1;
    private JButton jButton3;
    private JComboBox jComboBox1;
    private JTextField jComboBox2;
    private JComboBox jComboBox3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JButton jLabel3;
    private JButton jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;

}