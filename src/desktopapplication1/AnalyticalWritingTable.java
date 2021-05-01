// Decompiled by DJ v3.12.12.96 Copyright 2011 Atanas Neshkov  Date: 2012/4/14 21:40:59
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   AnalyticalWritingTable.java

package desktopapplication1;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import org.jdesktop.application.Application;
import org.jdesktop.application.ApplicationContext;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

// Referenced classes of package desktopapplication1:
//            DesktopApplication1, AnalyticalWriting

public class AnalyticalWritingTable extends JPanel
{
    private class FormListener
        implements ActionListener
    {

        public void actionPerformed(ActionEvent evt)
        {
            if(evt.getSource() == saveButton)
                saveButtonActionPerformed(evt);
            else
            if(evt.getSource() == refreshButton)
                refreshButtonActionPerformed(evt);
            else
            if(evt.getSource() == newButton)
                newButtonActionPerformed(evt);
            else
            if(evt.getSource() == deleteButton)
                deleteButtonActionPerformed(evt);
        }

//        final AnalyticalWritingTable this$0;
//
//        FormListener()
//        {
//            this$0 = AnalyticalWritingTable.this;
//            super();
//        }
    }


    public AnalyticalWritingTable()
    {
        initComponents();
        if(!Beans.isDesignTime())
            entityManager.getTransaction().begin();
    }

