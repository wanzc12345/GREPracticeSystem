// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:17
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   user_statistics.java

package desktopapplication1;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.sql.*;
import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.jdesktop.application.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

// Referenced classes of package desktopapplication1:
//            DesktopApplication1

public class user_statistics extends JFrame
{

    public user_statistics()
    {
        initComponents();
        connectToDatabase();
        showContent();
        setLocationRelativeTo(getOwner());
    }

    private void initComponents()
    {
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        setDefaultCloseOperation(2);
        setName("Form");
        ResourceMap resourceMap = ((DesktopApplication1)Application.getInstance(desktopapplication1.DesktopApplication1.class)).getContext().getResourceMap(desktopapplication1.user_statistics.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text", new Object[0]));
        jLabel1.setName("jLabel1");
        jLabel3.setText(resourceMap.getString("jLabel3.text", new Object[0]));
        jLabel3.setName("jLabel3");
        jLabel4.setText(resourceMap.getString("jLabel4.text", new Object[0]));
        jLabel4.setName("jLabel4");
        jLabel5.setText(resourceMap.getString("jLabel5.text", new Object[0]));
        jLabel5.setName("jLabel5");
        jLabel6.setText(resourceMap.getString("jLabel6.text", new Object[0]));
        jLabel6.setName("jLabel6");
        jLabel7.setText(resourceMap.getString("jLabel7.text", new Object[0]));
        jLabel7.setName("jLabel7");
        jLabel8.setText(resourceMap.getString("jLabel8.text", new Object[0]));
        jLabel8.setName("jLabel8");
        jLabel9.setText(resourceMap.getString("jLabel9.text", new Object[0]));
        jLabel9.setName("jLabel9");
        jLabel10.setText(resourceMap.getString("jLabel10.text", new Object[0]));
        jLabel10.setName("jLabel10");
        jLabel11.setText(resourceMap.getString("jLabel11.text", new Object[0]));
        jLabel11.setName("jLabel11");
        jLabel12.setText(resourceMap.getString("jLabel12.text", new Object[0]));
        jLabel12.setName("jLabel12");
        jLabel13.setText(resourceMap.getString("jLabel13.text", new Object[0]));
        jLabel13.setName("jLabel13");
        jLabel14.setText(resourceMap.getString("jLabel14.text", new Object[0]));
        jLabel14.setName("jLabel14");
        jLabel15.setText(resourceMap.getString("jLabel15.text", new Object[0]));
        jLabel15.setName("jLabel15");
        jLabel16.setText(resourceMap.getString("jLabel16.text", new Object[0]));
        jLabel16.setName("jLabel16");
        jLabel17.setText(resourceMap.getString("jLabel17.text", new Object[0]));
        jLabel17.setName("jLabel17");
        jLabel18.setText(resourceMap.getString("jLabel18.text", new Object[0]));
        jLabel18.setName("jLabel18");
        jLabel19.setText(resourceMap.getString("jLabel19.text", new Object[0]));
        jLabel19.setName("jLabel19");
        jLabel20.setText(resourceMap.getString("jLabel20.text", new Object[0]));
        jLabel20.setName("jLabel20");
        jLabel21.setText(resourceMap.getString("jLabel21.text", new Object[0]));
        jLabel21.setName("jLabel21");
        jLabel22.setText(resourceMap.getString("jLabel22.text", new Object[0]));
        jLabel22.setName("jLabel22");
        jLabel23.setText(resourceMap.getString("jLabel23.text", new Object[0]));
        jLabel23.setName("jLabel23");
        jLabel24.setText(resourceMap.getString("jLabel24.text", new Object[0]));
        jLabel24.setName("jLabel24");
        jLabel25.setText(resourceMap.getString("jLabel25.text", new Object[0]));
        jLabel25.setName("jLabel25");
        jLabel26.setText(resourceMap.getString("jLabel26.text", new Object[0]));
        jLabel26.setName("jLabel26");
        jButton1.setText(resourceMap.getString("jButton1.text", new Object[0]));
        jButton1.setName("jButton1");
        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }

//            final user_statistics this$0;
//
//            
//            {
//                this$0 = user_statistics.this;
//                super();
//            }
        }
);
        jButton2.setText(resourceMap.getString("jButton2.text", new Object[0]));
        jButton2.setName("jButton2");
        jButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }

