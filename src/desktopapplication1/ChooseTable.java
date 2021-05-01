// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:02
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ChooseTable.java

package desktopapplication1;

import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.jdesktop.application.*;

// Referenced classes of package desktopapplication1:
//            DesktopApplication1, WordsTable, AnalyticalWritingTable

public class ChooseTable extends JFrame
{

    public ChooseTable()
    {
        initComponents();
        setLocationRelativeTo(getOwner());
        jButton1.setText("W");
        jButton1.setFont(new Font("Bookman Old Style", 0, 48));
        jButton1.setForeground(Color.YELLOW);
        jButton2.setText("V");
        jButton2.setFont(new Font("Bookman Old Style", 0, 48));
        jButton2.setForeground(Color.YELLOW);
        jButton3.setText("A");
        jButton3.setFont(new Font("Bookman Old Style", 0, 48));
        jButton3.setForeground(Color.YELLOW);
        jButton4.setText("P");
        jButton4.setFont(new Font("Bookman Old Style", 0, 48));
        jButton4.setForeground(Color.YELLOW);
        jButton5.setText("B");
        jButton5.setFont(new Font("Bookman Old Style", 0, 48));
        jButton5.setForeground(Color.YELLOW);
        setTitle("Table View");
    }

    private void initComponents()
    {
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        setDefaultCloseOperation(2);
        setName("Form");
        addWindowListener(new WindowAdapter() {

            public void windowOpened(WindowEvent evt)
            {
                formWindowOpened(evt);
            }

//            final ChooseTable this$0;
//
//            
//            {
//                this$0 = ChooseTable.this;
//                super();
//            }
        }
);
        ResourceMap resourceMap = ((DesktopApplication1)Application.getInstance(desktopapplication1.DesktopApplication1.class)).getContext().getResourceMap(desktopapplication1.ChooseTable.class);
        jButton1.setFont(resourceMap.getFont("jButton1.font"));
        jButton1.setText(resourceMap.getString("jButton1.text", new Object[0]));
        jButton1.setName("jButton1");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }

//            final ChooseTable this$0;
//
//            
//            {
//                this$0 = ChooseTable.this;
//                super();
//            }
        }
);
        jButton2.setFont(resourceMap.getFont("jButton2.font"));
        jButton2.setText(resourceMap.getString("jButton2.text", new Object[0]));
        jButton2.setName("jButton2");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }

//            final ChooseTable this$0;
//
//            
//            {
//                this$0 = ChooseTable.this;
//                super();
//            }
        }
);
        jButton3.setFont(resourceMap.getFont("jButton3.font"));
        jButton3.setText(resourceMap.getString("jButton3.text", new Object[0]));
        jButton3.setName("jButton3");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }

//            final ChooseTable this$0;
//
//            
//            {
//                this$0 = ChooseTable.this;
//                super();
//            }
        }
);
        jButton4.setFont(resourceMap.getFont("jButton4.font"));
        jButton4.setText(resourceMap.getString("jButton4.text", new Object[0]));
        jButton4.setName("jButton4");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }

//            final ChooseTable this$0;
//
//            
//            {
//                this$0 = ChooseTable.this;
//                super();
//            }
        }
);
        jButton5.setFont(resourceMap.getFont("jButton5.font"));
        jButton5.setText(resourceMap.getString("jButton5.text", new Object[0]));
        jButton5.setName("jButton5");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }

//            final ChooseTable this$0;
//
//            
//            {
//                this$0 = ChooseTable.this;
//                super();
//            }
        }
);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(79, 79, 79).addComponent(jButton2, -2, 103, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, 32767).addComponent(jButton3, -2, 106, -2).addGap(83, 83, 83)).addGroup(layout.createSequentialGroup().addGap(259, 259, 259).addComponent(jButton1, -2, 103, -2).addContainerGap(263, 32767)).addGroup(layout.createSequentialGroup().addGap(142, 142, 142).addComponent(jButton4, -2, 107, -2).addGap(123, 123, 123).addComponent(jButton5, -2, 108, -2).addContainerGap(145, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(74, 74, 74).addComponent(jButton1, -2, 95, -2).addGap(41, 41, 41).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton2, -2, 102, -2).addComponent(jButton3, -1, 102, 32767)).addGap(100, 100, 100).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton4, -2, 107, -2).addComponent(jButton5, -1, 107, 32767)).addGap(64, 64, 64)));
        pack();
    }

    private void formWindowOpened(WindowEvent evt)
    {
        ImageIcon img = new ImageIcon("E:\\program\\java\\GreEncylcopedia\\src\\greencylcopedia\\resources\\\u4E94\u7075\u73E0.png");
        JLabel imgLabel = new JLabel(img);
        getLayeredPane().add(imgLabel, new Integer(0x80000000));
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        Container cp = getContentPane();
        ((JPanel)cp).setOpaque(false);
    }

    private void jButton1ActionPerformed(ActionEvent evt)
    {
        try
        {
            UIManager.setLookAndFeel(new NimRODLookAndFeel());
        }
        catch(Exception e) { }
        JFrame frame = new JFrame();
        frame.setContentPane(new WordsTable());
        frame.setDefaultCloseOperation(2);
        frame.pack();
        frame.setLocationRelativeTo(getOwner());
        frame.setVisible(true);
        frame.setTitle("Words");
    }

    private void jButton3ActionPerformed(ActionEvent evt)
    {
        try
        {
            UIManager.setLookAndFeel(new NimRODLookAndFeel());
        }
        catch(Exception e) { }
        JFrame frame = new JFrame();
        frame.setContentPane(new AnalyticalWritingTable());
        frame.setDefaultCloseOperation(2);
        frame.pack();
        frame.setLocationRelativeTo(getOwner());
        frame.setVisible(true);
        frame.setTitle("Analytical Writing");
    }

    private void jButton2ActionPerformed(ActionEvent evt)
    {
        try
        {
            UIManager.setLookAndFeel(new NimRODLookAndFeel());
        }
        catch(Exception e) { }
        JFrame frame = new JFrame();
        frame.setContentPane(new WordsTable());
        frame.setDefaultCloseOperation(2);
        frame.pack();
        frame.setLocationRelativeTo(getOwner());
        frame.setVisible(true);
        frame.setTitle("Analogy and Antonymy");
    }

    private void jButton4ActionPerformed(ActionEvent evt)
    {
        try
        {
            UIManager.setLookAndFeel(new NimRODLookAndFeel());
        }
        catch(Exception e) { }
        JFrame frame = new JFrame();
        frame.setContentPane(new AnalyticalWritingTable());
        frame.setDefaultCloseOperation(2);
        frame.pack();
        frame.setLocationRelativeTo(getOwner());
        frame.setVisible(true);
        frame.setTitle("Passage");
    }

    private void jButton5ActionPerformed(ActionEvent evt)
    {
        try
        {
            UIManager.setLookAndFeel(new NimRODLookAndFeel());
        }
        catch(Exception e) { }
        JFrame frame = new JFrame();
        frame.setContentPane(new WordsTable());
        frame.setDefaultCloseOperation(2);
        frame.pack();
        frame.setLocationRelativeTo(getOwner());
        frame.setVisible(true);
        frame.setTitle("Filling the Blank");
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                (new ChooseTable()).setVisible(true);
            }

        }
);
    }

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;






}