    private void initComponents()
    {
        bindingGroup = new BindingGroup();
        ResourceMap resourceMap = ((DesktopApplication1)Application.getInstance(desktopapplication1.DesktopApplication1.class)).getContext().getResourceMap(desktopapplication1.AnalyticalWritingTable.class);
        entityManager = Beans.isDesignTime() ? null : Persistence.createEntityManagerFactory(resourceMap.getString("entityManager.persistenceUnit", new Object[0])).createEntityManager();
        query = Beans.isDesignTime() ? null : entityManager.createQuery(resourceMap.getString("query.query", new Object[0]));
        list = ((java.util.List) (Beans.isDesignTime() ? Collections.emptyList() : ((java.util.List) (ObservableCollections.observableList(query.getResultList())))));
        masterScrollPane = new JScrollPane();
        masterTable = new JTable();
        issuesLabel = new JLabel();
        argumentsLabel = new JLabel();
        issuesExampleLabel = new JLabel();
        argumentsExampleLabel = new JLabel();
        issuesField = new JTextField();
        argumentsField = new JTextField();
        issuesExampleField = new JTextField();
        argumentsExampleField = new JTextField();
        saveButton = new JButton();
        refreshButton = new JButton();
        newButton = new JButton();
        deleteButton = new JButton();
        FormListener formListener = new FormListener();
        setName("Form");
        masterScrollPane.setName("masterScrollPane");
        masterTable.setName("masterTable");
        JTableBinding jTableBinding = SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${issues}"));
        columnBinding.setColumnName("Issues");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${arguments}"));
        columnBinding.setColumnName("Arguments");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${issuesExample}"));
        columnBinding.setColumnName("Issues Example");
        columnBinding.setColumnClass(java.lang.String.class);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${argumentsExample}"));
        columnBinding.setColumnName("Arguments Example");
        columnBinding.setColumnClass(java.lang.String.class);
        bindingGroup.addBinding(jTableBinding);
        masterScrollPane.setViewportView(masterTable);
        issuesLabel.setText(resourceMap.getString("issuesLabel.text", new Object[0]));
        issuesLabel.setName("issuesLabel");
        argumentsLabel.setText(resourceMap.getString("argumentsLabel.text", new Object[0]));
        argumentsLabel.setName("argumentsLabel");
        issuesExampleLabel.setText(resourceMap.getString("issuesExampleLabel.text", new Object[0]));
        issuesExampleLabel.setName("issuesExampleLabel");
        argumentsExampleLabel.setText(resourceMap.getString("argumentsExampleLabel.text", new Object[0]));
        argumentsExampleLabel.setName("argumentsExampleLabel");
        issuesField.setName("issuesField");
        Binding binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.issues}"), issuesField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), issuesField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        argumentsField.setName("argumentsField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.arguments}"), argumentsField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), argumentsField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        issuesExampleField.setName("issuesExampleField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.issuesExample}"), issuesExampleField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), issuesExampleField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        argumentsExampleField.setName("argumentsExampleField");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, ELProperty.create("${selectedElement.argumentsExample}"), argumentsExampleField, BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), argumentsExampleField, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        saveButton.setText(resourceMap.getString("saveButton.text", new Object[0]));
        saveButton.setName("saveButton");
        saveButton.addActionListener(formListener);
        refreshButton.setText(resourceMap.getString("refreshButton.text", new Object[0]));
        refreshButton.setName("refreshButton");
        refreshButton.addActionListener(formListener);
        newButton.setText(resourceMap.getString("newButton.text", new Object[0]));
        newButton.setName("newButton");
        newButton.addActionListener(formListener);
        deleteButton.setText(resourceMap.getString("deleteButton.text", new Object[0]));
        deleteButton.setName("deleteButton");
        binding = Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, ELProperty.create("${selectedElement != null}"), deleteButton, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);
        deleteButton.addActionListener(formListener);
        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(newButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(deleteButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(refreshButton).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(saveButton).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(issuesLabel).addComponent(argumentsLabel).addComponent(issuesExampleLabel).addComponent(argumentsExampleLabel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(issuesField, -1, 315, 32767).addComponent(argumentsField, -1, 315, 32767).addComponent(issuesExampleField, -1, 315, 32767).addComponent(argumentsExampleField, -1, 315, 32767)).addContainerGap()).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, -1, 380, 32767).addContainerGap()));
        layout.linkSize(0, new Component[] {
            deleteButton, newButton, refreshButton, saveButton
        });
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(masterScrollPane, -1, 130, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(issuesLabel).addComponent(issuesField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(argumentsLabel).addComponent(argumentsField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(issuesExampleLabel).addComponent(issuesExampleField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(argumentsExampleLabel).addComponent(argumentsExampleField, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(saveButton).addComponent(refreshButton).addComponent(deleteButton).addComponent(newButton)).addContainerGap()));
        bindingGroup.bind();
    }

    private void refreshButtonActionPerformed(ActionEvent evt)
    {
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        Collection data = query.getResultList();
        Object entity;
        for(Iterator i$ = data.iterator(); i$.hasNext(); entityManager.refresh(entity))
            entity = i$.next();

        list.clear();
        list.addAll(data);
    }

    private void deleteButtonActionPerformed(ActionEvent evt)
    {
        int selected[] = masterTable.getSelectedRows();
        java.util.List toRemove = new ArrayList(selected.length);
        for(int idx = 0; idx < selected.length; idx++)
        {
            AnalyticalWriting a = (AnalyticalWriting)list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(a);
            entityManager.remove(a);
        }

        list.removeAll(toRemove);
    }

    private void newButtonActionPerformed(ActionEvent evt)
    {
        AnalyticalWriting a = new AnalyticalWriting();
        entityManager.persist(a);
        list.add(a);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }

    private void saveButtonActionPerformed(ActionEvent evt)
    {
        try
        {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        }
        catch(RollbackException rex)
        {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            java.util.List merged = new ArrayList(list.size());
            AnalyticalWriting a;
            for(Iterator i$ = list.iterator(); i$.hasNext(); merged.add(entityManager.merge(a)))
                a = (AnalyticalWriting)i$.next();

            list.clear();
            list.addAll(merged);
        }
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                JFrame frame = new JFrame();
                frame.setContentPane(new AnalyticalWritingTable());
                frame.setDefaultCloseOperation(3);
                frame.pack();
                frame.setVisible(true);
            }

        }
);
    }

    private JTextField argumentsExampleField;
    private JLabel argumentsExampleLabel;
    private JTextField argumentsField;
    private JLabel argumentsLabel;
    private JButton deleteButton;
    private EntityManager entityManager;
    private JTextField issuesExampleField;
    private JLabel issuesExampleLabel;
    private JTextField issuesField;
    private JLabel issuesLabel;
    private java.util.List list;
    private JScrollPane masterScrollPane;
    private JTable masterTable;
    private JButton newButton;
    private Query query;
    private JButton refreshButton;
    private JButton saveButton;
    private BindingGroup bindingGroup;








}