//            final user_statistics this$0;
//
//            
//            {
//                this$0 = user_statistics.this;
//                super();
//            }
        }
);
        jButton3.setText(resourceMap.getString("jButton3.text", new Object[0]));
        jButton3.setName("jButton3");
        jButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }

//            final user_statistics this$0;
//
//            
//            {
//                this$0 = user_statistics.this;
//                super();
//            }
        }
);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel4)).addGroup(layout.createSequentialGroup().addComponent(jLabel5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel6)).addGroup(layout.createSequentialGroup().addComponent(jLabel7).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel8)).addGroup(layout.createSequentialGroup().addComponent(jLabel9).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel10)).addGroup(layout.createSequentialGroup().addComponent(jLabel13).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel14)).addGroup(layout.createSequentialGroup().addComponent(jLabel15).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel16)).addGroup(layout.createSequentialGroup().addComponent(jLabel17).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel18)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jLabel19).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel22)).addComponent(jButton1)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(130, 130, 130).addComponent(jLabel1).addGap(6, 6, 6)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jLabel20).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel23).addGap(2, 2, 2))).addGroup(layout.createSequentialGroup().addGap(83, 83, 83).addComponent(jButton3, -2, 92, -2))).addGap(42, 42, 42).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(jLabel21).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel24)).addComponent(jButton2))).addGroup(layout.createSequentialGroup().addComponent(jLabel11).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel12)))).addGroup(layout.createSequentialGroup().addGap(148, 148, 148).addComponent(jLabel25).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel26))).addGap(69, 69, 69)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(jLabel4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(jLabel6)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(jLabel8)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(jLabel10)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(jLabel12)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(jLabel14)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel15).addComponent(jLabel16)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(jLabel18)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel19).addComponent(jLabel22).addComponent(jLabel20).addComponent(jLabel23).addComponent(jLabel21).addComponent(jLabel24)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel25).addComponent(jLabel26)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton3).addComponent(jButton1).addComponent(jButton2)).addContainerGap(-1, 32767)));
        pack();
    }

    private void jButton2ActionPerformed(ActionEvent evt)
    {
        dispose();
        try
        {
            con.close();
        }
        catch(Exception e) { }
    }

    private void jButton1ActionPerformed(ActionEvent evt)
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

    private void jButton3ActionPerformed(ActionEvent evt)
    {
        jLabel4.setText("0");
        jLabel6.setText("0");
        jLabel8.setText("0");
        jLabel10.setText("0");
        jLabel12.setText("0");
        jLabel14.setText("0");
        jLabel16.setText("0");
        jLabel18.setText("0");
        jLabel22.setText("0%");
        jLabel23.setText("0%");
        jLabel24.setText("0%");
        jLabel26.setText("0%");
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

    private void showContent()
    {
        try
        {
            ResultSet rs = sta.executeQuery("select * from grade where name='wan'");
            if(!rs.next())
                JOptionPane.showMessageDialog(new JFrame(), "Not find!", "Error", 1);
            jLabel1.setText("Jensen's Grade");
            jLabel4.setText(rs.getString("passage"));
            jLabel6.setText(rs.getString("passage_correct"));
            jLabel8.setText(rs.getString("filling_blank"));
            jLabel10.setText(rs.getString("filling_blank_correct"));
            jLabel12.setText(rs.getString("analogy_antonymy"));
            jLabel14.setText(rs.getString("analogy_antonymy_correct"));
            jLabel16.setText("3");
            jLabel18.setText("3");
            jLabel22.setText("100%");
            jLabel23.setText("100%");
            jLabel24.setText("100%");
            jLabel26.setText("100%");
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
                (new user_statistics()).setVisible(true);
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
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;



}