// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:41:16
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   PassageWindow.java

package desktopapplication1;

import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.sql.*;
import java.util.Random;
import javax.swing.*;

public class PassageWindow extends JFrame
{

    public PassageWindow()
    {
        connectToDatabase();
        initComponents();
        showContent("1");
    }

    private void initComponents()
    {
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();
        buttonGroup5 = new ButtonGroup();
        buttonGroup6 = new ButtonGroup();
        buttonGroup7 = new ButtonGroup();
        jButton1 = new JButton();
        jTabbedPane1 = new JTabbedPane();
        jPanel1 = new JPanel();
        jScrollPane2 = new JScrollPane();
        jPanel3 = new JPanel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jRadioButton6 = new JRadioButton();
        jRadioButton7 = new JRadioButton();
        jScrollPane3 = new JScrollPane();
        jTextArea2 = new JTextArea();
        jScrollPane4 = new JScrollPane();
        jTextArea3 = new JTextArea();
        jRadioButton8 = new JRadioButton();
        jRadioButton9 = new JRadioButton();
        jRadioButton10 = new JRadioButton();
        jScrollPane5 = new JScrollPane();
        jTextArea4 = new JTextArea();
        jRadioButton11 = new JRadioButton();
        jRadioButton12 = new JRadioButton();
        jRadioButton13 = new JRadioButton();
        jRadioButton27 = new JRadioButton();
        jRadioButton28 = new JRadioButton();
        jScrollPane11 = new JScrollPane();
        jTextArea9 = new JTextArea();
        jRadioButton29 = new JRadioButton();
        jRadioButton30 = new JRadioButton();
        jRadioButton31 = new JRadioButton();
        jRadioButton32 = new JRadioButton();
        jRadioButton33 = new JRadioButton();
        jScrollPane12 = new JScrollPane();
        jTextArea10 = new JTextArea();
        jRadioButton34 = new JRadioButton();
        jRadioButton35 = new JRadioButton();
        jRadioButton36 = new JRadioButton();
        jRadioButton37 = new JRadioButton();
        jRadioButton38 = new JRadioButton();
        jScrollPane13 = new JScrollPane();
        jTextArea11 = new JTextArea();
        jRadioButton39 = new JRadioButton();
        jRadioButton40 = new JRadioButton();
        jRadioButton41 = new JRadioButton();
        jRadioButton42 = new JRadioButton();
        jRadioButton43 = new JRadioButton();
        jScrollPane14 = new JScrollPane();
        jTextArea12 = new JTextArea();
        jRadioButton44 = new JRadioButton();
        jRadioButton45 = new JRadioButton();
        jRadioButton46 = new JRadioButton();
        jRadioButton47 = new JRadioButton();
        jRadioButton48 = new JRadioButton();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jPanel2 = new JPanel();
        jScrollPane6 = new JScrollPane();
        jTextArea5 = new JTextArea();
        jScrollPane10 = new JScrollPane();
        jPanel4 = new JPanel();
        jRadioButton14 = new JRadioButton();
        jRadioButton15 = new JRadioButton();
        jRadioButton16 = new JRadioButton();
        jRadioButton17 = new JRadioButton();
        jRadioButton18 = new JRadioButton();
        jRadioButton19 = new JRadioButton();
        jRadioButton20 = new JRadioButton();
        jScrollPane7 = new JScrollPane();
        jTextArea6 = new JTextArea();
        jScrollPane8 = new JScrollPane();
        jTextArea7 = new JTextArea();
        jRadioButton21 = new JRadioButton();
        jRadioButton22 = new JRadioButton();
        jRadioButton23 = new JRadioButton();
        jScrollPane9 = new JScrollPane();
        jTextArea8 = new JTextArea();
        jRadioButton24 = new JRadioButton();
        jRadioButton25 = new JRadioButton();
        jRadioButton26 = new JRadioButton();
        jRadioButton49 = new JRadioButton();
        jRadioButton50 = new JRadioButton();
        jScrollPane15 = new JScrollPane();
        jTextArea13 = new JTextArea();
        jRadioButton51 = new JRadioButton();
        jRadioButton52 = new JRadioButton();
        jRadioButton53 = new JRadioButton();
        jRadioButton54 = new JRadioButton();
        jRadioButton55 = new JRadioButton();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        setDefaultCloseOperation(2);
        setAlwaysOnTop(true);
        addWindowListener(new WindowAdapter() {

            public void windowOpened(WindowEvent evt)
            {
                formWindowOpened(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
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

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jTabbedPane1.setTabPlacement(3);
        jTabbedPane1.setName("jTabbedPane1");
        jPanel1.setName("jPanel1");
        jScrollPane2.setName("jScrollPane2");
        jScrollPane2.setPreferredSize(new Dimension(308, 670));
        jPanel3.setName("jPanel3");
        jPanel3.setPreferredSize(new Dimension(306, 3200));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setName("jRadioButton1");
        jRadioButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton1ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("document the challengers that have been surmounted in the effort to recover energy from HDR\u2019s");
        jRadioButton2.setName("jRadioButton2");
        jRadioButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton2ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("warn the users of coal and oil that HDR\u2019s are not an economically feasible alternative");
        jRadioButton3.setName("jRadioButton3");
        jRadioButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton3ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("encourage the use of new techniques for the recovery of energy from underground hot water and steam");
        jRadioButton4.setName("jRadioButton4");
        jRadioButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton4ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("urge consumers to demand quicker development of HDR resources for the production of energy");
        jRadioButton5.setName("jRadioButton5");
        jRadioButton5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton5ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("petrological research report focused on the history of temperature-depth records in the United States");
        jRadioButton6.setName("jRadioButton6");
        jRadioButton6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton6ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("congressional report urging the conservation of oil and natural gas reserves in the United States");
        jRadioButton7.setName("jRadioButton7");
        jRadioButton7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton7ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jScrollPane3.setName("jScrollPane3");
        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setName("jTextArea2");
        jScrollPane3.setViewportView(jTextArea2);
        jScrollPane4.setName("jScrollPane4");
        jTextArea3.setColumns(20);
        jTextArea3.setEditable(false);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setName("jTextArea3");
        jScrollPane4.setViewportView(jTextArea3);
        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setText("technical journal article concerned with the recoverability of newly identified energy sources");
        jRadioButton8.setName("jRadioButton8");
        jRadioButton8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton8ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup2.add(jRadioButton9);
        jRadioButton9.setText("consumer report describing the extent and accessibility of remaining coal resources");
        jRadioButton9.setName("jRadioButton9");
        jRadioButton9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton9ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setText("pamphlet designed to introduce homeowners to the advantages of HDR space-heating systems");
        jRadioButton10.setName("jRadioButton10");
        jRadioButton10.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton10ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jScrollPane5.setName("jScrollPane5");
        jTextArea4.setColumns(20);
        jTextArea4.setEditable(false);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("3. According the passage, an average geothermal gradient of 22\u2103 per kilometer of depth can be used to");
        jTextArea4.setName("jTextArea4");
        jScrollPane5.setViewportView(jTextArea4);
        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setText("balance the economics of HDR energy retrieval against that of underground hot water or steam recovery systems");
        jRadioButton11.setName("jRadioButton11");
        jRadioButton11.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton11ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setText("determine the amount of energy that will used for space heating in the United States");
        jRadioButton12.setName("jRadioButton12");
        jRadioButton12.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton12ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup3.add(jRadioButton13);
        jRadioButton13.setText("provide comparisons between hot water and HDR energy sources in United States");
        jRadioButton13.setName("jRadioButton13");
        jRadioButton13.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton13ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup3.add(jRadioButton27);
        jRadioButton27.setText("revise the estimates on the extent of remaining coal resources in the United States");
        jRadioButton27.setName("jRadioButton27");
        jRadioButton27.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton27ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup3.add(jRadioButton28);
        jRadioButton28.setText("estimate the total HDR resource base in the United States");
        jRadioButton28.setName("jRadioButton28");
        jRadioButton28.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton28ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jScrollPane11.setName("jScrollPane11");
        jTextArea9.setColumns(20);
        jTextArea9.setEditable(false);
        jTextArea9.setLineWrap(true);
        jTextArea9.setRows(5);
        jTextArea9.setText("4. It can be inferred from the passage that the availability of temperature-depth records for any specific area in the United States depends primarily on the");
        jTextArea9.setName("jTextArea9");
        jScrollPane11.setViewportView(jTextArea9);
        buttonGroup4.add(jRadioButton29);
        jRadioButton29.setText("possibility that HDR\u2019s may be found in that area");
        jRadioButton29.setName("jRadioButton29");
        jRadioButton29.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton29ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup4.add(jRadioButton30);
        jRadioButton30.setText("existence of previous attempts to obtain oil or gas in that area");
        jRadioButton30.setName("jRadioButton30");
        jRadioButton30.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton30ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup4.add(jRadioButton31);
        jRadioButton31.setText("history of successful hot water or steam recovery efforts in that area");
        jRadioButton31.setName("jRadioButton31");
        jRadioButton31.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton31ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup4.add(jRadioButton32);
        jRadioButton32.setText("failure of inhabitants to conserve oil gas reserves in that area");
        jRadioButton32.setName("jRadioButton32");
        jRadioButton32.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton32ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup4.add(jRadioButton33);
        jRadioButton33.setText("use of coal as a substitute for oil or gas in that area");
        jRadioButton33.setName("jRadioButton33");
        jRadioButton33.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton33ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jScrollPane12.setName("jScrollPane12");
        jTextArea10.setColumns(20);
        jTextArea10.setEditable(false);
        jTextArea10.setLineWrap(true);
        jTextArea10.setRows(5);
        jTextArea10.setText("5.According to the passage, in all HDR recovery systems fluid will be necessary in order to allow");
        jTextArea10.setName("jTextArea10");
        jScrollPane12.setViewportView(jTextArea10);
        buttonGroup5.add(jRadioButton34);
        jRadioButton34.setText("sufficient permeability");
        jRadioButton34.setName("jRadioButton34");
        jRadioButton34.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton34ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup5.add(jRadioButton35);
        jRadioButton35.setText("artificial stimulation");
        jRadioButton35.setName("jRadioButton35");
        jRadioButton35.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton35ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup5.add(jRadioButton36);
        jRadioButton36.setText("drilling of holes ");
        jRadioButton36.setName("jRadioButton36");
        jRadioButton36.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton36ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup5.add(jRadioButton37);
        jRadioButton37.setText("construction of reservoirs");
        jRadioButton37.setName("jRadioButton37");
        jRadioButton37.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton37ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup5.add(jRadioButton38);
        jRadioButton38.setText("transfer of heat");
        jRadioButton38.setName("jRadioButton38");
        jRadioButton38.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton38ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jScrollPane13.setName("jScrollPane13");
        jTextArea11.setColumns(20);
        jTextArea11.setEditable(false);
        jTextArea11.setLineWrap(true);
        jTextArea11.setRows(5);
        jTextArea11.setText("6. According to the passage, if the average geothermal gradient in an area is 22\u2103 per kilometer of depth, which of the following can be reliably predicted?\nI. The temperature at the base of a 10-kilometer well will be sufficient for the production of electricity.\nII. Drilling of wells deeper than 10 kilometers will be economically feasible.\nIII. Insufficient water is present to produce eruptive phenomena.");
        jTextArea11.setName("jTextArea11");
        jScrollPane13.setViewportView(jTextArea11);
        buttonGroup6.add(jRadioButton39);
        jRadioButton39.setText("I only");
        jRadioButton39.setName("jRadioButton39");
        jRadioButton39.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton39ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup6.add(jRadioButton40);
        jRadioButton40.setText("II only ");
        jRadioButton40.setName("jRadioButton40");
        jRadioButton40.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton40ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup6.add(jRadioButton41);
        jRadioButton41.setText("I and II only");
        jRadioButton41.setName("jRadioButton41");
        jRadioButton41.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton41ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup6.add(jRadioButton42);
        jRadioButton42.setText("II and III only");
        jRadioButton42.setName("jRadioButton42");
        jRadioButton42.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton42ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup6.add(jRadioButton43);
        jRadioButton43.setText("I, II, and III");
        jRadioButton43.setName("jRadioButton43");
        jRadioButton43.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton43ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jScrollPane14.setName("jScrollPane14");
        jTextArea12.setColumns(20);
        jTextArea12.setEditable(false);
        jTextArea12.setLineWrap(true);
        jTextArea12.setRows(5);
        jTextArea12.setText("7. Which of the following would be the most appropriate title for the passage?");
        jTextArea12.setName("jTextArea12");
        jScrollPane14.setViewportView(jTextArea12);
        buttonGroup7.add(jRadioButton44);
        jRadioButton44.setText("Energy from Water Sources: The Feasibility of Commercial Systems");
        jRadioButton44.setName("jRadioButton44");
        jRadioButton44.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton44ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup7.add(jRadioButton45);
        jRadioButton45.setText("Geothermal Energy Retrieval: Volcanic Activity and Hot Dry Rocks");
        jRadioButton45.setName("jRadioButton45");
        jRadioButton45.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton45ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup7.add(jRadioButton46);
        jRadioButton46.setText("Energy Underground: Geothermal Sources Give Way to Fossil Fuels");
        jRadioButton46.setName("jRadioButton46");
        jRadioButton46.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton46ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup7.add(jRadioButton47);
        jRadioButton47.setText("Tappable Energy for America\u2019s Future: Hot Dry Rocks");
        jRadioButton47.setName("jRadioButton47");
        jRadioButton47.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton47ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup7.add(jRadioButton48);
        jRadioButton48.setText("High Geothermal Gradients in the United States: Myth or Reality?");
        jRadioButton48.setName("jRadioButton48");
        jRadioButton48.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton48ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton48).addContainerGap()).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton47).addContainerGap()).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton46).addContainerGap()).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton45).addContainerGap()).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton44).addContainerGap()).addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jRadioButton1).addComponent(jScrollPane3, -1, 613, 32767).addComponent(jRadioButton2).addComponent(jRadioButton3).addComponent(jRadioButton4).addComponent(jRadioButton5)).addGap(44, 44, 44)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton10).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton9).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton8).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton7).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton6).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jScrollPane4, -1, 613, 32767).addGap(44, 44, 44)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton28).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton27).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton13).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton12).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton11).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jScrollPane5, -1, 613, 32767).addGap(44, 44, 44)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton33).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton32).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton31).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton30).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton29).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jScrollPane11, -1, 613, 32767).addGap(44, 44, 44)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton38).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton37).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton36).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton35).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton34).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jScrollPane12, -1, 613, 32767).addGap(44, 44, 44)).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton43).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton42).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton41).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton40).addContainerGap()).addGroup(jPanel3Layout.createSequentialGroup().addComponent(jRadioButton39).addContainerGap()).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING, -1, 613, 32767).addComponent(jScrollPane13, -1, 613, 32767)).addGap(44, 44, 44))))))))));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane3, -2, 86, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane4, -2, 80, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton6).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton7).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton8).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton9).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane5, -2, 92, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton11).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton12).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton13).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton27).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton28).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane11, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton29).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton30).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton31).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton32).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton33).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane12, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton34).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton35).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton36).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton37).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton38).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane13, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton39).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton40).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton41).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton42).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton43).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane14, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton44).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton45).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton46).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton47).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton48).addContainerGap(1628, 32767)));
        jScrollPane2.setViewportView(jPanel3);
        jScrollPane1.setName("jScrollPane1");
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1");
        jScrollPane1.setViewportView(jTextArea1);
        jLabel1.setText("Passage:");
        jLabel1.setName("jLabel1");
        jLabel2.setText("Questions:");
        jLabel2.setName("jLabel2");
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, -2, 108, -2).addComponent(jScrollPane1, -2, 330, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane2, -1, 686, 32767).addComponent(jLabel2, -2, 105, -2)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1, -2, 24, -2).addComponent(jLabel2, -2, 19, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane2, -2, 1572, -2).addComponent(jScrollPane1, -2, 496, -2)).addContainerGap()));
        jTabbedPane1.addTab("Long Passage", jPanel1);
        jPanel2.setName("jPanel2");
        jScrollPane6.setName("jScrollPane6");
        jTextArea5.setColumns(20);
        jTextArea5.setEditable(false);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setName("jTextArea5");
        jScrollPane6.setViewportView(jTextArea5);
        jScrollPane10.setName("jScrollPane10");
        jPanel4.setEnabled(false);
        jPanel4.setName("jPanel4");
        jPanel4.setPreferredSize(new Dimension(306, 1400));
        buttonGroup1.add(jRadioButton14);
        jRadioButton14.setText("The author claims that most studies of folktales told by Afro-American slaves are inadequate because the studies");
        jRadioButton14.setName("jRadioButton14");
        jRadioButton14.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton14ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton15);
        jRadioButton15.setText("do not pay enough attention to the features of a folktale that best reveal an African influence");
        jRadioButton15.setName("jRadioButton15");
        jRadioButton15.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton15ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton16);
        jRadioButton16.setText("overestimate the number of folktales brought from Africa by the slaves");
        jRadioButton16.setName("jRadioButton16");
        jRadioButton16.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton16ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton17);
        jRadioButton17.setText("do not consider the fact that a folktale can be changed as it is retold many times");
        jRadioButton17.setName("jRadioButton17");
        jRadioButton17.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton17ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup1.add(jRadioButton18);
        jRadioButton18.setText("oversimplify the diverse and complex traditions of the slaves ancestral homeland");
        jRadioButton18.setName("jRadioButton18");
        jRadioButton18.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton18ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup2.add(jRadioButton19);
        jRadioButton19.setText("create a new field of study");
        jRadioButton19.setName("jRadioButton19");
        jRadioButton19.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton19ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup2.add(jRadioButton20);
        jRadioButton20.setText("discredit an existing field of study");
        jRadioButton20.setName("jRadioButton20");
        jRadioButton20.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton20ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jScrollPane7.setName("jScrollPane7");
        jTextArea6.setColumns(20);
        jTextArea6.setEditable(false);
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jTextArea6.setName("jTextArea6");
        jScrollPane7.setViewportView(jTextArea6);
        jScrollPane8.setName("jScrollPane8");
        jTextArea7.setColumns(20);
        jTextArea7.setEditable(false);
        jTextArea7.setLineWrap(true);
        jTextArea7.setRows(5);
        jTextArea7.setName("jTextArea7");
        jScrollPane8.setViewportView(jTextArea7);
        buttonGroup2.add(jRadioButton21);
        jRadioButton21.setText("change the focus of a field of study");
        jRadioButton21.setName("jRadioButton21");
        jRadioButton21.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton21ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup2.add(jRadioButton22);
        jRadioButton22.setText("transplant scholarly techniques from one field of study to another");
        jRadioButton22.setName("jRadioButton22");
        jRadioButton22.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton22ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup2.add(jRadioButton23);
        jRadioButton23.setText("restrict the scope of a burgeoning new field of study");
        jRadioButton23.setName("jRadioButton23");
        jRadioButton23.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton23ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jScrollPane9.setName("jScrollPane9");
        jTextArea8.setColumns(20);
        jTextArea8.setEditable(false);
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(5);
        jTextArea8.setName("jTextArea8");
        jScrollPane9.setViewportView(jTextArea8);
        buttonGroup3.add(jRadioButton24);
        jRadioButton24.setText("The means by which Blacks disseminated their folktales in nineteenth-century America");
        jRadioButton24.setName("jRadioButton24");
        jRadioButton24.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton24ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup3.add(jRadioButton25);
        jRadioButton25.setText("Specific regional differences in the styles of delivery used by the slaves in telling folktales");
        jRadioButton25.setName("jRadioButton25");
        jRadioButton25.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton25ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup3.add(jRadioButton26);
        jRadioButton26.setText("The functional meaning of Black folktales in the lives of White children raised by slave");
        jRadioButton26.setName("jRadioButton26");
        jRadioButton26.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton26ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup3.add(jRadioButton49);
        jRadioButton49.setText("The specific way the slaves used folktales to impart moral teaching to their children");
        jRadioButton49.setName("jRadioButton49");
        jRadioButton49.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton49ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup3.add(jRadioButton50);
        jRadioButton50.setText("The complexities of plot that appear most frequently in the slaves\u2019 tales");
        jRadioButton50.setName("jRadioButton50");
        jRadioButton50.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton50ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jScrollPane15.setName("jScrollPane15");
        jTextArea13.setColumns(20);
        jTextArea13.setEditable(false);
        jTextArea13.setLineWrap(true);
        jTextArea13.setRows(5);
        jTextArea13.setText("4. It can be inferred from the passage that the availability of temperature-depth records for any specific area in the United States depends primarily on the");
        jTextArea13.setName("jTextArea13");
        jScrollPane15.setViewportView(jTextArea13);
        buttonGroup4.add(jRadioButton51);
        jRadioButton51.setText("Giving a clich\351 a new meaning");
        jRadioButton51.setName("jRadioButton51");
        jRadioButton51.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton51ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup4.add(jRadioButton52);
        jRadioButton52.setText("Pointedly refusing to define key terms");
        jRadioButton52.setName("jRadioButton52");
        jRadioButton52.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton52ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup4.add(jRadioButton53);
        jRadioButton53.setText("Alternately presenting generalities and concrete details");
        jRadioButton53.setName("jRadioButton53");
        jRadioButton53.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton53ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup4.add(jRadioButton54);
        jRadioButton54.setText("Concluding the passage with a restatement of the first point made in the passage");
        jRadioButton54.setName("jRadioButton54");
        jRadioButton54.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton54ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        buttonGroup4.add(jRadioButton55);
        jRadioButton55.setText("Juxtaposing statements of what is not the case and statements of what is the case");
        jRadioButton55.setName("jRadioButton55");
        jRadioButton55.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jRadioButton55ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jRadioButton14).addComponent(jScrollPane7, -1, 627, 32767).addComponent(jRadioButton15).addComponent(jRadioButton16).addComponent(jRadioButton17).addComponent(jRadioButton18)).addGap(44, 44, 44)).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton23).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton22).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton21).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton20).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton19).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jScrollPane8, -1, 627, 32767).addGap(44, 44, 44)).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton50).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton49).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton26).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton25).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton24).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jScrollPane9, -1, 627, 32767).addGap(44, 44, 44)).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton55).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton54).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton53).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton52).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jRadioButton51).addContainerGap()).addGroup(jPanel4Layout.createSequentialGroup().addComponent(jScrollPane15, -1, 627, 32767).addGap(44, 44, 44)))));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane7, -2, 86, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton14).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton15).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton16).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton17).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton18).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane8, -2, 80, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton19).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton20).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton21).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton22).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton23).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane9, -2, 92, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton24).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton25).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton26).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton49).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton50).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane15, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jRadioButton51).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton52).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton53).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton54).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton55).addContainerGap(516, 32767)));
        jScrollPane10.setViewportView(jPanel4);
        jLabel3.setText("Passage:");
        jLabel3.setName("jLabel3");
        jLabel4.setText("Questions:");
        jLabel4.setName("jLabel4");
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3, -2, 108, -2).addComponent(jScrollPane6, -2, 308, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4, -2, 105, -2).addComponent(jScrollPane10, -1, 700, 32767)).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3, -2, 24, -2).addComponent(jLabel4, -2, 19, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane10, -2, 902, -2).addComponent(jScrollPane6, -2, 501, -2)).addContainerGap()));
        jTabbedPane1.addTab("Short Passage", jPanel2);
        jButton2.setText("Submit");
        jButton2.setName("jButton2");
        jButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jButton3.setText("Next");
        jButton3.setName("jButton3");
        jButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jButton4.setText("Last");
        jButton4.setName("jButton4");
        jButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jButton5.setText("Random");
        jButton5.setName("jButton5");
        jButton5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        jButton6.setText("Correct Answer");
        jButton6.setName("jButton6");
        jButton6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt)
            {
                jButton6ActionPerformed(evt);
            }

