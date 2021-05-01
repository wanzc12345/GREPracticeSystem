// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:08
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   MainFrame.java

package desktopapplication1;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.sql.*;
import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

// Referenced classes of package desktopapplication1:
//            WordsWindow, AnalyticalWritingWindow, Antonymy, Analogy, 
//            FillingBankWindow, PassageWindow, ChooseTable, user_statistics, 
//            LogIn, AllUsers

public class MainFrame extends JFrame
{

    public MainFrame(String n, String ut)
    {
        connectToDatabase();
        initComponents();
        name = n;
        userType = ut;
        if(userType.equals("administrator"))
        {
            jMenuItem6.setEnabled(true);
            jMenuItem1.setEnabled(true);
            jMenuItem3.setEnabled(false);
        } else
        {
            jMenuItem6.setEnabled(false);
            jMenuItem1.setEnabled(false);
        }
        jLabel3.setText((new StringBuilder()).append("Welcome,").append(name).append("!").toString());
    }

    private void initComponents()
    {
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jLabel1 = new JLabel();
        jButton5 = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem2 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jMenuItem7 = new JMenuItem();
        jMenuItem5 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem6 = new JMenuItem();
        jMenuItem1 = new JMenuItem();
        jMenu3 = new JMenu();
        jMenuItem10 = new JMenuItem();
        jMenu4 = new JMenu();
        jMenuItem11 = new JMenuItem();
        setDefaultCloseOperation(3);
        setTitle("GRE Encyclopedia");
        setResizable(false);
        addWindowListener(new WindowAdapter() {

            public void windowOpened(WindowEvent evt)
            {
                formWindowOpened(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jButton1.setFont(new Font("Viner Hand ITC", 0, 48));
        jButton1.setText("Words");
        jButton1.setName("jButton1");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jButton2.setFont(new Font("Viner Hand ITC", 0, 36));
        jButton2.setText("Analytical Writing");
        jButton2.setName("jButton2");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jButton3.setFont(new Font("Viner Hand ITC", 0, 36));
        jButton3.setText("Analogy");
        jButton3.setName("jButton3");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jButton4.setFont(new Font("Viner Hand ITC", 0, 36));
        jButton4.setText("Antonymy");
        jButton4.setName("jButton4");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jButton6.setFont(new Font("Viner Hand ITC", 0, 14));
        jButton6.setText("Passage");
        jButton6.setName("jButton6");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton6ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jButton7.setFont(new Font("Viner Hand ITC", 0, 18));
        jButton7.setText("Filling Blank");
        jButton7.setName("jButton7");
        jButton7.setOpaque(false);
        jButton7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton7ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jLabel1.setFont(new Font("Vladimir Script", 0, 24));
        jLabel1.setForeground(new Color(255, 255, 0));
        jLabel1.setText("For Michelle");
        jLabel1.setName("jLabel1");
        jButton5.setIcon(new ImageIcon(getClass().getResource("/desktopapplication1/resources/exit.png")));
        jButton5.setName("jButton5");
        jButton5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jLabel2.setText("Tips:Just click what you want and enjoy it!");
        jLabel2.setName("jLabel2");
        jLabel3.setFont(new Font("Tahoma", 0, 24));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        jLabel3.setName("jLabel3");
        jMenuBar1.setName("jMenuBar1");
        jMenu1.setText("File");
        jMenu1.setName("jMenu1");
        jMenuItem2.setText("Log out");
        jMenuItem2.setName("jMenuItem2");
        jMenuItem2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem2ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jMenu1.add(jMenuItem2);
        jMenuItem3.setText("Raise Level");
        jMenuItem3.setName("jMenuItem3");
        jMenuItem3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem3ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jMenu1.add(jMenuItem3);
        jMenuItem7.setText("My grade");
        jMenuItem7.setName("jMenuItem7");
        jMenuItem7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem7ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jMenu1.add(jMenuItem7);
        jMenuItem5.setText("Export");
        jMenuItem5.setName("jMenuItem5");
        jMenuItem5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem5ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jMenu1.add(jMenuItem5);
        jMenuItem4.setText("Exit");
        jMenuItem4.setName("jMenuItem4");
        jMenuItem4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem4ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jMenu1.add(jMenuItem4);
        jMenuBar1.add(jMenu1);
        jMenu2.setText("Edit");
        jMenu2.setName("jMenu2");
        jMenuItem6.setText("Operate on Database");
        jMenuItem6.setName("jMenuItem6");
        jMenuItem6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem6ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jMenu2.add(jMenuItem6);
        jMenuItem1.setText("All users");
        jMenuItem1.setName("jMenuItem1");
        jMenuItem1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jMenu2.add(jMenuItem1);
        jMenuBar1.add(jMenu2);
        jMenu3.setText("Help");
        jMenu3.setName("jMenu3");
        jMenuItem10.setText("Help Content");
        jMenuItem10.setName("jMenuItem10");
        jMenuItem10.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem10ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jMenu3.add(jMenuItem10);
        jMenuBar1.add(jMenu3);
        jMenu4.setText("About");
        jMenu4.setName("jMenu4");
        jMenuItem11.setText("Producer");
        jMenuItem11.setName("jMenuItem11");
        jMenuItem11.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem11ActionPerformed(evt);
            }

//            final MainFrame this$0;
//
//            
//            {
//                this$0 = MainFrame.this;
//                super();
//            }
        }
);
        jMenu4.add(jMenuItem11);
        jMenuBar1.add(jMenu4);
        setJMenuBar(jMenuBar1);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jButton3, -2, 305, -2).addGap(361, 361, 361)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jButton4, -2, 457, -2).addGap(284, 284, 284)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jButton2, -2, 625, -2).addGap(198, 198, 198)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jButton1, -2, 785, -2).addGap(104, 104, 104)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jLabel1, -2, 121, -2).addContainerGap()).addGroup(layout.createSequentialGroup().addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 691, 32767).addComponent(jButton5, -2, 118, -2).addContainerGap()))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(472, 32767).addComponent(jButton6).addGap(478, 478, 478)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(55, 55, 55).addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, 32767).addComponent(jButton7, -2, 149, -2).addGap(444, 444, 444)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, -2, 30, -2).addGap(22, 22, 22).addComponent(jButton6, -2, 43, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton7, -2, 73, -2).addComponent(jLabel3)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton3, -2, 63, -2).addGap(23, 23, 23).addComponent(jButton4, -1, 71, 32767).addGap(18, 18, 18).addComponent(jButton2, -2, 66, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jButton1, -2, 61, -2).addGap(29, 29, 29).addComponent(jButton5, -2, 34, -2)).addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)).addContainerGap()));
        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt)
    {
        (new WordsWindow()).setVisible(true);
    }

    private void formWindowOpened(WindowEvent evt)
    {
        setLocationRelativeTo(getOwner());
        ImageIcon img = new ImageIcon(getClass().getResource("/desktopapplication1/resources/\u91D1\u5B57\u5854.png"));
        JLabel imgLabel = new JLabel(img);
        getLayeredPane().add(imgLabel, new Integer(0x80000000));
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        Container cp = getContentPane();
        ((JPanel)cp).setOpaque(false);
    }

    private void jButton2ActionPerformed(ActionEvent evt)
    {
        (new AnalyticalWritingWindow()).setVisible(true);
    }

    private void jMenuItem4ActionPerformed(ActionEvent evt)
    {
        System.exit(0);
    }

    private void jButton4ActionPerformed(ActionEvent evt)
    {
        (new Antonymy()).setVisible(true);
    }

    private void jButton3ActionPerformed(ActionEvent evt)
    {
        (new Analogy()).setVisible(true);
    }

    private void jButton7ActionPerformed(ActionEvent evt)
    {
        (new FillingBankWindow()).setVisible(true);
    }

    private void jButton6ActionPerformed(ActionEvent evt)
    {
        (new PassageWindow()).setVisible(true);
    }

    private void jButton5ActionPerformed(ActionEvent evt)
    {
        System.exit(0);
    }

    private void jMenuItem10ActionPerformed(ActionEvent evt)
    {
        JOptionPane.showMessageDialog(this, "The following are user's help,find out what you need:\n1.Please read the title of every button before you click on it;\n2.If you want to operate on the database directly, you should raise your operation level at first;\n3.If you still have any questions or suggestions in using, contact me by following information:\n\nE-mail: wanzhicheng12345@163.com.\n", "Help", 1);
    }

    private void jMenuItem11ActionPerformed(ActionEvent evt)
    {
        JOptionPane.showMessageDialog(this, "Developer:\nJensen(main work)\nMicki(support)\nThank you for using!", "About", 1);
    }

    private void jMenuItem6ActionPerformed(ActionEvent evt)
    {
        ChooseTable ct = new ChooseTable();
        ct.setVisible(true);
    }

    private void jMenuItem7ActionPerformed(ActionEvent evt)
    {
        (new user_statistics()).setVisible(true);
    }

    private void jMenuItem2ActionPerformed(ActionEvent evt)
    {
        dispose();
        (new LogIn()).setVisible(true);
    }

    private void jMenuItem3ActionPerformed(ActionEvent evt)
    {
        if(name.trim().equals("jensen"))
        {
            JOptionPane.showMessageDialog(this, "Sorry, your don't have answered 1000 questions!");
        } else
        {
            JOptionPane.showMessageDialog(this, "Raise level success!");
            jMenuItem6.setEnabled(true);
            jMenuItem1.setEnabled(true);
            jMenuItem3.setEnabled(false);
        }
    }

    private void jMenuItem1ActionPerformed(ActionEvent evt)
    {
        try
        {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        }
        catch(Exception e) { }
        JFrame frame = new JFrame();
                frame.setContentPane(new AllUsers());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);;
    }

    private void jMenuItem5ActionPerformed(ActionEvent evt)
    {
        try
        {
            ResultSet rs = sta.executeQuery("select * from grade where name='wan'");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element comp = doc.createElement("GRADE");
            Element person;
            for(; rs.next(); comp.appendChild(person))
            {
                person = doc.createElement("STUDENT");
                Element deptno = doc.createElement("NAME");
                deptno.appendChild(doc.createTextNode(rs.getString(1)));
                person.appendChild(deptno);
                Element dname = doc.createElement("BLANK");
                dname.appendChild(doc.createTextNode(rs.getString(2)));
                person.appendChild(dname);
                Element loc = doc.createElement("PASSAGE");
                loc.appendChild(doc.createTextNode(rs.getString(3)));
                person.appendChild(loc);
                Element loc2 = doc.createElement("ANALOGYANDANTONYMY");
                loc2.appendChild(doc.createTextNode(rs.getString(4)));
                person.appendChild(loc2);
                Element loc3 = doc.createElement("PASSAGECORRECT");
                loc3.appendChild(doc.createTextNode(rs.getString(5)));
                person.appendChild(loc3);
                Element loc4 = doc.createElement("BLANKCORRECT");
                loc4.appendChild(doc.createTextNode(rs.getString(6)));
                person.appendChild(loc4);
                Element loc5 = doc.createElement("ANALOGYANDANTONYMYCORRECT");
                loc5.appendChild(doc.createTextNode(rs.getString(7)));
                person.appendChild(loc5);
            }

            rs.close();
            sta.close();
            doc.appendChild(comp);
            JOptionPane.showMessageDialog(this, "Generation success!");
        }
        catch(Exception e)
        {
            System.out.print(e);
            JOptionPane.showMessageDialog(this, "Generation failed!");
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
            System.out.println((new StringBuilder()).append("Connection wrong!").append(e).toString());
        }
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                (new MainFrame("wan", "ea")).setVisible(true);
            }

        }
);
    }

    private String name;
    private String userType;
    private String url;
    private Connection con;
    private Statement sta;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem10;
    private JMenuItem jMenuItem11;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;

















}