//            final PassageWindow this$0;
//
//            
//            {
//                this$0 = PassageWindow.this;
//                super();
//            }
        }
);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1, -1, 1051, 32767).addGroup(layout.createSequentialGroup().addComponent(jButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 785, 32767).addComponent(jButton5).addGap(18, 18, 18).addComponent(jButton4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton3)))).addGroup(layout.createSequentialGroup().addGap(452, 452, 452).addComponent(jButton2, -2, 119, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, 32767).addComponent(jButton6, -2, 142, -2))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1).addComponent(jButton3).addComponent(jButton4).addComponent(jButton5)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jTabbedPane1, -2, 586, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton2, -2, 27, -2).addComponent(jButton6)).addContainerGap(-1, 32767)));
        pack();
    }

    private void formWindowOpened(WindowEvent evt)
    {
        setLocationRelativeTo(getOwner());
    }

    private void jButton1ActionPerformed(ActionEvent evt)
    {
        dispose();
    }

    private void jRadioButton1ActionPerformed(ActionEvent evt)
    {
        user_answer[0] = 'A';
    }

    private void jRadioButton2ActionPerformed(ActionEvent evt)
    {
        user_answer[0] = 'B';
    }

    private void jRadioButton3ActionPerformed(ActionEvent evt)
    {
        user_answer[0] = 'C';
    }

    private void jRadioButton4ActionPerformed(ActionEvent evt)
    {
        user_answer[0] = 'D';
    }

    private void jRadioButton5ActionPerformed(ActionEvent evt)
    {
        user_answer[0] = 'E';
    }

    private void jRadioButton6ActionPerformed(ActionEvent evt)
    {
        user_answer[1] = 'A';
    }

    private void jRadioButton7ActionPerformed(ActionEvent evt)
    {
        user_answer[1] = 'B';
    }

    private void jRadioButton8ActionPerformed(ActionEvent evt)
    {
        user_answer[1] = 'C';
    }

    private void jRadioButton9ActionPerformed(ActionEvent evt)
    {
        user_answer[1] = 'D';
    }

    private void jRadioButton10ActionPerformed(ActionEvent evt)
    {
        user_answer[1] = 'E';
    }

    private void jRadioButton11ActionPerformed(ActionEvent evt)
    {
        user_answer[2] = 'A';
    }

    private void jRadioButton12ActionPerformed(ActionEvent evt)
    {
        user_answer[2] = 'B';
    }

    private void jRadioButton13ActionPerformed(ActionEvent evt)
    {
        user_answer[2] = 'C';
    }

    private void jRadioButton27ActionPerformed(ActionEvent evt)
    {
        user_answer[2] = 'D';
    }

    private void jRadioButton28ActionPerformed(ActionEvent evt)
    {
        user_answer[2] = 'E';
    }

    private void jRadioButton29ActionPerformed(ActionEvent evt)
    {
        user_answer[3] = 'A';
    }

    private void jRadioButton30ActionPerformed(ActionEvent evt)
    {
        user_answer[3] = 'B';
    }

    private void jRadioButton31ActionPerformed(ActionEvent evt)
    {
        user_answer[3] = 'C';
    }

    private void jRadioButton32ActionPerformed(ActionEvent evt)
    {
        user_answer[3] = 'D';
    }

    private void jRadioButton33ActionPerformed(ActionEvent evt)
    {
        user_answer[3] = 'E';
    }

    private void jRadioButton34ActionPerformed(ActionEvent evt)
    {
        user_answer[4] = 'A';
    }

    private void jRadioButton35ActionPerformed(ActionEvent evt)
    {
        user_answer[4] = 'B';
    }

    private void jRadioButton36ActionPerformed(ActionEvent evt)
    {
        user_answer[4] = 'C';
    }

    private void jRadioButton37ActionPerformed(ActionEvent evt)
    {
        user_answer[4] = 'D';
    }

    private void jRadioButton38ActionPerformed(ActionEvent evt)
    {
        user_answer[4] = 'E';
    }

    private void jRadioButton39ActionPerformed(ActionEvent evt)
    {
        user_answer[5] = 'A';
    }

    private void jRadioButton40ActionPerformed(ActionEvent evt)
    {
        user_answer[5] = 'B';
    }

    private void jRadioButton41ActionPerformed(ActionEvent evt)
    {
        user_answer[5] = 'C';
    }

    private void jRadioButton42ActionPerformed(ActionEvent evt)
    {
        user_answer[5] = 'D';
    }

    private void jRadioButton43ActionPerformed(ActionEvent evt)
    {
        user_answer[5] = 'E';
    }

    private void jRadioButton44ActionPerformed(ActionEvent evt)
    {
        user_answer[6] = 'A';
    }

    private void jRadioButton45ActionPerformed(ActionEvent evt)
    {
        user_answer[6] = 'B';
    }

    private void jRadioButton46ActionPerformed(ActionEvent evt)
    {
        user_answer[6] = 'C';
    }

    private void jRadioButton47ActionPerformed(ActionEvent evt)
    {
        user_answer[6] = 'D';
    }

    private void jRadioButton48ActionPerformed(ActionEvent evt)
    {
        user_answer[6] = 'E';
    }

    private void jButton2ActionPerformed(ActionEvent evt)
    {
        int long_correct = 0;
        for(int i = 0; i < long_answer.length(); i++)
            if(long_answer.charAt(i) == user_answer[i])
                long_correct++;

        for(int i = 0; i < short_answer.length(); i++)
            if(short_answer.charAt(i) == user_answer[i + 7])
                long_correct++;

        JOptionPane.showMessageDialog(this, (new StringBuilder()).append("Your score is ").append(String.valueOf((100 * long_correct) / 11)).append(" !").toString(), "Result", 1);
    }

    private void jButton6ActionPerformed(ActionEvent evt)
    {
        JOptionPane.showMessageDialog(this, (new StringBuilder()).append("Long passage: ").append(long_answer).append("\n").append("Short passage: ").append(short_answer).toString(), "Answer", 1);
    }

    private void jRadioButton14ActionPerformed(ActionEvent evt)
    {
        user_answer[7] = 'A';
    }

    private void jRadioButton15ActionPerformed(ActionEvent evt)
    {
        user_answer[7] = 'B';
    }

    private void jRadioButton16ActionPerformed(ActionEvent evt)
    {
        user_answer[7] = 'C';
    }

    private void jRadioButton17ActionPerformed(ActionEvent evt)
    {
        user_answer[7] = 'D';
    }

    private void jRadioButton18ActionPerformed(ActionEvent evt)
    {
        user_answer[7] = 'E';
    }

    private void jRadioButton19ActionPerformed(ActionEvent evt)
    {
        user_answer[8] = 'A';
    }

    private void jRadioButton20ActionPerformed(ActionEvent evt)
    {
        user_answer[8] = 'B';
    }

    private void jRadioButton21ActionPerformed(ActionEvent evt)
    {
        user_answer[8] = 'C';
    }

    private void jRadioButton22ActionPerformed(ActionEvent evt)
    {
        user_answer[8] = 'D';
    }

    private void jRadioButton23ActionPerformed(ActionEvent evt)
    {
        user_answer[8] = 'E';
    }

    private void jRadioButton24ActionPerformed(ActionEvent evt)
    {
        user_answer[9] = 'A';
    }

    private void jRadioButton25ActionPerformed(ActionEvent evt)
    {
        user_answer[9] = 'B';
    }

    private void jRadioButton26ActionPerformed(ActionEvent evt)
    {
        user_answer[9] = 'C';
    }

    private void jRadioButton49ActionPerformed(ActionEvent evt)
    {
        user_answer[9] = 'D';
    }

    private void jRadioButton50ActionPerformed(ActionEvent evt)
    {
        user_answer[9] = 'E';
    }

    private void jRadioButton51ActionPerformed(ActionEvent evt)
    {
        user_answer[10] = 'A';
    }

    private void jRadioButton52ActionPerformed(ActionEvent evt)
    {
        user_answer[10] = 'B';
    }

    private void jRadioButton53ActionPerformed(ActionEvent evt)
    {
        user_answer[10] = 'C';
    }

    private void jRadioButton54ActionPerformed(ActionEvent evt)
    {
        user_answer[10] = 'D';
    }

    private void jRadioButton55ActionPerformed(ActionEvent evt)
    {
        user_answer[10] = 'E';
    }

    private void jButton3ActionPerformed(ActionEvent evt)
    {
        int id = Integer.parseInt(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf(".")).trim());
        id++;
        showContent(String.valueOf(id));
    }

    private void jButton4ActionPerformed(ActionEvent evt)
    {
        int id = Integer.parseInt(jTextArea1.getText().substring(0, jTextArea1.getText().indexOf(".")).trim());
        id--;
        showContent(String.valueOf(id));
    }

    private void jButton5ActionPerformed(ActionEvent evt)
    {
        Random rand = new Random(System.currentTimeMillis());
        int count = 0;
        try
        {
            for(ResultSet rs = sta.executeQuery("select * from passage"); rs.next();)
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
            ResultSet rs = sta.executeQuery((new StringBuilder()).append("select * from passage where id=").append(id).toString());
            if(!rs.next())
                JOptionPane.showMessageDialog(this, "It's the last one!", "Error", 1);
            jTextArea1.setText((new StringBuilder()).append(id).append(".").append("(").append(rs.getString("year_month")).append(")").append(rs.getString("long_passage")).toString());
            jTextArea5.setText((new StringBuilder()).append(id).append(".").append("(").append(rs.getString("year_month")).append(")").append(rs.getString("short_passage")).toString());
            String question = rs.getString("long_questions");
            jTextArea2.setText((new StringBuilder()).append("1.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jTextArea3.setText((new StringBuilder()).append("2.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jTextArea4.setText((new StringBuilder()).append("3.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jTextArea9.setText((new StringBuilder()).append("4.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jTextArea10.setText((new StringBuilder()).append("5.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jTextArea11.setText((new StringBuilder()).append("6.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jTextArea12.setText((new StringBuilder()).append("7.").append(question).toString());
            question = rs.getString("long_options");
            jRadioButton1.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton2.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton3.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton4.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton5.setText((new StringBuilder()).append("E.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton6.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton7.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton8.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton9.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton10.setText((new StringBuilder()).append("E.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton11.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton12.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton13.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton27.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton28.setText((new StringBuilder()).append("E.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton29.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton30.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton31.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton32.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton33.setText((new StringBuilder()).append("E.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton34.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton35.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton36.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton37.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton38.setText((new StringBuilder()).append("E.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton39.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton40.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton41.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton42.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton43.setText((new StringBuilder()).append("E.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton44.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton45.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton46.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton47.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton48.setText((new StringBuilder()).append("E.").append(question).toString());
            question = rs.getString("short_questions");
            jTextArea6.setText((new StringBuilder()).append("1.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jTextArea7.setText((new StringBuilder()).append("2.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jTextArea8.setText((new StringBuilder()).append("3.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jTextArea13.setText((new StringBuilder()).append("4.").append(question).toString());
            question = rs.getString("short_options");
            jRadioButton14.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton15.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton16.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton17.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton18.setText((new StringBuilder()).append("E.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton19.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton20.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton21.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton22.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton23.setText((new StringBuilder()).append("E.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton24.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton25.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton26.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton49.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton50.setText((new StringBuilder()).append("E.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton51.setText((new StringBuilder()).append("A.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton52.setText((new StringBuilder()).append("B.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton53.setText((new StringBuilder()).append("C.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton54.setText((new StringBuilder()).append("D.").append(question.substring(0, question.indexOf(";"))).toString());
            question = question.substring(question.indexOf(";") + 1);
            jRadioButton55.setText((new StringBuilder()).append("E.").append(question).toString());
            long_answer = rs.getString("long_answer");
            short_answer = rs.getString("short_answer");
            user_answer = "00000000000".toCharArray();
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
                (new PassageWindow()).setVisible(true);
            }

        }
);
    }

    private String long_answer;
    private String short_answer;
    private char user_answer[];
    private String url;
    private Connection con;
    private Statement sta;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private ButtonGroup buttonGroup3;
    private ButtonGroup buttonGroup4;
    private ButtonGroup buttonGroup5;
    private ButtonGroup buttonGroup6;
    private ButtonGroup buttonGroup7;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton10;
    private JRadioButton jRadioButton11;
    private JRadioButton jRadioButton12;
    private JRadioButton jRadioButton13;
    private JRadioButton jRadioButton14;
    private JRadioButton jRadioButton15;
    private JRadioButton jRadioButton16;
    private JRadioButton jRadioButton17;
    private JRadioButton jRadioButton18;
    private JRadioButton jRadioButton19;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton20;
    private JRadioButton jRadioButton21;
    private JRadioButton jRadioButton22;
    private JRadioButton jRadioButton23;
    private JRadioButton jRadioButton24;
    private JRadioButton jRadioButton25;
    private JRadioButton jRadioButton26;
    private JRadioButton jRadioButton27;
    private JRadioButton jRadioButton28;
    private JRadioButton jRadioButton29;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton30;
    private JRadioButton jRadioButton31;
    private JRadioButton jRadioButton32;
    private JRadioButton jRadioButton33;
    private JRadioButton jRadioButton34;
    private JRadioButton jRadioButton35;
    private JRadioButton jRadioButton36;
    private JRadioButton jRadioButton37;
    private JRadioButton jRadioButton38;
    private JRadioButton jRadioButton39;
    private JRadioButton jRadioButton4;
    private JRadioButton jRadioButton40;
    private JRadioButton jRadioButton41;
    private JRadioButton jRadioButton42;
    private JRadioButton jRadioButton43;
    private JRadioButton jRadioButton44;
    private JRadioButton jRadioButton45;
    private JRadioButton jRadioButton46;
    private JRadioButton jRadioButton47;
    private JRadioButton jRadioButton48;
    private JRadioButton jRadioButton49;
    private JRadioButton jRadioButton5;
    private JRadioButton jRadioButton50;
    private JRadioButton jRadioButton51;
    private JRadioButton jRadioButton52;
    private JRadioButton jRadioButton53;
    private JRadioButton jRadioButton54;
    private JRadioButton jRadioButton55;
    private JRadioButton jRadioButton6;
    private JRadioButton jRadioButton7;
    private JRadioButton jRadioButton8;
    private JRadioButton jRadioButton9;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane10;
    private JScrollPane jScrollPane11;
    private JScrollPane jScrollPane12;
    private JScrollPane jScrollPane13;
    private JScrollPane jScrollPane14;
    private JScrollPane jScrollPane15;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JScrollPane jScrollPane7;
    private JScrollPane jScrollPane8;
    private JScrollPane jScrollPane9;
    private JTabbedPane jTabbedPane1;
    private JTextArea jTextArea1;
    private JTextArea jTextArea10;
    private JTextArea jTextArea11;
    private JTextArea jTextArea12;
    private JTextArea jTextArea13;
    private JTextArea jTextArea2;
    private JTextArea jTextArea3;
    private JTextArea jTextArea4;
    private JTextArea jTextArea5;
    private JTextArea jTextArea6;
    private JTextArea jTextArea7;
    private JTextArea jTextArea8;
    private JTextArea jTextArea9;


}